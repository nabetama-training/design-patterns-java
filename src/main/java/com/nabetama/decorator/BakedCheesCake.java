package com.nabetama.decorator;

public class BakedCheesCake extends CakeDecorator {

  protected BakedCheesCake(Cake cake) {
    super(cake);
  }

  @Override
  public String prepare() {
    return "baked " + super.prepare();
  }

  @Override
  public int price() {
    return super.price() + 10;
  }
}
