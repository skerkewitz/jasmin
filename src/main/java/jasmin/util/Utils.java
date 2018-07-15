package jasmin.util;

import java.io.*;

public class Utils {
  public static BufferedReader getBufferReaderForFile(String fname, String encoding) throws FileNotFoundException, UnsupportedEncodingException {
    FileInputStream fs = new FileInputStream(fname);
    InputStreamReader ir = encoding == null ? new InputStreamReader(fs) : new InputStreamReader(fs, encoding);
    return new BufferedReader(ir);
  }


  /**
   * Converts any occurrences of characters 'chars' in 'input' by 'toChar'.
   */
  public static String convertAllChars(String input, String chars, char toChar) {
    var output = new StringBuilder(input);
    for (int i = 0; i < output.length(); i++) {
      if (chars.indexOf(output.charAt(i)) != -1) {
        output.setCharAt(i, toChar);
      }
    }
    return output.toString();
  }

  public static OutputStream createFileOutputStream(String className, String classPath, String outputDirectory) throws IOException {

    final String destDir = classPath == null
            ? outputDirectory
            : outputDirectory + File.separator + convertAllChars(classPath, "./", File.separatorChar);

    final File out_file = new File(destDir, className + ".class");

    // check that destDir exists
    File dest = new File(destDir);
    if (!dest.exists()) {
      if (!dest.mkdirs()) {
        throw new IOException("Cannot create directory");
      }
    }

    if (!dest.isDirectory()) {
      throw new IOException("Cannot create directory");
    }

    System.out.println("Generated: " + out_file.getPath());
    return new FileOutputStream(out_file);
  }
}
