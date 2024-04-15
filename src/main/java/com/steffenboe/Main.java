package com.steffenboe;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Text text = args.length > 1 ? new Text(args[0],
                new TextFileStopwordList(args[1])) : new Text(args[0]);
        int wordCount = 0;
        int uniqueWordCount = 0;
        try {
            wordCount = text.wordCount();
            uniqueWordCount = text.wordCountUnique();
        } catch (IOException e) {
            System.err.println(format("Error occurred while trying to read stopword list: %s", e.getMessage()));
        }
        System.out.println(format("Number of words: %d, unique: %d", wordCount, uniqueWordCount));

    }

    private static String format(String format, Object... args) {
        return String.format(format, args);
    }
}