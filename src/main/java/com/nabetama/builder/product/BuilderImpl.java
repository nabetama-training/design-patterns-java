package com.nabetama.builder.product;

public class BuilderImpl implements Builder {

  private Product product;

  @Override
  public Builder createProduct() {
    this.product = new Product();
    return this;
  }

  @Override
  public Builder buildPartA(String partA) {
    product.setPartA(partA);
    return this;
  }

  @Override
  public Builder buildPartB(String partB) {
    product.setPartB(partB);
    return this;
  }

  public Product build(){
    return product;
  }
}
