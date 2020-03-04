package com.nabetama.templatemethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sum1to10DisplayTest {

  @Test
  void build() {
    TextBuilder textBuilder = new Sum1to10Display();

    assertEquals("合計は55です", textBuilder.build());
  }
}