package com.company;

import com.codecool.termlib.*;


public class Main {
	public static Integer userChoice;
	public static String[] arrayOfUserOptions = new String[] { "draw square", "draw rectangle", "draw triangle", "draw flags", "draw heart", "draw Donald Duck", "exit" };
	public static Runnable[] arrayOfMethods = {Square::drawSquare, Rectangle::drawRectangle, Triangle::drawTriangle, FlagOptions::flagMenu, Command::drawHeart, Command::drawDonald};

	public static void main(String[] args) {
		while (true) {			
			Menu.showOptions("Main menu", arrayOfUserOptions);
			userChoice = Menu.getUserChoice(arrayOfUserOptions.length);
			if (userChoice == arrayOfMethods.length+1) {
				break;
				} else {
				Terminal.clearScreen();
				Terminal.moveTo(1,1);
				Menu.runUserChoice(userChoice-1, arrayOfMethods);
			}
		}
	}	
}

