package com.nabetama.abstractfactory.smartphone;

import lombok.Data;

@Data
public abstract class Browser {

  private String name;

  protected Browser(String name) {
    this.name = name;
  }
}
