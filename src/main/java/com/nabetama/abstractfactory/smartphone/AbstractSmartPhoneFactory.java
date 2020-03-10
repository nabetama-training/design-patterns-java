package com.nabetama.abstractfactory.smartphone;

public interface AbstractSmartPhoneFactory {
  String getVersion();

  String getCpu();

  String getDefaultBrowser();
}
