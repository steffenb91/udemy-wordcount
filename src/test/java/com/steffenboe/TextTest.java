package com.steffenboe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class TextTest {

	@Test
	public void shouldCountWords() {
		Text text = new Text("Mary had a little lamb");
		assertThat(text.wordCount(), is(5));
	}
}
