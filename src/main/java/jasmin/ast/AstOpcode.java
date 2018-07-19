package jasmin.ast;

import jasmin.InsnInfo;
import jasmin.antlr4.SourceLocation;

public class AstOpcode extends AstInstruction {
  public final InsnInfo insnInfo;

  public AstOpcode(SourceLocation sourceLocation, InsnInfo insnInfo) {
    super(sourceLocation);
    this.insnInfo = insnInfo;
  }
}
