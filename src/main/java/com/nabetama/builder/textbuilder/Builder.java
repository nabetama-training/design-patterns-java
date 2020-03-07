package com.nabetama.builder.textbuilder;

import java.util.List;

public interface Builder {
  void makeTitle(String s);
  void makeString(String s);
  void makeItems(List<String> items);
  void close();
}
