package com.steffenboe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class TextFileStopwordList implements StopwordList{

    private String path;

    TextFileStopwordList(String path) {
        this.path = path;
    }

    public List<String> stopWords() throws IOException {
        return Files.readAllLines(Path.of(path));
    }
    
}
