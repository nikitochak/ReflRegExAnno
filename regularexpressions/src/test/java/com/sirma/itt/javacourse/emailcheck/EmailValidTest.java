package com.sirma.itt.javacourse.emailcheck;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sirma.itt.javacourse.emailcheck.EmailCheck;

/**
 * Tests the methods in email validator.
 * 
 * @author Nikolay Ch
 * 
 */
public class EmailValidTest {

	/**
	 * Checks the email validator method.
	 */
	@Test
	public void testValidate() {

		assertTrue(EmailCheck.validate("asdf@asdf.com"));

	}

}
