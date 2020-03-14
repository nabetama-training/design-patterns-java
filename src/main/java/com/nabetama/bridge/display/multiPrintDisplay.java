package com.nabetama.bridge.display;

public class multiPrintDisplay extends Display {

  public multiPrintDisplay(DisplayImpl impl) {
    super(impl);
  }

  public String display() {
    return open() + print() + print() + close();
  }
}
