package com.nabetama.templatemethod;

import java.util.stream.IntStream;

public class Sum1to10Display implements TextBuilder {

  @Override
  public String prefix() {
    return "合計は";
  }

  @Override
  public String middle() {
    return String.format("%d", IntStream.range(0, 11).sum());
  }

  @Override
  public String suffix() {
    return "です";
  }
}
