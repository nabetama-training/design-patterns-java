package com.nabetama.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

  AbstractFactory abstractFactory1 = new Factory1Impl();
  AbstractFactory abstractFactory2 = new Factory2Impl();

  @Test
  void testFactoryA() {
    assertEquals(
        abstractFactory1.createProductA().getClass().getName(),
        "com.nabetama.abstractfactory.ProductA1");
    assertEquals(
        abstractFactory2.createProductA().getClass().getName(),
        "com.nabetama.abstractfactory.ProductA2");
  }

  @Test
  void testFactoryB() {
    assertEquals(
        abstractFactory1.createProductB().getClass().getName(),
        "com.nabetama.abstractfactory.ProductB1");
    assertEquals(
        abstractFactory2.createProductB().getClass().getName(),
        "com.nabetama.abstractfactory.ProductB2");
  }
}
