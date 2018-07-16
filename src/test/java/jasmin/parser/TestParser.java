package jasmin.parser;

import jasmin.ast.AstNode;
import jasmin.ast.Builder;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static jasmin.antlr4.JasminParserUtil.parserFromInputStream;

public class TestParser {


  @Test
  void testSingleLanguageFile() throws IOException {

    final var filename = "examples/HelloWorld.j";
    final var classLoader = getClass().getClassLoader();
    final var sourceStream = classLoader.getResource(filename).openStream();

    /* Run each source and compare if with the result. */
    System.out.println("Testing file: " + filename);

    ParseTree tree = parserFromInputStream(sourceStream).compilation_unit();

    AstNode root_node = new Builder().visit(tree);

    System.out.println(root_node);
  }
}
