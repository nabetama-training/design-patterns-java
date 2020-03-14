package com.nabetama.abstractfactory.smartphone;

import lombok.Data;

@Data
public class Cpu {

  public Cpu(String name) {
    this.name = name;
  }

  private final String name;
}
