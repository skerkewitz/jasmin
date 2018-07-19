; --- Copyright Jonathan Meyer 1996. All rights reserved. -----------------
; File:      jasmin/examples/HelloWorld.j
; Author:    Jonathan Meyer, 10 July 1996
; Purpose:   Prints out "Hello World!"
; -------------------------------------------------------------------------


.class public examples.HelloWorld
.super java/lang/Object

;
; standard initializer
.method public <init>()V
   aload            0
 
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack 2
  .limit locals 2


  getstatic      java/lang/System/out Ljava/io/PrintStream;
  ldc            "Hello World."
  invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V

  return
.end method
