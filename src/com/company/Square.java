package com.company;

import com.codecool.termlib.Color;
import com.codecool.termlib.Terminal;
import java.util.Arrays;
import java.util.Scanner;


public class Square {

  public static Integer sideLength; 
  public static Color color;
  public static Integer row;
  public static Integer column;

  public static void drawSquare() {

	sideLength = Integer.valueOf(UserInput.getHeight("Please specify the side length of your square: "));
  	color = UserInput.getColor("Please specify the color of your square (BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE): ");
  	row = Integer.valueOf(UserInput.getX("Please specify the row number where you would like to put your square: "));
  	column = Integer.valueOf(UserInput.getY("Please specify the column number where you would like to put your square: "));

    Terminal.moveTo(row, column);
    Terminal.setBgColor(color);
    for (int i = 0; i < sideLength.intValue(); i++) {
      Terminal.moveTo(Integer.valueOf(row.intValue() + i), column);
      System.out.print(" ".repeat(sideLength.intValue() * 2));
    } 
    Terminal.resetStyle();
    System.out.println();
  }
}

