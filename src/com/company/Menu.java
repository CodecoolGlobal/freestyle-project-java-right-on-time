package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {	

	public static void showOptions(String menuTitle, String[] arrayOfUserOptions) {
		Terminal.setUnderline();
		Terminal.setAttribute(Attribute.BLINK);
		System.out.println(menuTitle+"\n");
		Terminal.resetStyle();
		for (String option : arrayOfUserOptions) {
			System.out.println(Arrays.asList(arrayOfUserOptions).indexOf(option)+1 + ". " + option);
		}
	}

	public static Integer getUserChoice(int arrayOfOptionsLength) {
		Integer userChoice;
    		boolean bool;
		do {
		Terminal.setAttribute(Attribute.BRIGHT);
		Terminal.setColor(Color.BLUE);
		System.out.print("\n" + "Please choose from the options above: ");
		Terminal.resetStyle();
		Scanner scanner = new Scanner(System.in);
		userChoice = scanner.nextInt();		
		bool = userChoice > 0 && userChoice <= arrayOfOptionsLength;
    		}
		while (!bool);
		return userChoice;
	}

	public static void runUserChoice (int userChoice, Runnable[] arrayOfMethods) {
		arrayOfMethods[userChoice].run();
	}
}

