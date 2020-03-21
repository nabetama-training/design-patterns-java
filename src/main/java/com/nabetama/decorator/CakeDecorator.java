package com.nabetama.decorator;

public abstract class CakeDecorator <E extends Cake> implements Cake {

  private final E cake;

  protected CakeDecorator(E cake) {
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
