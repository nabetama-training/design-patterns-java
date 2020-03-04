package com.nabetama.factorymethod.idcard;

import com.nabetama.factorymethod.framework.Factory;
import java.util.ArrayList;
import java.util.List;

public class IDCardFactory implements Factory<IDCard> {

  private List<String> owners = new ArrayList<>();

  @Override
  public IDCard create(String owner) {
    return new IDCard(owner);
  }

  @Override
  public void registerProduct(IDCard idCard) {
    owners.add(idCard.getOwner());
  }

  @Override
  public IDCard createProduct(String owner) {
    return new IDCard(owner);
  }

  public List<String> getOwners() {
    return owners;
  }
}
