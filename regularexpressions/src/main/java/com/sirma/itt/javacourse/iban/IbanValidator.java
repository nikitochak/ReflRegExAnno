package com.sirma.itt.javacourse.iban;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 
 * Searches for valid bulgarian iban and replaces some of its characters.
 * 
 * @author Nikolay Ch
 * 
 */
public class IbanValidator {

	public static Pattern PATTERN = Pattern
			.compile("BG[0-9]++ [A-Z]++ [0-9]++ [0-9]++");

	/**
	 * Reads line by line from the console.
	 * 
	 * @param output
	 *            the string which we want to initialize
	 * @throws IOException
	 */
	public static String read(String output) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String regend = "</bankAccounts>";
		String line = br.readLine();
		output = "";

		while (true) {
			line = br.readLine();
			if (line.matches(regend)) {
				output += line;
				break;
			}
			output += line += "\n";
		}
		return output;
	}

	/**
	 * Hides some characters from correct bulgarian iban.
	 * 
	 * @param output
	 *            the string which characters we want to hide
	 * @return the string with the hided characters
	 */
	public static String replace(String output) {

		String replacement = "****";

		output = PATTERN.matcher(output).replaceAll(replacement);

		return output;
	}

}
