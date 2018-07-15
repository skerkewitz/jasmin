package jasmin;

import java.util.List;

public class Jasmin {
  public static void main(String args[]) {

    final List<String> sourceFiles = CommandLineUtils.run(args);
    final Assembler assembler = new Assembler(CommandLineUtils.config);
    assembler.run(sourceFiles);
  }
}
