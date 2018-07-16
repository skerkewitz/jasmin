package jasmin.ast;

import jasmin.InsnInfo;
import jasmin.antlr4.SourceLocation;

public class AstOpcode extends AstInstruction {
  private final InsnInfo insnInfo;

  public AstOpcode(SourceLocation sourceLocation, InsnInfo insnInfo) {
    super(sourceLocation);
    this.insnInfo = insnInfo;
  }
}
