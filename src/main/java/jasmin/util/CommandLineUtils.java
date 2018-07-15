package jasmin.util;

import jasmin.Assembler;

import java.util.ArrayList;
import java.util.List;

public class CommandLineUtils {

  /**
   * The jasmin.Jasmin version
   */
  public static final String version = "v2.4";

  /* Commandline syntax (help) */
  private static final String help1 =
          "usage: jasmin [-d <outpath>] [-g] [-e <encoding>] <file> [<file> ...]\n";
  private static final String help2 =
          "           where   -g - autogenerate linenumbers\n" +
                  "                   -e - codepage for inputfile encoding\n" +
                  "                   -d - path for generated classfiles\n" +
                  "                file  - sourcefile (wildcards are allowed)\n";
  private static final String help3 =
          "   or: jasmin -version\n" +
                  "   or: jasmin -help";

  public static Assembler.Config config = new Assembler.Config();

  private static void unarg_option(String opt) {
    System.err.println("Invaid command line: option " + opt + " required argument");
    System.exit(-1);
  }

  private static void duplicate_option(String opt) {
    System.err.println("Duplicate option " + opt + " ignored");
  }

  public static List<String> run(String[] args) {

    final var sourceFiles = new ArrayList<String>(args.length);

    if (args.length == 0) {
      System.err.println(help1 + help3);
      System.exit(-1);
    }

    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-help") || args[i].equals("-?")) {
        System.err.println(help1 + help2 + help3);
        System.exit(0);
      }
      if (args[i].equals("-version")) {
        System.out.println("jasmin.Jasmin version: " + version);
        if (config.DEBUG)
          System.out.println("(compiled with DEBUG flag on)");
        System.exit(0);
      }
      if (args[i].equals("-g")) {
        config.generateLinenum = true;
      } else if (args[i].equals("-d")) {
        if (++i >= args.length) unarg_option("-d");
        if (config.outputPath != null) duplicate_option("-d");
        else config.outputPath = args[i];
      } else if (args[i].equals("-e")) {
        if (++i >= args.length) unarg_option("-e");
        if (config.encoding != null) duplicate_option("-e");
        else config.encoding = args[i];
      } else {
        sourceFiles.add(args[i]);
      }
    }

    return sourceFiles;
  }
}
