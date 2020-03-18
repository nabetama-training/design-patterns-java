package com.nabetama.composite.files;

public interface Entry {

  String getName();

  int getSize();

  Entry add(Entry entry) throws FileTreatmentException;

  String printList();

  String printList(String prefix);

  String toString();
}
