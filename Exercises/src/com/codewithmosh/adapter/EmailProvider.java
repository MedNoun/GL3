package com.codewithmosh.adapter;

public interface EmailProvider {
  void downloadEmails();
  void connect();
  void disconnect();
}
