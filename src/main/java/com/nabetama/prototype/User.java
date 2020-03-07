package com.nabetama.prototype;

public class User {
  private final Prototype prototype;

  public User(Prototype prototype) {
    this.prototype = prototype;
  }

  public Prototype copy() throws CloneNotSupportedException {
    return prototype.copy();
  }
}
