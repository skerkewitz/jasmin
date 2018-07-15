/* --- Copyright Jonathan Meyer 1996. All rights reserved. -----------------
 > File:        jasmin/src/jasmin/Assembler.java
 > Purpose:     Runs jasmin.Jasmin, parsing any command line arguments
 > Author:      Jonathan Meyer, 10 July 1996
 */


package jasmin;

import java.io.*;
import java.util.List;

import jas.jasError;
import jas.StackMap;

/**
 * Assembler is the main entry point for jasmin.Jasmin - it supplies the main()
 * method, as well as a few other useful odds and ends.
 */
public class Assembler {

  public static class Config {
    public static final boolean DEBUG = false;

    /* Path for place generated files */
    public String dest_path = null;

    /* Codepage for input files */
    public String encoding = null;

    /* Autogenerate linenumbers */
    public boolean generate_linenum = false;
  }

  private final Config config;

  public Assembler(Config config) {
    this.config = config;
  }

  /**
   * Called to assemble a single file.
   *
   * @param fname is the name of the file containing the jasmin.Jasmin source code.
   */
  public final void assemble(String fname) {
    File out_file = null;
    FileOutputStream outp = null;
    File file = new File(fname);
    ClassFile classFile = new ClassFile();
    String iocause = fname + ": file not found";

    try {
      BufferedReader inp;
      {
        FileInputStream fs = new FileInputStream(fname);
        InputStreamReader ir;
        if (config.encoding == null)
          ir = new InputStreamReader(fs);
        else
          ir = new InputStreamReader(fs, config.encoding);
        inp = new BufferedReader(ir);
      }
      classFile.readJasmin(inp, file.getName(), config.generate_linenum);
      inp.close();

      // if we got some errors, don't output a file - just return.
      if (classFile.errorCount() > 0) {
        System.err.println(fname + ": Found "
                + classFile.errorCount() + " errors");
        return;
      }

      String class_path[] = (ScannerUtils.splitClassField(
              classFile.getClassName()));
      String class_name = class_path[1];

      // determine where to place this class file
      String dest_dir = config.dest_path;
      if (class_path[0] != null) {
        String class_dir = ScannerUtils.convertChars(
                class_path[0], "./",
                File.separatorChar);
        if (dest_dir != null) {
          dest_dir = dest_dir + File.separator + class_dir;
        } else {
          dest_dir = class_dir;
        }
      }
      iocause = class_name + ".class: file can't be created";
      if (dest_dir == null) {
        out_file = new File(class_name + ".class");
      } else {
        out_file = new File(dest_dir, class_name + ".class");

        // check that dest_dir exists

        File dest = new File(dest_dir);
        if (!dest.exists()) {
          dest.mkdirs();
        }

        if (!dest.isDirectory()) {
          throw new IOException("Cannot create directory");
        }
      }

      outp = new FileOutputStream(out_file);
      classFile.write(outp);
      outp.close();
      outp = null; // as marker
      System.out.println("Generated: " + out_file.getPath());

    } catch (java.io.FileNotFoundException e) {
      System.err.println(iocause);
      System.exit(-1);
    } catch (jasError e) {
      classFile.report_error("JAS Error: " + e.getMessage(), e.numTag);
    } catch (Exception e) {
      if (config.DEBUG)
        e.printStackTrace();
      classFile.report_error(fname + ": exception - <" +
              e.getClass().getName() + "> " + e.getMessage() +
              ".");
    }
    if (classFile.errorCount() > 0) {
      System.err.println(fname + ": Found "
              + classFile.errorCount() + " errors");
      if (outp != null) {
        try {
          outp.close();
          out_file.delete();
        } catch (Exception e) {
        }
      }
    }
  }

  public final void run(List<String> args) {
    for (var s : args ) {
      StackMap.reinit();
      assemble(s);
    }
  }
}
