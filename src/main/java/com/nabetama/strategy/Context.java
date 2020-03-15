package com.nabetama.strategy;

public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  protected String contextInterface() {
    return this.strategy.algorithm();
  }
}
