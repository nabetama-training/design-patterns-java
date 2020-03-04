package com.nabetama.adapter;

public class Banner {

  private String text;

  public Banner(String text) {
    this.text = text;
  }

  public String showWithParen() {
    return "(" + text + ")";
  }

  public String showWithAster() {
    return "*" + text + "*";
  }
}
