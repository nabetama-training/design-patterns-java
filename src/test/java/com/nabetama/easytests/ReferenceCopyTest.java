package com.nabetama.easytests;

import com.nabetama.builder.product.Product;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReferenceCopyTest {

  private void setFoo(Product product) {
    product.setPartB("foo");
  }

  @Test
  void testReferenceCopy() {
    Product product = new Product();
    product.setPartB("bar");
    setFoo(product);

    assertEquals("foo", product.getPartB());
  }

  private void bar(String s) {
    s = "bar";
  }

  @Test
  void testValue() {
    String foo = "foo";
    bar(foo);
    assertEquals("foo", foo);
  }
}
