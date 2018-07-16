package jasmin.antlr4;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JasminParserUtil {

  private JasminParserUtil() {
    // no instance allowed
  }

  public static final JasminParser parserFromString(String s) throws IOException {
    return parserFromInputStream(new ByteArrayInputStream(s.getBytes()));
  }

  public static final JasminParser parserFromInputStream(InputStream in) throws IOException {
    JasminLexer lexer = new JasminLexer(CharStreams.fromStream(in));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    return new JasminParser(tokens);
  }
}
