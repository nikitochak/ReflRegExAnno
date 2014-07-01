package com.sirma.itt.javacourse.iban;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test the class for hiding characters from valid bulgarian iban.
 * 
 * @author Nikolay Ch
 * 
 */
public class IbanTest {

	/**
	 * Tests the main method in iban validator.
	 */
	@Test
	public void testIbanValid() {
		String output = "<bankAccounts><iban>BG80 BGND 4123 3414 1234</iban></bankAccounts>";
		output = IbanValidator.replace(output);
		assertEquals("<bankAccounts><iban>**** 1234</iban></bankAccounts>",
				output);
	}

}
