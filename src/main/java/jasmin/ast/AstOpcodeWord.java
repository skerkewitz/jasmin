package jasmin.ast;

import jasmin.InsnInfo;
import jasmin.antlr4.SourceLocation;

public class AstOpcodeWord extends AstInstruction {
  public final InsnInfo insnInfo;
  public final String w;

  public AstOpcodeWord(SourceLocation sourceLocation, InsnInfo insnInfo, String w) {
    super(sourceLocation);
    this.insnInfo = insnInfo;
    this.w = w;
  }
}
