package com.nabetama.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrintBannerTest {

  @Test
  void testPrintWeak() {
    Banner banner = new Banner("weak");
    Print printBanner = new PrintBanner(banner);

    assertEquals("(weak)", printBanner.printWeak());
  }

  @Test
  void testPrintStrong() {
    Banner banner = new Banner("strong");
    Print printBanner = new PrintBanner(banner);

    assertEquals("*strong*", printBanner.printStrong());
  }
}