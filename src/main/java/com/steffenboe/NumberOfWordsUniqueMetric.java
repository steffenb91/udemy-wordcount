package com.steffenboe;

import java.io.IOException;

class NumberOfWordsUniqueMetric implements Metric {

    private static final String MESSAGE = "unique: %d";
    private Text text;

    NumberOfWordsUniqueMetric(Text text){
        this.text = text;
    }

    public void collect() throws IOException {
        System.out.print(String.format(MESSAGE, text.wordCountUnique()));
    }
}
