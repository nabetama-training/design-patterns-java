package com.nabetama.builder.product;

public interface Builder {

  Builder createProduct();

  Builder buildPartA(String partA);

  Builder buildPartB(String partB);
}
