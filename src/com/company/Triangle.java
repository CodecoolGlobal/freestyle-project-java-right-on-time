package com.company;

import com.codecool.termlib.Color;
import com.codecool.termlib.Terminal;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
  public static Integer height = Integer.valueOf(getHeight());
  public static Color color = getColor();
  public static Integer row = Integer.valueOf(getX());
  public static Integer column = Integer.valueOf(getY());

  
  public static void drawTriangle() {
    Terminal.moveTo(row, column);
    Terminal.setColor(color);
    int i;
    for (i = 0; i < height.intValue(); i++) {
      System.out.print("\u2571");
      if (i>0) {
        System.out.print(" ".repeat(i * 2));
      }
      System.out.print("\u2572");
      if (i == height.intValue() - 1) {
        Terminal.moveTo(Integer.valueOf(row.intValue() + i + 1), Integer.valueOf(column.intValue() - i));
      } else {
        Terminal.moveTo(Integer.valueOf(row.intValue() + i + 1), Integer.valueOf(column.intValue() - i-1));
      } 
    } 
    System.out.println("\u203E".repeat(i * 2));
    Terminal.resetStyle();
    System.out.println();
  }
  
  public static int getHeight() {
    System.out.print("Please specify the height of your triangle: ");
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
    System.out.print("Please specify the row number where you would like to put your triangle: ");
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i == 0) {
      return 1;
    }
    return i;
  }

  
  public static int getY() {
    System.out.print("Please specify the column number where you would like to put your triangle: ");
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i <= height.intValue()) {
      return height.intValue();
    }
    return i;
  }
}

