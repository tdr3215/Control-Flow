package com.control;

public class AsciiChars {
	public static void printNumbers() {
		// TODO: print valid numeric input

		// TODO: create for loop from 48 - 57

		for (char i = 48; i < 58; i++) {

			char newChar = i;

			System.out.println(newChar);
		}

		// TODO: set each value to a char
	}

	public static void printLowerCase() {
		// TODO: print valid lowercase alphabetic input
		for (char i = 97; i < 123; i++) {

			char newChar = i;

			System.out.println(newChar);
		}
	}

	public static void printUpperCase() {
		// TODO: print valid uppercase alphabetic input
		for (char i = 65; i < 91; i++) {

			char newChar = i;

			System.out.println(newChar);
		}
	}
}
