package com.nabetama.visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

  private final String name;

  private List<Entry> dir = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  String getName() {
    return name;
  }

  @Override
  int getSize() {
    return dir
        .stream()
        .map(Entry::getSize)
        .mapToInt(Integer::intValue)
        .sum();
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Entry add(Entry entry) {
    dir.add(entry);
    return this;
  }
}
