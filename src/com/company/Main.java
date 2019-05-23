package com.company;

import com.codecool.termlib.*;

/**
 * Main class of draw project.
 * <p>
 */

public class Main {
	public static Integer userChoice;
	public static String[] arrayOfUserOptions = new String[] { "draw square", "draw rectangle", "draw triangle", "draw flags", "draw heart", "draw Donald Duck", "free draw", "exit" };
	public static Runnable[] arrayOfMethods = {Square::drawSquare, Rectangle::drawRectangle, Triangle::drawTriangle, FlagOptions::flagMenu, Command::drawHeart, Command::drawDonald, Draw::freeDraw};

	public static void main(String[] args) {
		Terminal.setCursorVisible();
		Terminal.clearScreen();
		//Welcome.hello(Color.YELLOW);
		Terminal.setAttribute(Attribute.BRIGHT);
		Terminal.setColor(Color.RED);
		System.out.println("\n"+"Welcome to our awesome draw application!");
		System.out.println();
		Terminal.resetStyle();
		while (true) {			
			Menu.showOptions("Main menu", arrayOfUserOptions);
			userChoice = UserInput.getUserChoice(arrayOfUserOptions.length);
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

