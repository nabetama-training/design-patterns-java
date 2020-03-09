package com.nabetama.abstractfactory;

public class Factory2Impl implements AbstractFactory {

  @Override
  public AbstractProductA createProductA() {
    return new ProductA2();
  }

  @Override
  public AbstractProductB createProductB() {
    return new ProductB2();
  }
}
