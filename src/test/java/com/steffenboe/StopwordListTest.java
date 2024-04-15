package com.steffenboe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class StopwordListTest {

	@Test
	public void shouldReadFromTxtFile() throws IOException {
		StopwordList stopwordList = new StopwordList(new File("src/test/resources/stopwords.txt"));
		assertThat(stopwordList.stopWords(), contains("a"));
	}
}
