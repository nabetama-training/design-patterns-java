package com.nabetama.builder.textbuilder;

import java.util.List;

public class TextBuilder implements Builder {

  private final StringBuilder stringBuilder;

  public TextBuilder(StringBuilder stringBuilder) {
    this.stringBuilder = stringBuilder;
  }

  @Override
  public Builder makeTitle(String s) {
    stringBuilder.append(s);
    return this;
  }

  @Override
  public Builder makeString(String s) {
    stringBuilder.append(s);
    return this;
  }

  @Override
  public Builder makeItems(List<String> items) {
    items.forEach(stringBuilder::append);
    return this;
  }

  @Override
  public Builder close() {
    stringBuilder.append(".");
    return this;
  }

  public String build() {
    return stringBuilder.toString();
  }
}
