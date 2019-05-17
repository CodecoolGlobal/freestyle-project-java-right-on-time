package com.company;

import com.codecool.termlib.*;


public class FlagOptions {
	public static Integer userChoice;
	public static String[] arrayOfUserOptions = new String[] { "draw hungarian flag", "draw ukrainien flag", "draw spanish flag", "draw french flag", "draw german flag", "draw lithuanian flag", "draw LGBTQ flag", "back to main menu" };
	public static Runnable[] arrayOfMethods = {Flags::hungary, Flags::ukraine, Flags::spain, Flags::france, Flags::germany, Flags::lithuania, Flags::lgbtq };

	public static void flagMenu() {
		while (true) {			
			Menu.showOptions("Flags menu", arrayOfUserOptions);
			userChoice = UserInput.getUserChoice(arrayOfUserOptions.length);
			if (userChoice == arrayOfMethods.length+1) {
				Terminal.clearScreen();
				Terminal.moveTo(1,1);
				break;
				} else {
				Terminal.clearScreen();
				Terminal.moveTo(1,1);
				Menu.runUserChoice(userChoice-1, arrayOfMethods);
			}
		}
	}	
}

