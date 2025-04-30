#!/bin/bash
antlr4='java -jar /usr/local/lib/antlr-4.13.2-complete.jar' 
CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH" 

$antlr4  -visitor CLang.g4 
javac Main.java CLang*.java -Xlint

