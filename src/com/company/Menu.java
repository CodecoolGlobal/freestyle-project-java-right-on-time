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


	public static void runUserChoice (int userChoice, Runnable[] arrayOfMethods) {
		arrayOfMethods[userChoice].run();
	}
}

