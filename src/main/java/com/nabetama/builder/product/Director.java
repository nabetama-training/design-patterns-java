package com.nabetama.builder.product;

public class Director {

  private final Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.createProduct().buildPartA("A").buildPartB("B");
  }
}
