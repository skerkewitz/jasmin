package jasmin.ast;

import jasmin.antlr4.SourceLocation;
import jasmin.util.ScannerUtils;

import java.util.List;

public class AstMethodSpec extends AstNode {

  private final String name;
  private final String descriptor;

  public AstMethodSpec(SourceLocation srcLocation, String methodNameAndDescriptor, List<AstStatement> statements) {
    super(srcLocation);
    final String split[] = ScannerUtils.splitMethodSignature(methodNameAndDescriptor);
    this.name = split[0];
    this.descriptor = split[1];

  }
}
