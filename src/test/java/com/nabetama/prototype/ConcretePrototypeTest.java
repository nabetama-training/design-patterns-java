package com.nabetama.prototype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcretePrototypeTest {

  @Test
  void use() throws CloneNotSupportedException {
    Prototype prototype = new ConcretePrototype();

    User user = new User(prototype);

    Prototype prototypeClone = user.copy();
    assertNotEquals(prototype, prototypeClone);
  }
}
