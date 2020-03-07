package com.nabetama.builder.product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuilderImplTest {

  @Test
  void testBuilder() {
    BuilderImpl builder = new BuilderImpl();
    Director director = new Director(builder);
    director.construct();
    Product product = builder.build();

    assertEquals("A", product.getPartA());
    assertEquals("B", product.getPartB());
  }
}
