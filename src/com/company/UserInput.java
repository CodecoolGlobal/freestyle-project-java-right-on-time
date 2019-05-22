package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class UserInput {

  public static int getHeight(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    return Math.abs(scanner.nextInt());
  }

  public static float getWidthRatio(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    return Math.abs(scanner.nextFloat());
  }
  
  public static Color getColor(String message) {
    boolean bool;
    String str, arrayOfString[] = { "BLACK", "RED", "GREEN", "YELLOW", "BLUE", "MAGENTA", "CYAN", "WHITE" };
    Color[] arrayOfColor = { Color.BLACK, Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.WHITE };
    
    do {
      System.out.print(message);
      Scanner scanner = new Scanner(System.in);
      str = scanner.nextLine();
      bool = Arrays.asList(arrayOfString).contains(str);
    }
    while (!bool);
    return arrayOfColor[Arrays.asList(arrayOfString).indexOf(str)];
  }

  
  public static int getX(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i == 0) {
      return 1;
    }
    return i;
  }

  
  public static int getY(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i == 0) {
      return 1;
    }
    return i;
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

  public static char getFillChar(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    char ch = scanner.next().charAt(0);
    return ch;
  }

  /*public static char getHiddenInput() {
	Terminal.withoutEnter();
    Scanner scanner = new Scanner(System.in);
    char ch = scanner.next().charAt(0);
	Terminal.withEnter();
    return ch;
  }*/


  public static char tryToRead() {	
	try {        	
		if (System.in.available() > 0) {
        	    return (char)System.in.read();
        	}
    	}
    	catch (IOException e) {
        	System.err.println("Error " + e.getMessage());
    	}
    	return '0';
  }


  /*private Character tryToRead() {
    try {
        if (System.in.available() > 0) {
            return (char)System.in.read();
        }
    }
    catch (IOException e) {
        System.err.println("Error " + e.getMessage());
    }
    return null;
  }*/
}

