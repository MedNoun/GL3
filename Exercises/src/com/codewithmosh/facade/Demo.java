package com.codewithmosh.facade;

public class Demo {
  public static void show() {
    var server = new ConnectionService("appKey","Secret");
    var tweets = server.getRecentTweets();
  }
}
