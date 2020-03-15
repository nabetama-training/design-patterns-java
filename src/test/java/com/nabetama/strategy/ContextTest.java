package com.nabetama.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContextTest {

  @Test
  void contextInterfaceTest() {
    Context context1 = new Context(new ConcreteStrategy1());
    assertEquals("use the algorithm 1", context1.contextInterface());

    Context context2 = new Context(new ConcreteStrategy2());
    assertEquals("use the algorithm 2", context2.contextInterface());

    Context context3 = new Context(new ConcreteStrategy3());
    assertEquals("use the algorithm 3", context3.contextInterface());
  }
}