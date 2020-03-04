package com.nabetama.factorymethod.idcard;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class IDCardFactoryTest {

  @Test
  void createProduct() {
    IDCardFactory factory = new IDCardFactory();
    IDCard idCard = factory.create("nabetama");

    assertEquals("nabetama", idCard.getOwner());
  }

  @Test
  void registerProduct() {
    IDCardFactory factory = new IDCardFactory();
    IDCard idCard1 = factory.create("foo");
    IDCard idCard2 = factory.create("bar");
    factory.registerProduct(idCard1);
    factory.registerProduct(idCard2);

    assertEquals("foo", idCard1.getOwner());
    assertEquals("bar", idCard2.getOwner());
    assertEquals(Arrays.asList("foo", "bar"), factory.getOwners());
  }
}