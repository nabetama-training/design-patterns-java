package com.nabetama.bridge.display;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DisplayTest {

  @Test
  void display() {
    Display display = new Display(new StringDisplayImpl());
    assertEquals("openprintclose", display.display());
  }

  @Test
  void countDisplay() {
    Display display = new multiPrintDisplay(new StringDisplayImpl());
    assertEquals("openprintprintclose", display.display());
  }
}