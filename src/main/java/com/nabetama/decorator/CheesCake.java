package com.nabetama.decorator;

public class CheesCake implements Cake {

  @Override
  public String prepare() {
    return "cheese cake";
  }

  @Override
  public int price() {
    return 410;
  }
}
