package jasmin.ast;

import jasmin.antlr4.SourceLocation;

import java.util.List;

public class AstCompilationUnit extends AstNode {

  public final AstJasminHeader header;
  public final List<AstMethodSpec> methods;

  public AstCompilationUnit(SourceLocation srcLocation, AstJasminHeader header, List<AstMethodSpec> methods) {
    super(srcLocation);
    this.header = header;
    this.methods = methods;
  }
}
