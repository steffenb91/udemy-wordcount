package com.steffenboe;

import java.io.IOException;

class NumberOfWordsMetric implements Metric {

    private static final String MESSAGE = "Number of words: %d, ";
    private Text text;

    NumberOfWordsMetric(Text text){
        this.text = text;
    }

    public void collect() throws IOException{
        System.out.print(String.format(MESSAGE, text.wordCount()));
    }
}
