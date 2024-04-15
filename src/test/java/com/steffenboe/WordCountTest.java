package com.steffenboe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordCountTest {

    ByteArrayOutputStream bytes;

    @BeforeEach
    void setOut(){
        bytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bytes));
    }
    
    @AfterEach
    void resetOut() {
        System.setOut(System.out);
        bytes = null;
    }

    @Test
    void shouldCountWordsFromCmdLine() {
        Main.main(new String[] { "Mary had a little lamb" });
        assertThat(bytes.toString(), is("Number of words: 5\r\n"));
    }

    @Test
    void shouldIgnoreStopWords () {
        Main.main(new String[]{ "Mary had a little lamb", "src/test/resources/stopwords.txt"});
        assertThat(bytes.toString(), is("Number of words: 4\r\n"));
    }

}
