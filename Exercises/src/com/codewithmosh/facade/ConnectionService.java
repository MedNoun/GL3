package com.codewithmosh.facade;

import java.util.List;

public class ConnectionService {
    private String appKey;
    private String secret;

    public ConnectionService(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }
    public TwitterClient getClient(){
        return new TwitterClient();
    }
    public List<Tweet> getRecentTweets(){
        var client = this.getClient();
        return client.getRecentTweets(this.getAccessToken());
    }
    public String getAccessToken(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, secret);
        var accessToken = oauth.getAccessToken(requestToken);
        return accessToken;
    }
}
