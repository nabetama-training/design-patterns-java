package com.nabetama.visitor;

public interface Element {

  void accept(Visitor visitor);
}
