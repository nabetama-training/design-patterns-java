package com.nabetama.builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {

  private final Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct(){
    builder.makeTitle("title");
    builder.makeString("string1");
    builder.makeItems(Arrays.asList("a", "b", "c"));
    builder.makeString("string2");
    builder.close();
  }
}
