package com.labEight;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {

		//I populate arrays with values corresponding to each student. For ease of knowing which elements correspond, I used alliteration.
		
		Scanner scnr = new Scanner(System.in);

		String[] names = { "Annie", "Bert", "Connie", "Derek", "Ethan", "Fatima", "Greg", "Howie", "Irma", "Julie",
				"Kate", "Lisa", "Maria", "Nora", "Oscar", "Pedro", "Quentin", "Robert", "Sandra", "Tom" };

		String[] surnames = { "Adler", "Benton", "Clarkson", "Davis", "Evans", "Figueroa", "Garrison", "Hunt", "Irwin",
				"Jacobs", "Keeler", "Love", "Maple", "Noone", "Ortiz", "Pascal", "Quail", "Redford", "Scott",
				"Tucker" };

		String[] hometowns = { "Anchorage", "Boston", "Canton", "Detroit", "Eaton", "Frankfort", "Grand Rapids",
				"Havana", "Islington", "Jacksonville", "Kona", "Lima", "Montrose", "Nashville", "Oxford", "Perrysville",
				"Queens", "Rochester", "Southfield", "Toledo" };

		String[] foods = { "arugula", "bok choy", "cabbage", "dragon fruit", "eggplant", "fig", "grapefruit",
				"honeydew", "ice cream", "jackfruit", "kiwi", "lychee", "mango", "nectarine", "orange", "pear",
				"quesadilla", "ribeye", "starfruit", "tapioca" };

		System.out.println("Welcome to my app, where you can find out information about all your favorite students!");

		// give a list of names to choose from
		for (int i = 0; i < names.length; i++) {

			System.out.println((i + 1) + ". " + names[i]);

		}

		int studentOption = Validator.getInt(scnr, "\nPick a student by entering their corresponding number: ", 1,
				names.length);

		String cont = "yes";

		while (cont.equalsIgnoreCase("yes")) {

			//I validate the user's choice to find out more information
			
			String infoOption = Validator.getString(scnr, "What else would you like to know about "
					+ names[studentOption - 1] + "?" + "\nEnter \"last name\", \"hometown\", or \"favorite food\"");

			//I offer corresponding responses to the user's student choice
			
			if (infoOption.equals("last name")) {

				System.out.println(names[studentOption - 1] + "'s last name is " + surnames[studentOption - 1] + ".");

			} else if (infoOption.equals("hometown")) {

				System.out.println(names[studentOption - 1] + "'s hometown is " + hometowns[studentOption - 1] + ".");

			} else if (infoOption.equals("favorite food")) {

				System.out.println(names[studentOption - 1] + "'s favorite food is " + foods[studentOption - 1] + ".");

			} else {
				System.out.println("Please enter a valid option.");
			}

			// I ask if the user if they would like to continue, if "yes", while loop will
			// begin again.

			cont = Validator.getString(scnr, "\nWould you like to know more? (yes/no)");

		}

		// Otherwise, I bed farewell to the user. I close the scanner to avoid resource
		// leak.

		System.out.println("Goodbye!");
		scnr.close();

	}

}
