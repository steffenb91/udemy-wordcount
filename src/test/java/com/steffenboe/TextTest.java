package com.steffenboe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TextTest {

	@Test
	public void shouldCountWords() throws IOException {
		Text text = new Text("Mary had a little lamb");
		assertThat(text.wordCount(), is(5));
	}

	@Test
	public void shouldCountWithStopWords() throws IOException {
		StopwordList fakeStopWordList = new StopwordList.FakeStopWordList("a");
		Text textWithStopwords = new Text(
				"Mary had a little lamb", fakeStopWordList);
		assertThat(textWithStopwords.wordCount(), is(4));
	}

	@Test
	void shouldCountUnique() throws IOException{
		Text text = new Text("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.");
		assertThat(text.wordCountUnique(), is(8));
	}
}
