package com.nabetama.bridge.display;

// Role: RefinedAbstraction
public class multiPrintDisplay extends Display {

  public multiPrintDisplay(DisplayImpl impl) {
    super(impl);
  }

  public String display() {
    return open() + print() + print() + close();
  }
}
