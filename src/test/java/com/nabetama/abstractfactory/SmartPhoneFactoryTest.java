package com.nabetama.abstractfactory;

import com.nabetama.abstractfactory.smartphone.AbstractSmartPhoneFactory;
import com.nabetama.abstractfactory.smartphone.Browser;
import com.nabetama.abstractfactory.smartphone.Cpu;
import com.nabetama.abstractfactory.smartphone.IPhoneFactory;
import com.nabetama.abstractfactory.smartphone.PixelFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SmartPhoneFactoryTest {

  private AbstractSmartPhoneFactory createSmartPhone(String os) throws IllegalArgumentException {
    switch (os.toUpperCase()) {
      case "IOS":
        return new IPhoneFactory(new Cpu("A13 Bionic"), new Browser("mobile Safari"));
      case "ANDROID":
        return new PixelFactory(new Cpu("Snapdragon 845"), new Browser("android Chrome"));
      default:
        throw new IllegalArgumentException();
    }
  }

  @Test
  void androidFactoryTest() {
    // android を引数に渡せば必ずandroidを作ってくれる
    AbstractSmartPhoneFactory androidPhone = createSmartPhone("android");
    assertEquals("Snapdragon 845", androidPhone.getCpu().getName());
    assertEquals("android Chrome", androidPhone.getDefaultBrowser().getName());
  }

  @Test
  void iphoneFactoryTest() {
    // iosを引数に渡せば必ずiPhoneを作ってくれる
    AbstractSmartPhoneFactory iPhone = createSmartPhone("ios");
    assertEquals("A13 Bionic", iPhone.getCpu().getName());
    assertEquals("mobile Safari", iPhone.getDefaultBrowser().getName());
  }

  @Test
  void illegalArgumentExceptionTest() {
    assertThrows(IllegalArgumentException.class, () -> createSmartPhone("unknown"));
  }
}
