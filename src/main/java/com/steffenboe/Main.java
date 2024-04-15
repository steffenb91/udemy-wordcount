package com.steffenboe;

public class Main {
    public static void main(String[] args) {
        Text text = new Text(args[0]);
        System.out.println(String.format("Number of words: %d", text.wordCount()));
    }
}