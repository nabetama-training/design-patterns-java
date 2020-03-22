package com.nabetama.visitor;

import com.nabetama.composite.files.FileTreatmentException;
import lombok.Data;

@Data
public abstract class Entry implements Element {

  abstract String getName();

  abstract int getSize();

  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }
}
