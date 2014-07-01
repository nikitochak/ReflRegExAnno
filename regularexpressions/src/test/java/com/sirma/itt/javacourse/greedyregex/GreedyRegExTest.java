package com.sirma.itt.javacourse.greedyregex;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the greedy regex replacement.
 * 
 * @author Nikolay Ch
 * 
 */
public class GreedyRegExTest {

	String output;

	/**
	 * Tests if the method for replacing is working properly.
	 * 
	 */
	@Test
	public void testReplace() {
		String allReplaced = "<x><x>asdfasdf</x>asdfadfa<x>32542354</x></x>";
		output = "<x><x/>asdfadfa<x/></x>";

		String worked = GreedyRegEx.replace(allReplaced);

		assertTrue(worked.equals(output));

	}

}
