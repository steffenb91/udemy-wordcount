package com.steffenboe;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

class EmptyStopWordList implements StopwordList {

    @Override
    public List<String> stopWords() throws IOException {
        return Collections.emptyList();
    }

}
