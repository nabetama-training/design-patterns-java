package com.nabetama.composite.files;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Entry {

  private final String name;

  private List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;

  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return directory
        .stream()
        .map(Entry::getSize)
        .mapToInt(Integer::intValue)
        .sum();
  }

  @Override
  public Entry add(Entry entry) throws FileTreatmentException {
    directory.add(entry);
    return this;
  }

  @Override
  public String printList() {
    return printList("");
  }

  @Override
  public String printList(String prefix) {
    return directory
        .stream()
        .map(entry -> entry.printList(prefix + entry.getName()))
        .reduce("", String::concat);
  }
}
