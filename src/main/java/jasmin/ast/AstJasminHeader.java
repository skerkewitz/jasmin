package jasmin.ast;

import jasmin.antlr4.SourceLocation;

public class AstJasminHeader extends AstNode {

  public final String classname;
  public final String superclass;
  public final boolean isClass;

  public AstJasminHeader(SourceLocation srcLocation, String classname, String superclass, boolean isClass) {
    super(srcLocation);

    this.classname = classname;
    this.superclass = superclass;
    this.isClass = isClass;

    System.out.println("Found class/interface: " + classname);
  }
}
