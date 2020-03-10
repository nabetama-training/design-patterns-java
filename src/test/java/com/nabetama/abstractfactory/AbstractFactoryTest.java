package com.nabetama.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import com.nabetama.abstractfactory.product.AbstractFactory;
import com.nabetama.abstractfactory.product.Factory1Impl;
import com.nabetama.abstractfactory.product.Factory2Impl;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

  AbstractFactory abstractFactory1 = new Factory1Impl();
  AbstractFactory abstractFactory2 = new Factory2Impl();

  @Test
  void testFactoryA() {
    assertEquals(
        abstractFactory1.createProductA().getClass().getName(),
        "com.nabetama.abstractfactory.product.ProductA1");
    assertEquals(
        abstractFactory2.createProductA().getClass().getName(),
        "com.nabetama.abstractfactory.product.ProductA2");
  }

  @Test
  void testFactoryB() {
    assertEquals(
        abstractFactory1.createProductB().getClass().getName(),
        "com.nabetama.abstractfactory.product.ProductB1");
    assertEquals(
        abstractFactory2.createProductB().getClass().getName(),
        "com.nabetama.abstractfactory.product.ProductB2");
  }
}
