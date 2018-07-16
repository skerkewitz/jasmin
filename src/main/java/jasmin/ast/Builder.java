package jasmin.ast;

import jasmin.InsnInfo;
import jasmin.antlr4.JasminBaseVisitor;
import jasmin.antlr4.JasminParser;
import jasmin.antlr4.SourceLocation;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.stream.Collectors;

public class Builder extends JasminBaseVisitor<AstNode> {

  /* Util method. */
  private <T> T visit(RuleContext ctx, Class<T> type) {
    if (ctx == null) {
      return null;
    }

    return type.cast(visit(ctx));
  }

  @Override
  public AstNode visitCompilation_unit(JasminParser.Compilation_unitContext ctx) {

    AstNode header = visit(ctx.jasmin_header());
    List<AstMethodSpec> methods = ctx.method_spec()
            .stream()
            .map(c -> visit(c, AstMethodSpec.class))
            .collect(Collectors.toList());

    return new AstCompilationUnit(SourceLocation.fromContext(ctx), header, methods);
  }

  @Override
  public AstNode visitMethod_spec(JasminParser.Method_specContext ctx) {

    var methodNameAndDescriptor = ctx.name.getText();

    List<AstStatement> statements = ctx.statement()
            .stream()
            .map(c -> visit(c, AstStatement.class))
            .collect(Collectors.toList());

    return new AstMethodSpec(SourceLocation.fromContext(ctx), methodNameAndDescriptor, statements);
  }


  @Override
  public AstNode visitInstructionStatement(JasminParser.InstructionStatementContext ctx) {
    return visit(ctx.instruction(), AstInstruction.class);
  }

  @Override
  public AstNode visitOpcode(JasminParser.OpcodeContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeInt(JasminParser.OpcodeIntContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeIntInt(JasminParser.OpcodeIntIntContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeFloat(JasminParser.OpcodeFloatContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeWord(JasminParser.OpcodeWordContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeWordInt(JasminParser.OpcodeWordIntContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeWordWord(JasminParser.OpcodeWordWordContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeString(JasminParser.OpcodeStringContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }

  @Override
  public AstNode visitOpcodeRelative(JasminParser.OpcodeRelativeContext ctx) {
    return new AstOpcode(SourceLocation.fromContext(ctx), InsnInfo.get(ctx.getText()));
  }
}
