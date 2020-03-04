package com.nabetama.templatemethod;

public interface TextBuilder {

  String prefix();

  String middle();

  String suffix();

  default String build() {
    return String.format("%s%s%s", prefix(), middle(), suffix());
  }
}
