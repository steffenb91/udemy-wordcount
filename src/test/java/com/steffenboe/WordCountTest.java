package com.steffenboe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordCountTest {

    ByteArrayOutputStream bytes;

    @BeforeEach
    void setOut() {
        bytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bytes));
    }

    @AfterEach
    void resetOut() {
        System.setOut(System.out);
    }

    @Test
    void shouldCountWordsFromCmdLine() {
        Main.main(new String[] { "Mary had a little lamb" });
        assertThat(bytes.toString().strip(),
                is("Number of words: 5, unique: 5, average word length: 3.6 characters"));
    }

    @Test
    void shouldIgnoreStopWords() {
        Main.main(new String[] { "Mary had a little lamb", "src/test/resources/stopwords.txt" });
        assertThat(bytes.toString().strip(), startsWith("Number of words: 4, unique: 4"));
    }

    @Test
    void shouldCountUnique() {
        Main.main(new String[] { "Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall." });
        assertThat(bytes.toString().strip(), startsWith("Number of words: 10, unique: 8"));
    }

}
