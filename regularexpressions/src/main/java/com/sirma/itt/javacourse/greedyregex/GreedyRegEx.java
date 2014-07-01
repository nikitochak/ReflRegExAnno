package com.sirma.itt.javacourse.greedyregex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 
 * Class for replacing tags.
 * 
 * @author Nikolay Ch
 * 
 */

public class GreedyRegEx {
	/**
	 * Reads from the console until '0' character. 
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	public static Pattern PATTERN = Pattern.compile("<x>[a-zA-Z0-9]+</x>");
	

	public static String read() throws IOException {
		String allReplaced = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char character;

		while (true) {

			character = (char) br.read();
			if (character == '0') {
				break;
			}

			allReplaced += character;
		}
		return allReplaced;
	}

	/**
	 * Replaces by the above described way.
	 * 
	 * @return the described string
	 */
	public static String replace(String allReplaced) {

		return PATTERN.matcher(allReplaced).replaceAll("<x/>");
	}
}
