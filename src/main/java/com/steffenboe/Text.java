package com.steffenboe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Text {

    private String content;
    private StopwordList stopWordList;

    Text(String content, StopwordList stopWordList) {
        this.content = content;
        this.stopWordList = stopWordList;
    }

    Text(String content) {
        this.content = content;
        this.stopWordList = new EmptyStopWordList();
    }

    int wordCount() throws IOException {
        List<String> words = new ArrayList<>(splitContent());
        removeAllStopwords(words);
        return words.size();
    }

    private void removeAllStopwords(List<String> words) throws IOException {
        for (String stopWord : stopWordList.stopWords()) {
            removeStopword(words, stopWord);
        }
    }

    private void removeStopword(List<String> words, String stopWord) {
        words.removeIf(word -> word.equals(stopWord));
    }

    private List<String> splitContent() {
        return List.of(content.split(" "));
    }

    int wordCountUnique() throws IOException {
        ArrayList<String> words = new ArrayList<>(splitContent());
        removeAllStopwords(words);
        return new HashSet<>(words).size();
    }
    
}
