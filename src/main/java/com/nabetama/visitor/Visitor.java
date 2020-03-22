package com.nabetama.visitor;


/**
 * Declare operation
 */
public interface Visitor {

  void visit(File file);

  void visit(Directory directory);
}
