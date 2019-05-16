package com.company;

import com.codecool.termlib.Color;
import com.codecool.termlib.Terminal;
import java.util.Arrays;
import java.util.Scanner;



public class Rectangle {

  public static Integer height = Integer.valueOf(getHeight());
  public static Float widthRatio = Float.valueOf(getWidthRatio());
  public static Color color = getColor();
  public static Integer row = Integer.valueOf(getX());
  public static Integer column = Integer.valueOf(getY());



  public static void drawRectangle() {
    Terminal.moveTo(row, column);
    Terminal.setBgColor(color);
    for (int i = 0; i < height.intValue(); i++) {
      Terminal.moveTo(Integer.valueOf(row.intValue() + i), column);
      System.out.print(" ".repeat((int) (((float) (height.intValue()*2))*widthRatio.floatValue())));     
    } 
    Terminal.resetStyle();
    System.out.println();
  }


  public static int getHeight() {
    System.out.print("Please specify the height of your rectangle: ");
    Scanner scanner = new Scanner(System.in);
    return Math.abs(scanner.nextInt());
  }

  public static float getWidthRatio() {
    System.out.print("Please specify the height:width ratio of your rectangle: ");
    Scanner scanner = new Scanner(System.in);
    return Math.abs(scanner.nextFloat());
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
    System.out.print("Please specify the row number where you would like to put your rectangle: ");
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i == 0) {
      return 1;
    }
    return i;
  }

  
  public static int getY() {
    System.out.print("Please specify the column number where you would like to put your rectangle: ");
    Scanner scanner = new Scanner(System.in);
    int i = Math.abs(scanner.nextInt());
    if (i <= height.intValue()) {
      return height.intValue();
    }
    return i;
  }
  
}
