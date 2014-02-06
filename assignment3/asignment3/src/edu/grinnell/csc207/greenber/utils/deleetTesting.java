package edu.grinnell.csc207.greenber.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class deleetTesting {

	@Test
	public void testDeleet() {
		assertEquals("e", StringUtils.deLeet("3"));
		assertEquals("leet", StringUtils.deLeet("133+"));
		assertEquals("eat banana", StringUtils.deLeet("3@+ |3@|\\|@|\\|@"));
	}

}
