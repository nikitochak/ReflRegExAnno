package com.sirma.itt.javacourse.instanceclass;

/**
 * Class which gets the parents of an instance.
 * 
 * @author Nikolay Ch.
 *
 */
public class GetParents {
	/**
	 * Makes an instances of the class Worker.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Worker first = new Worker();
		Worker second = new Worker(5, "Cars.bg", 5000, 500, "Sasho");

		showHierarchy(second.getClass());
		showInter(first.getClass());
	}

	/**
	 * Prints the parents of the class cl.
	 * 
	 * @param cl
	 *            the class to which we are searching the parents.
	 */
	public static void showHierarchy(Class<?> cl) {
		if (cl.getSuperclass() == null) {
			return;
		}
		showHierarchy(cl.getSuperclass());
		System.out.println("class: " + cl.getSimpleName());
	}

	/**
	 * Prints the interfaces implemented by the class cl.
	 * 
	 * @param cl
	 *            the class
	 */
	public static void showInter(Class<?> cl) {
		Class<?>[] interfaces;
		interfaces = cl.getInterfaces();

		for (int i = 0; i < interfaces.length; i++) {
			System.out.println("interface: " + interfaces[i].getSimpleName());
		}
	}
}
