package com.codewithmosh.factory.sharp;

import com.codewithmosh.factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
  @Override
  public String render(String viewName, Map<String, Object> context) {
    return "View rendered by Sharp";
  }
}
