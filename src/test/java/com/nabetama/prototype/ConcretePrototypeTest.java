package com.nabetama.prototype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcretePrototypeTest {

  @Test
  void use() throws CloneNotSupportedException {
    Prototype prototype = new ConcretePrototype();

    Client client = new Client(prototype);

    Prototype prototypeClone = client.copy();
    assertNotEquals(prototype, prototypeClone);
  }
}
