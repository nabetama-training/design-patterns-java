package com.nabetama.visitor;


import com.nabetama.composite.files.Directory;
import com.nabetama.composite.files.File;

/**
 * Declare operation
 */
public interface Visitor {

  void visit(File file);
  void visit(Directory directory);
}
