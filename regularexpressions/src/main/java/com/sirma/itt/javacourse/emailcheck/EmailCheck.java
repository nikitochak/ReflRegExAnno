package com.sirma.itt.javacourse.emailcheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Class which checks if an email is valid.
 * 
 * @author Nikolay Ch
 */
public class EmailCheck {
	public static Pattern pattern = Pattern
			.compile("[a-zA-Z][a-zA-Z0-9.-]++@[a-zA-Z0-9.-]++");

	/**
	 * Reads an email form the console.
	 * 
	 * @param args
	 * @return the inputed Email
	 * @throws IOException
	 * 
	 */
	public static String read() throws IOException {
		String inputedEmail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your email address.");
		inputedEmail = br.readLine();
		System.out.println();
		return inputedEmail;
	}

	/**
	 * Checks if the email is valid.
	 * 
	 * @return true is it is valid
	 */
	public static boolean validate(String inputedEmail) {
		if (pattern.matcher(inputedEmail).matches()) {
			System.out.println("Yes your email is correct.");
			return true;
		} else {
			return false;
		}
	}
}
