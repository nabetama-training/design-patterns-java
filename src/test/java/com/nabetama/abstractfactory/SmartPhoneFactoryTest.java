package com.nabetama.abstractfactory;

import com.nabetama.abstractfactory.smartphone.AbstractSmartPhoneFactory;
import com.nabetama.abstractfactory.smartphone.Browser;
import com.nabetama.abstractfactory.smartphone.Cpu;
import com.nabetama.abstractfactory.smartphone.IPhoneFactory;
import com.nabetama.abstractfactory.smartphone.PixelFactory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SmartPhoneFactoryTest {

  private AbstractSmartPhoneFactory createSmartPhone(String os) throws IllegalArgumentException{
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
    assertEquals(androidPhone.getCpu().getName(), "Snapdragon 845");
    assertEquals(androidPhone.getDefaultBrowser().getName(), "android Chrome");
  }

  @Test
  void iphoneFactoryTest() {
    // iosを引数に渡せば必ずiPhoneを作ってくれる
    AbstractSmartPhoneFactory iPhone = createSmartPhone("ios");
    assertEquals(iPhone.getCpu().getName(), "A13 Bionic");
    assertEquals(iPhone.getDefaultBrowser().getName(), "mobile Safari");
  }
}
