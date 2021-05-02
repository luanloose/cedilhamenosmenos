.source prog_destino.java
.class public prog_destino
.super java/lang/Object
.method public <init>()V
.limit stack 1
.limit locals 1
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 4
.limit locals 100
ldc2_w 5.0
dstore 1
ldc2_w 6.0
dstore 3
ldc2_w 4.0
dstore 5
dload 1
ldc2_w 10.0
dadd
dload 3
dadd
ldc2_w 20.0
dadd
dload 5
dadd
ldc2_w 9.0
dadd
dstore 7
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 1
invokevirtual java/io/PrintStream/println(D)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 3
invokevirtual java/io/PrintStream/println(D)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/println(D)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 7
invokevirtual java/io/PrintStream/println(D)V
return
.end method
