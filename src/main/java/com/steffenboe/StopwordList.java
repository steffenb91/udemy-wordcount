package com.steffenboe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface StopwordList {

    List<String> stopWords() throws IOException;

    class FakeStopWordList implements StopwordList {

        private List<String> fakeStopWords = new ArrayList<>();

        FakeStopWordList(String... stopWords){
            this.fakeStopWords = List.of(stopWords);
        }

        @Override
        public List<String> stopWords() throws IOException {
            return fakeStopWords;
        }
    }
}
