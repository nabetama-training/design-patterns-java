package com.nabetama.abstractfactory.smartphone;

import lombok.Data;

@Data
public class Browser {

  private String name;

  public Browser(String name) {
    this.name = name;
  }
}
