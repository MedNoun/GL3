package com.codewithmosh.factory;

import com.codewithmosh.factory.matcha.Controller;
import com.codewithmosh.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
  public void listProducts() {
    // Get products from a database
    Map<String, Object> context = new HashMap<>();
    // context.put(products)
    render("products.html", context);
  }
}
