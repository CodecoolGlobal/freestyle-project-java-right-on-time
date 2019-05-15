package com.company;

import com.codecool.termlib.Color;
import com.codecool.termlib.Terminal;
import java.util.Arrays;
import java.util.Scanner;



public class Rectangle

{
  public static void drawRectangle() {
    Integer sideLength = Integer.valueOf(getSideLength());
    Color color = getColor();
    Integer row = Integer.valueOf(getX());
    Integer column = Integer.valueOf(getY());
    Terminal.moveTo(row, column);
    Terminal.setBgColor(color);
    for (int i = 0; i < sideLength.intValue(); i++) {
      Terminal.moveTo(Integer.valueOf(row.intValue() + i), column);
      System.out.print(" ".repeat(sideLength.intValue() * 2));
    } 
    Terminal.resetStyle();
    System.out.println();
  }
  
  public static int getSideLength() {
    System.out.print("Please specify the side length of your rectangle: ");
    Scanner scanner = new Scanner(System.in);
    return Math.abs(scanner.nextInt());
  }
  
  public static Color getColor() {
    boolean bool;
    String str, arrayOfString[] = { "BLACK", "RED", "GREEN", "YELLOW", "BLUE", "MAGENTA", "CYAN", "WHITE" };
    Color[] arrayOfColor = { Color.BLACK, Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.WHITE };

    
    do {
      System.out.print("Please specify the color of your rectangle (BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE): ");
      Scanner scanner = new Scanner(System.in);
      str = scanner.nextLine();
      bool = Arrays.asList(arrayOfString).contains(str);
    }
    while (!bool);
    return arrayOfColor[Arrays.asList(arrayOfString).indexOf(str)];
  }

  
  public static int getX() {
    System.out.print("Please specify the row number where you would like to put your rectangle (>0): ");
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i == 0) {
      return 1;
    }
    return i;
  }

  
  public static int getY() {
    System.out.print("Please specify the column number where you would like to put your rectangle (>0): ");
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i == 0) {
      return 1;
    }
    return i;
  }
}

