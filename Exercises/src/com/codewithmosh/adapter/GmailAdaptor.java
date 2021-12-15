package com.codewithmosh.adapter;

import com.codewithmosh.adapter.Gmail.GmailClient;

public class GmailAdaptor implements EmailProvider{
    private GmailClient client;
    public GmailAdaptor(GmailClient client) {
        this.client = client;
    }
    {}
    @Override
    public void downloadEmails() {
        
        client.getEmails();
        
    }
    
    @Override
    public void connect() {
        client.connect();
        
    }
    @Override
    public void disconnect() {
        client.disconnect();
        
    }
    
}
