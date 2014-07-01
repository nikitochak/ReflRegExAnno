package com.sirma.itt.javacourse.inforclass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Makes an instance of type ExampleMod and prints the info for it.
 * 
 * @author Nikolay Ch
 * 
 */
public class Main {

	public static void main(String[] args) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {

		ExampleMod example = new ExampleMod(500, "adfadga");// instance
		// ExampleMod ex2=new ExampleMod(500,"Asparuh");
		Method[] method = example.getClass().getDeclaredMethods();
		Field[] field = example.getClass().getDeclaredFields();

		// prints the info for the methods
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}
		System.out.println("Now the fields and their values.");

		// prints the info for the fields and their values
		for (int i = 0; i < field.length; i++) {

			field[i].setAccessible(true);

			System.out.println(field[i] + " " + field[i].get(example));

		}

	}
}
