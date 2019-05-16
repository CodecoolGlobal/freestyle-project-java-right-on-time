package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Integer userChoice;
	public static String[] arrayOfUserOptions = new String[] { "draw square", "draw rectangle", "draw triangle", "draw flags", "draw heart", "draw Donald Duck", "exit" };
	public static Runnable[] arrayOfMethods = {Square::drawSquare, Rectangle::drawRectangle, Triangle::drawTriangle, FlagOptions::showOptions, Command::drawHeart, Command::drawDonald, () -> System.exit(0) };

	public static void showOptions() {
		Terminal.setUnderline();
		System.out.println("Main menu"+"\n");
		Terminal.resetStyle();
		for (String option : arrayOfUserOptions) {
		System.out.println(Arrays.asList(arrayOfUserOptions).indexOf(option)+1 + ". " + option);
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

	public static void main(String[] args) {
		while (true) {			
			showOptions();
			userChoice = getUserChoice();
			Terminal.clearScreen();
			Terminal.moveTo(1,1);
			runUserChoice(userChoice-1);
		}
	}	
}

