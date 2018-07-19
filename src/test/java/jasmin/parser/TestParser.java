package jasmin.parser;

import jasmin.InsnInfo;
import jasmin.ast.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static jasmin.antlr4.JasminParserUtil.parserFromInputStream;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.V1_1;

public class TestParser {


  @Test
  void testSingleLanguageFile() throws IOException {

    final var filename = "examples/HelloWorld.j";
    final var classLoader = getClass().getClassLoader();
    final var sourceStream = classLoader.getResource(filename).openStream();

    /* Run each source and compare if with the result. */
    System.out.println("Testing file: " + filename);

    ParseTree tree = parserFromInputStream(sourceStream).compilation_unit();

    AstCompilationUnit root_node = (AstCompilationUnit)new Builder().visit(tree);

    System.out.println(root_node);

    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

    classWriter.visit(V1_1, ACC_PUBLIC, root_node.header.classname, null, root_node.header.superclass, null);


    for (var method : root_node.methods) {
      MethodVisitor methodVisitor = classWriter.visitMethod(ACC_PUBLIC, method.name, method.descriptor, null, null);

      for (var statements : method.statements) {

        if (statements instanceof AstOpcode) {
          var opcode = (AstOpcode) statements;
           System.out.println(opcode.insnInfo.name);
          methodVisitor.visitInsn(opcode.insnInfo.opcode);
        }
        else if (statements instanceof AstOpcodeInt) {
          var opcode = (AstOpcodeInt) statements;
          System.out.println(opcode.insnInfo.name);
          methodVisitor.visitIntInsn(opcode.insnInfo.opcode, opcode.n);
        }
        else if (statements instanceof AstOpcodeWord) {
          var opcode = (AstOpcodeWord) statements;
          System.out.println(opcode.insnInfo.name);
          methodVisitor.visitIntInsn(opcode.insnInfo.opcode, opcode.w);
        }


//        statements.

      }
    }



    byte[] bytes = classWriter.toByteArray();
    new File("out/examples/").mkdirs();
    File file = new File("out/examples/HelloWorld.class");
    new FileOutputStream(file).write(bytes);
  }
}
