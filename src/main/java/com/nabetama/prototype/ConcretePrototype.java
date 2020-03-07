package com.nabetama.prototype;

public class ConcretePrototype extends Prototype {

  @Override
  Prototype copy() throws CloneNotSupportedException {
    return (Prototype) clone();
  }
}
