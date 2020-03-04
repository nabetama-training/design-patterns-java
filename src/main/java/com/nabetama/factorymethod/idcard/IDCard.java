package com.nabetama.factorymethod.idcard;

import com.nabetama.factorymethod.framework.Product;

public class IDCard implements Product {

  private final String owner;

  public IDCard(String owner) {
    this.owner = owner;
  }

  @Override
  public String use() {
    return "It will be making card that owned by " + owner;
  }

  public String getOwner() {
    return owner;
  }
}
