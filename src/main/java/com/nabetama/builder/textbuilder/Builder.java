package com.nabetama.builder.textbuilder;

import java.util.List;

public interface Builder {
  Builder makeTitle(String s);
  Builder makeString(String s);
  Builder makeItems(List<String> items);
  Builder close();
}
