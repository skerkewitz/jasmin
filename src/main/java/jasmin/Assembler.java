/* --- Copyright Jonathan Meyer 1996. All rights reserved. -----------------
 > File:        jasmin/src/jasmin/Assembler.java
 > Purpose:     Runs jasmin.Jasmin, parsing any command line arguments
 > Author:      Jonathan Meyer, 10 July 1996
 */


package jasmin;

import java.io.*;
import java.util.List;

import jas.StackMap;
import jasmin.util.ScannerUtils;
import jasmin.util.Utils;
import java_cup.internal_error;

/**
 * Assembler is the main entry point for jasmin.Jasmin - it supplies the main()
 * method, as well as a few other useful odds and ends.
 */
public class Assembler {

  public static class Config {
    public final boolean DEBUG = false;

    /** Path for place generated files */
    public String outputPath = null;

    /** Codepage for input files */
    public String encoding = null;

    /** Autogenerate linenumbers */
    public boolean generateLinenum = false;
  }

  public static class BytecodeClass {
    /** The fully qualified name of the class (using '/' syntax). '*/
    public final String classname;

    /** The bytecode representation of the class a byte array. */
    public final byte[] bytecode;

    public BytecodeClass(String classname, byte[] bytecode) {
      this.classname = classname;
      this.bytecode = bytecode;
    }
  }


  /**
   * Called to assemble a single file.
   *
   * @param filename is the name of the file containing the jasmin.Jasmin source code.
   * @param config
   */
  public static void assemble(String filename, Config config) throws IOException {

    final File file = new File(filename);
    try (Reader inReader = Utils.getBufferReaderForFile(filename, config.encoding)) {
      BytecodeClass bytecodeClass = assemble(inReader, file.getName(), config);
      try (OutputStream outp = streamFromClass(bytecodeClass.classname, config.outputPath)) {
        outp.write(bytecodeClass.bytecode);
      }
    }
  }

  /**
   * Called to assemble a single file.
   *  @param sourceFileName is the name of the file containing the jasmin.Jasmin source code.
   * @param config
   */
  public static BytecodeClass assemble(Reader inp, String sourceFileName, Config config) throws IOException {

    ClassFile classFile = new ClassFile();

    try {
      classFile.readJasmin(inp, sourceFileName, config.generateLinenum);
    } catch (jas.jasError | internal_error e) {
      throw new RuntimeException("Error processing file " + sourceFileName + " because of: " + e, e);
    }

    /* if we got some errors, don't output a file - just return. */
    if (classFile.errorCount() > 0) {
      throw new RuntimeException("Error processing file " + sourceFileName + ", found " + classFile.errorCount() + " errors in file");
    }

    var outputStream = new ByteArrayOutputStream(2048);
    try {
      classFile.write(outputStream);
    } catch (jas.jasError e) {
      throw new RuntimeException("Error processing file " + sourceFileName + " because of: " + e, e);
    }
    return new BytecodeClass(classFile.getClassName(), outputStream.toByteArray());
  }

  private static OutputStream streamFromClass(String fqnClassName, String outputDirectory) throws IOException {

    if (outputDirectory == null) {
      throw new IllegalArgumentException("Output directory can not be null");
    }

    String class_path[] = (ScannerUtils.splitClassField(fqnClassName));
    String className = class_path[1];
    String classPath = class_path[0];

    // determine where to place this class file
    String dest_dir = outputDirectory;

    return Utils.createFileOutputStream(className, classPath, dest_dir);
  }

  public static void assembleAll(List<String> args, Config config) {
    for (var s : args) {
      StackMap.reinit();
      try {
        assemble(s, config);
      } catch (IOException e) {
        System.err.println("Skipping process of file: " + s + " because of: " + e);
      }
    }
  }
}
