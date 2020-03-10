package com.nabetama.abstractfactory.smartphone;

public class PixelFactory implements AbstractSmartPhoneFactory {

  @Override
  public String getVersion() {
    return "10.0";
  }

  @Override
  public String getCpu() {
    return "Snapdragon 845";
  }

  @Override
  public String getDefaultBrowser() {
    return "Android Chrome";
  }
}
