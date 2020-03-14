package com.nabetama.bridge.display;

public class Display {
  private DisplayImpl impl;

  public Display(DisplayImpl impl) {
    this.impl = impl;
  }

  public String open() {
    return impl.rawOpen();
  }

  public String print() {
    return impl.rawPrint();
  }

  public String close() {
    return impl.rawClose();
  }

  public String display() {
    return open() + print() + close();
  }
}
