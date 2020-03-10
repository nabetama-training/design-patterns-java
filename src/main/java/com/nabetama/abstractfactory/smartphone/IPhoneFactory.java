package com.nabetama.abstractfactory.smartphone;

public class IPhoneFactory implements AbstractSmartPhoneFactory {

  @Override
  public String getVersion() {
    return "11";
  }

  @Override
  public String getCpu() {
    return "A13 Bionic";
  }

  @Override
  public String getDefaultBrowser() {
    return "mobile Safari";
  }
}
