package com.steffenboe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

class StopwordList {

    private File file;

    public StopwordList(File file) {
        this.file = file;
    }

    public List<String> stopWords() throws IOException {
        return Files.readAllLines(file.toPath());
    }
    
}
