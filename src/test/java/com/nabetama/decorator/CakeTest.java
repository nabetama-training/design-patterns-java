package com.nabetama.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CakeTest {

  @Test
  void testPrepqreCake() {
    Cake cheesCake = new CheesCake();
    assertEquals("cheese cake", cheesCake.prepare());
    assertEquals(410, cheesCake.price());
  }

  @Test
  void testDecoratedCheesCake() {
    CheesCake cheesCake = new CheesCake();
    assertEquals("cheese cake", cheesCake.prepare());
    assertEquals(410, cheesCake.price());

    Cake bakedCheesCake = new BakedCheesCake<CheesCake>(cheesCake);
    assertEquals("baked cheese cake", bakedCheesCake.prepare());
    assertEquals(420, bakedCheesCake.price());
  }
}