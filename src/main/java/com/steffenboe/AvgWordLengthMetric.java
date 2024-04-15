package com.steffenboe;

import java.io.IOException;

class AvgWordLengthMetric implements Metric {

    private static final String MESSAGE = ", average word length: %,.1f characters";
    private Text text;

    AvgWordLengthMetric(Text text){
        this.text = text;
    }

    public void collect() throws IOException{
        System.out.print(String.format(MESSAGE, text.averageCharacters()));
    }
}
