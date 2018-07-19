package jasmin.ast;

import jasmin.InsnInfo;
import jasmin.antlr4.SourceLocation;

public class AstOpcodeInt extends AstInstruction {
  public final InsnInfo insnInfo;
  public final int n;

  public AstOpcodeInt(SourceLocation sourceLocation, InsnInfo insnInfo, int n) {
    super(sourceLocation);
    this.insnInfo = insnInfo;
    this.n = n;
  }
}
