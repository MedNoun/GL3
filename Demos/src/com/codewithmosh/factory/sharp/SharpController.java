package com.codewithmosh.factory.sharp;

import com.codewithmosh.factory.matcha.Controller;
import com.codewithmosh.factory.matcha.ViewEngine;

public class SharpController extends Controller {
  @Override
  protected ViewEngine createViewEngine() {
    return new SharpViewEngine();
  }
}
