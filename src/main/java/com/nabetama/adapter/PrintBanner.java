package com.nabetama.adapter;

public class PrintBanner extends Print {

  private Banner banner;

  public PrintBanner(Banner banner) {
    this.banner = banner;
  }

  @Override
  public String printWeak() {
    return banner.showWithParen();
  }

  @Override
  public String printStrong() {
    return banner.showWithAster();
  }
}
