package com.company;

import com.codecool.termlib.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Integer userChoice;
	public static String[] arrayOfUserOptions = new String[] { "draw square", "draw rectangle", "draw triangle", "draw HUN flag", "draw UKR flag", "draw heart", "draw Donald Duck" };
	public static String[] arrayOfMethods = new String[] { "Rectangle.drawSquare()", "Rectangle.drawRectangle()", "Triangle.drawTriangle()", "Command.drawHungarianFlag()", "Command.drawUkrainianFlag()"};
//, Command.drawHeart(), Command.drawDonald() };

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
		//Integer userChoice = Integer.valueOf(getUserChoice())-1;
		do {
		System.out.print("\n" + "Please choose from the options above: ");
		Scanner scanner = new Scanner(System.in);
		userChoice = scanner.nextInt();
		bool = userChoice > 0 && userChoice <= arrayOfUserOptions.length;
    		}
		while (!bool);
		return userChoice;
	}

	public static String getMethod(Integer userChoice) { 
		return String.valueOf(arrayOfMethods[userChoice-1]);
	}

	public static void main(String[] args) {
		Menu.init();
	}

	
	//Rectangle.drawRectangle();
	//Triangle.drawTriangle();
	//Command.drawHungarianFlag();
	
}
