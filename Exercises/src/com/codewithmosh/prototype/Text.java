package com.codewithmosh.prototype;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component duplicate() {
        Text new_text = new Text(content);
        return new_text;
    }
}
