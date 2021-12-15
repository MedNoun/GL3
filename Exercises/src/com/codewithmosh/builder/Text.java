package com.codewithmosh.builder;

public class Text implements Element, FormatBuilder {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void export() {
        // TODO Auto-generated method stub
        
    }
}
