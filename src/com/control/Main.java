package com.control;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		

//		AsciiChars.printNumbers();
//		AsciiChars.printLowerCase();
//		AsciiChars.printUpperCase();

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Hello" + " " + name);

		System.out.println("Do you wish to continue to the interactive portion?");
		String permit = input.nextLine();

		if (permit.equals("yes") || permit.equals("y")) {
			System.out.println("bet");
		} else {
			System.out.println("return later to complete the survey");
			System.exit(0);
		}

//		Defining Questions

		String pet = "What is the name of your favorite pet? (Jim)";
		String petAge = "What is the age of your favorite pet? (3)";
		String luckyNum = "What is your lucky number? (13)";
		String quarterBack = "Do you have a favorite quarterback? (yes or no)";
		String quarterBackNum = "What is your favorite quarterbacl's jersey number? (11)?";
		String carModel = "What is the two-digit model year of your car? (98)";
		String favAct = "What is the name of your favorite actor or actress? (Angelina Jolie)";
		String randNum = "Give me a random number between 1 and 50";

		ArrayList<String> question = new ArrayList<>(
				Arrays.asList(pet, petAge, luckyNum, quarterBack, carModel, favAct, randNum));
		HashMap survey = new HashMap<>();

		for (String q : question) {
			System.out.println(q);
			String answer = input.nextLine();
			if (q.equals(quarterBack)) {
				if (answer.equals("yes")) {
					System.out.println(quarterBackNum);
					String quart = input.nextLine();
					survey.put(quarterBackNum, quart);
				} else if (answer.equals("no")){
					survey.put(quarterBackNum, "-1");
				}
				
				continue;
			}
			survey.put(q, answer);
			
			

		}
		
		String stringQuartNum = survey.get(quarterBackNum).toString();
	
		String stringLuckyNum = survey.get(luckyNum).toString();
		
		Lottery test = new Lottery(stringQuartNum, stringLuckyNum);
//		System.out.println(test.getQuartNum());d
		
//		System.out.println(survey.toString());
//
//		System.out.println(test.getQuartNum());
//		System.out.println(test.getLuckyNum());

	}
}
