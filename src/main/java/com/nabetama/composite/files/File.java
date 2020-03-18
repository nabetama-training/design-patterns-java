package com.nabetama.composite.files;

public class File implements Entry {

  private final String name;
  private final int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  @Override
  public String printList() {
    return "";
  }

  @Override
  public String printList(String prefix) {
    return prefix + "/" + this;
  }

  @Override
  public String toString() {
    return "File{" +
        "name='" + name + '\'' +
        ", size=" + size +
        '}';
  }
}
