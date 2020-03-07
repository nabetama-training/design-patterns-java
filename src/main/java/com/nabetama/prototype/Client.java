package com.nabetama.prototype;

public class Client {
  private final Prototype prototype;

  public Client(Prototype prototype) {
    this.prototype = prototype;
  }

  public Prototype copy() throws CloneNotSupportedException {
    return prototype.copy();
  }
}
