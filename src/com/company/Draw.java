package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Draw {	

	public static Character fillChar;
	public static Color color;
	public static Integer row;
	public static Integer column;

	public static void freeDraw() {
		
		System.out.println("You can move cursor with a: LEFT, s: DOWN, d: RIGHT, w: UP, q: exit");
		fillChar = UserInput.getFillChar("Please specify cursor design: ");
		color = UserInput.getColor("Please specify the color you want to draw with (BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE): ");
		row = Integer.valueOf(UserInput.getX("Please specify the row number where you would like to start to draw: "));
		column = Integer.valueOf(UserInput.getY("Please specify the column number where you would like to start to draw: "));

		Terminal.clearScreen();
		Terminal.moveTo(row, column);
		Terminal.setColor(color);
		
		Terminal.setCursorInvisible();  //cursor is hidden while input
		Terminal.intoRawModeWithoutEcho();        // change to raw mode without echo	!!!!!!!staircase!!!!
		Character direction = '0';
		while (direction != 'q') {
			direction = UserInput.tryToRead();
			switch (direction) {
				case 'a': moveLeft(fillChar);
					break;
				case 's': moveDown(fillChar);
					break;
				case 'd': moveRight(fillChar);
					break;
				case 'w': moveUp(fillChar);
					break;
				case 'q': 
					Terminal.resetStyle();  
					Terminal.clearScreen();
					Terminal.moveTo(1, 1);
					break;
				default: break;
			}
		}
		Terminal.intoCookedModeWithEcho();        	
		Terminal.setCursorVisible();
	}


	public static void moveUp (char fillChar) {	
		Terminal.moveCursor(Direction.UP, 1);
		Terminal.setChar(fillChar);
	}

	public static void moveDown (char fillChar) {	
		Terminal.moveCursor(Direction.DOWN, 1);
		Terminal.setChar(fillChar);
	}

	public static void moveLeft (char fillChar) {	
		Terminal.moveCursor(Direction.BACKWARD, 1);
		Terminal.setChar(fillChar);
	}

	public static void moveRight (char fillChar) {
		Terminal.moveCursor(Direction.FORWARD, 1);
		Terminal.setChar(fillChar);
	}	
}

