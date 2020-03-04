package com.nabetama.factorymethod.idcard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IDCardTest {

  @Test
  void testInterface() {
    IDCard idCard = new IDCard("nabetama");
    assertEquals("nabetama", idCard.getOwner());
    assertEquals("It will be making card that owned by nabetama", idCard.use());
  }
}
