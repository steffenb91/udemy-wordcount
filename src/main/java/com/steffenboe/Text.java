package com.steffenboe;

public class Text {

    private String content;

    public Text(String content) {
        this.content = content;
    }

    public int wordCount() {
        return content.split(" ").length;
    }
    
}
