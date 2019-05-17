package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

  public static Integer height; 
  public static Color color;
  public static Integer row;
  public static Integer column;

  public static void drawTriangle() {

	height = Integer.valueOf(UserInput.getHeight("Please specify the height of your triangle: "));
  	color = UserInput.getColor("Please specify the color of your triangle (BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE): ");
  	row = Integer.valueOf(UserInput.getX("Please specify the row number where you would like to put your triangle: "));
  	column = Integer.valueOf(UserInput.getY("Please specify the column number where you would like to put your triangle: "));

	if (column.intValue() <= height.intValue()) {
	       column = height.intValue();
	}

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
}

