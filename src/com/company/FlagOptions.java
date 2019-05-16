package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;

public class FlagOptions {
	public static Integer userChoice;
	public static String[] arrayOfUserOptions = new String[] { "draw hungarian flag", "draw ukrainien flag", "draw spanish flag", "draw french flag", "draw german flag", "draw lithuanian flag", "draw LGBTQ flag", "back to main menu" };
	public static Runnable[] arrayOfMethods = {Flags::hungary, Flags::ukraine, Flags::spain, Flags::france, Flags::germany, Flags::lithuania, Flags::lgbtq };

	public static void showOptions() {
		while (true) {
			Terminal.setUnderline();
			System.out.println("Flags menu"+"\n");
			Terminal.resetStyle();
			for (String option : arrayOfUserOptions) {
				System.out.println(Arrays.asList(arrayOfUserOptions).indexOf(option)+1 + ". " + option);
			}
		userChoice = getUserChoice();
		if (userChoice == arrayOfMethods.length+1) {
			break;
			} else {
			Terminal.clearScreen();
			Terminal.moveTo(1,1);
			runUserChoice(userChoice-1);
			}
		}
	}

	public static Integer getUserChoice() {
    		boolean bool;
		do {
		System.out.print("\n" + "Please choose from the options above: ");
		Scanner scanner = new Scanner(System.in);
		userChoice = scanner.nextInt();
		bool = userChoice > 0 && userChoice <= arrayOfUserOptions.length;
    		}
		while (!bool);
		return userChoice;
	}

	public static void runUserChoice (int userChoice) {
		arrayOfMethods[userChoice].run();
	}
}

