package com.steffenboe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TextFileStopwordListTest {

	@Test
	public void shouldReadFromTxtFile() throws IOException {
		TextFileStopwordList stopwordList = new TextFileStopwordList("src/test/resources/stopwords.txt");
		assertThat(stopwordList.stopWords(), contains("a"));
	}
}
