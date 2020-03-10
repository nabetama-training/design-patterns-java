package com.nabetama.abstractfactory.smartphone;

public class PixelFactory implements AbstractSmartPhoneFactory {

  private final Cpu cpu;

  private final Browser browser;

  public PixelFactory(Cpu cpu, Browser browser) {
    this.cpu = cpu;
    this.browser = browser;
  }

  @Override
  public Cpu getCpu() {
    return cpu;
  }

  @Override
  public Browser getDefaultBrowser() {
    return browser;
  }
}
