package com.nabetama.abstractfactory.smartphone;

import lombok.Data;
import lombok.Getter;

@Data
public class Cpu {

  public Cpu(String name) {
    this.name = name;
  }

  private String name;
}
