package com.nabetama.decorator;

public class BakedCheesCake<C> extends CakeDecorator<CheesCake> {

  protected BakedCheesCake(CheesCake cake) {
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
