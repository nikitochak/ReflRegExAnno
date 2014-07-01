package com.sirma.itt.javacourse.inforclass;

/**
 * Class with random modifiers if the attributes.
 * 
 * @author Nikolay Ch
 * 
 */
public class ExampleMod {
	public static int number;
	private String name;
	protected char[] email = new char[10];
	final short month = 30;

	/**
	 * Default constructor for the class.
	 */
	public ExampleMod() {
		number = 0;
		this.setName("No insert");
		email[0] = 'a';
	}

	/**
	 * Constructor with some data inserted from the customer.
	 * 
	 * @param num
	 *            the number
	 * @param name
	 *            the name
	 */
	public ExampleMod(int num, String name) {
		number = num;
		this.setName(name);
		email[0] = '4';
	}

	/**
	 * Getter for the name.
	 * 
	 * @return the value of the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name.
	 * 
	 * @param name
	 *            the value for the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Calculates the years of work.
	 * 
	 * @return the years that the person has been working
	 */
	public static int yearsWork() {
		return (int) number / 10;
	}

	/**
	 * Protected method which prints the name of the worker and his master.
	 * 
	 * @param master
	 *            the name of the master
	 */
	@SuppressWarnings("unused")
	private void printName() {
		System.out.println(name + " is working for toncho");
	}

	/**
	 * Final method protected from extending which returns the money earned for
	 * one day.
	 * 
	 * @param money
	 *            the money earned by the worker for one month
	 * @return the money earned by him for a day
	 */
	final int howGets(int money) {
		return money / month;
	}
}
