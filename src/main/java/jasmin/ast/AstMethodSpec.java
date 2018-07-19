package jasmin.ast;

import jasmin.antlr4.SourceLocation;
import jasmin.util.ScannerUtils;

import java.util.List;

public class AstMethodSpec extends AstNode {

  public final String name;
  public final String descriptor;
  public final List<AstStatement> statements;

  public AstMethodSpec(SourceLocation srcLocation, String methodNameAndDescriptor, List<AstStatement> statements) {
    super(srcLocation);
    this.statements = statements;
    final String split[] = ScannerUtils.splitMethodSignature(methodNameAndDescriptor);
    this.name = split[0];
    this.descriptor = split[1];

  }
}
