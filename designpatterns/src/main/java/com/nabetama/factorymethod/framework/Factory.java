package com.nabetama.factorymethod.framework;

public interface Factory<T extends Product> {

  default T create(String owner) {
    T product = createProduct(owner);
    registerProduct(product);
    return product;
  }

  void registerProduct(T product);

  T createProduct(String owner);
}
