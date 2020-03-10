package com.nabetama.abstractfactory.smartphone;

public interface AbstractSmartPhoneFactory {

  Cpu getCpu();

  Browser getDefaultBrowser();
}
