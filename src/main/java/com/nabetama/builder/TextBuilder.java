package com.nabetama.builder;

import java.util.List;

public class TextBuilder implements Builder {

  private final StringBuilder stringBuilder;

  public TextBuilder(StringBuilder stringBuilder) {
    this.stringBuilder = stringBuilder;
  }

  @Override
  public void makeTitle(String s) {
    stringBuilder.append(s);
  }

  @Override
  public void makeString(String s) {
    stringBuilder.append(s);
  }

  @Override
  public void makeItems(List<String> items) {
    items.forEach(stringBuilder::append);
  }

  @Override
  public void close() {
    stringBuilder.append(".");
  }

  public String build() {
    return stringBuilder.toString();
  }
}
