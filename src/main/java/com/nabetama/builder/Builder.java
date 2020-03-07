package com.nabetama.builder;

import java.util.List;

public interface Builder {
  void makeTitle(String s);
  void makeString(String s);
  void makeItems(List<String> items);
  void close();
}
