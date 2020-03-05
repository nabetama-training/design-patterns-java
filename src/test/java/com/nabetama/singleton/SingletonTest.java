package com.nabetama.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

  @Test
  void getInstance() {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    assertSame(s1, s2);
  }
}
