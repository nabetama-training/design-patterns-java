package com.nabetama.templatemethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringDisplayTest {

  @Test
  void build() {
    TextBuilder textBuilder = new StringDisplay("foo");

    assertEquals("*foo*", textBuilder.build());
  }
}
