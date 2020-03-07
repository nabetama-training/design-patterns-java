package com.nabetama.builder.textbuilder;

import java.util.Arrays;

public class Director {

  private final Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder
        .makeTitle("title")
        .makeString("string1")
        .makeItems(Arrays.asList("a", "b", "c"))
        .makeString("string2")
        .close();
  }
}
