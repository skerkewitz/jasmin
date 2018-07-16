package jasmin.ast;

import jasmin.antlr4.SourceLocation;

import java.util.List;

public class AstCompilationUnit extends AstNode {

  public AstCompilationUnit(SourceLocation srcLocation, AstNode header, List<AstMethodSpec> methods) {
    super(srcLocation);
  }
}
