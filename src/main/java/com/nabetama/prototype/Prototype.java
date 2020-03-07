package com.nabetama.prototype;

public abstract class Prototype implements Cloneable {

  abstract Prototype copy() throws CloneNotSupportedException;
}
