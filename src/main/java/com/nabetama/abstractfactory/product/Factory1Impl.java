package com.nabetama.abstractfactory.product;

public class Factory1Impl implements AbstractFactory {

  @Override
  public AbstractProductA createProductA() {
    return new ProductA1();
  }

  @Override
  public AbstractProductB createProductB() {
    return new ProductB1();
  }
}
