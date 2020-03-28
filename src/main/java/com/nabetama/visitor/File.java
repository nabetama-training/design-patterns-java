package com.nabetama.visitor;

public class File extends Entry {

  private final String name;

  private final int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  String getName() {
    return name;
  }

  @Override
  int getSize() {
    return size;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
