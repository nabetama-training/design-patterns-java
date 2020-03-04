package com.nabetama.iterator;

public interface Iterator<E> {

  // 次の要素が存在するかを調べる
  boolean hasNext();

  // 次の要素を得る
  E next();
}
