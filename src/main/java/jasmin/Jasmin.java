package jasmin;

import jasmin.util.CommandLineUtils;

import java.util.List;

/** Just a bootstrap class. */
public class Jasmin {
  public static void main(String args[]) {

    final List<String> sourceFiles = CommandLineUtils.run(args);
    Assembler.assembleAll(sourceFiles, CommandLineUtils.config);
  }
}
