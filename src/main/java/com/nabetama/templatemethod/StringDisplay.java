package com.nabetama.templatemethod;

public class StringDisplay implements TextBuilder {

  private final String text;

  public StringDisplay(String text) {
    this.text = text;
  }

  @Override
  public String prefix() {
    return "*";
  }

  @Override
  public String middle() {
    return text;
  }

  @Override
  public String suffix() {
    return "*";
  }

  @Override
  public String build() {
    return String.format("%s%s%s", prefix(), middle(), suffix());
  }
}
