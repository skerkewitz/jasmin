package jasmin.ast;

import jasmin.antlr4.JasminParser;
import jasmin.antlr4.SourceLocation;
import jasmin.util.ScannerUtils;
import org.antlr.v4.runtime.Token;

public class AstClassDeclaration extends AstNode {
  public final JasminParser.AccessContext a;
  public final String classname;
  public final boolean isClass;
  private final String packageName;

  public AstClassDeclaration(SourceLocation sourceLocation, JasminParser.AccessContext a, String classname, boolean isClass) {
    super(sourceLocation);
    this.a = a;
    String[] splitClassField = ScannerUtils.splitClassField(classname);
    this.packageName = splitClassField[0];
    this.classname = splitClassField[1];
    this.isClass = isClass;
  }
}
