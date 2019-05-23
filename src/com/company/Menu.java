package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Menu class of draw project.
 * <p>
 */

public class Menu {
	/**
	 * Displays the menu options.
	 * <p>
	 *
	 * @param  menuTitle title of menu
	 * @param  arrayOfUserOptions array of menu options
	 */
	public static void showOptions(String menuTitle, String[] arrayOfUserOptions) {
		Terminal.setUnderline();
		Terminal.setAttribute(Attribute.BLINK);
		System.out.println(menuTitle+"\n");
		Terminal.resetStyle();
		for (String option : arrayOfUserOptions) {
			System.out.println(Arrays.asList(arrayOfUserOptions).indexOf(option)+1 + ". " + option);
		}
	}

	/**
	 * Executes user choice.
	 * <p>
	 *
	 * @param  userChoice user's choice
	 * @param  arrayOfMethods array of methods
	 */
	public static void runUserChoice (int userChoice, Runnable[] arrayOfMethods) {
		arrayOfMethods[userChoice].run();
	}
}

