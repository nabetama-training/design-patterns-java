package com.nabetama.decorator;

public abstract class CakeDecorator implements Cake {

  private final Cake cake;

  protected CakeDecorator(Cake cake) {
    this.cake = cake;
  }

  @Override
  public String prepare() {
    return cake.prepare();
  }

  @Override
  public int price() {
    return cake.price();
  }
}
