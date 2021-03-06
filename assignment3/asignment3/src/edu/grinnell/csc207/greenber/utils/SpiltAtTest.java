package edu.grinnell.csc207.greenber.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpiltAtTest {

	@Test
	public void test() {
		assertArrayEquals(new String[] { "a", "b", "c" },
				StringUtils.splitAt("a:b:c", ':'));
		assertArrayEquals(new String[] { "a", "b", "c" },
				StringUtils.splitAt("a b c", ' '));
		assertArrayEquals(new String[] { "a:b:c" },
				StringUtils.splitAt("a:b:c", ' '));
		assertArrayEquals("one field", new String[] { "a" },
				StringUtils.splitAt("a", ':'));
		assertArrayEquals("empty inner field", new String[] { "a", "", "c" },
				StringUtils.splitAt("a::c", ':'));
		assertArrayEquals("leading empty field", new String[] { "", "a" },
				StringUtils.splitAt(":a", ':'));
		assertArrayEquals("trailing empty field", new String[] { "a", "" },
				StringUtils.splitAt("a:", ':'));
		assertArrayEquals("Empty Array", new String[] {""},
				StringUtils.splitAt("", ':'));
		assertArrayEquals("Long  Array", new String[] {"a","a", "a","a","a","a", "a","a","a","a","a","a",},
				StringUtils.splitAt("a:a:a:a:a:a:a:a:a:a:a:a", ':'));
	}

}
