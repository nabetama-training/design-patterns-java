package com.nabetama.builder;

import static org.junit.jupiter.api.Assertions.*;

import com.nabetama.builder.textbuilder.Director;
import com.nabetama.builder.textbuilder.TextBuilder;
import org.junit.jupiter.api.Test;

class TextBuilderTest {

  @Test
  void build() {
    TextBuilder textBuilder = new TextBuilder(new StringBuilder());
    Director director = new Director(textBuilder);
    director.construct();
    assertEquals("titlestring1abcstring2.", textBuilder.build());
  }
}