package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Rectangle class of draw project.
 * <p>
 */

public class Rectangle {

  public static Integer height; 
  public static Float widthRatio; 
  public static Color color;
  public static Integer row;
  public static Integer column;

    /**
     * Draws a rectangle.
     * <p>
     *
     */
  public static void drawRectangle() {

	height = Integer.valueOf(UserInput.getHeight("Please specify the height of your rectangle: "));
  	widthRatio = Float.valueOf(UserInput.getWidthRatio("Please specify the height:width ratio of your rectangle: "));
  	color = UserInput.getColor("Please specify the color of your rectangle (BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE): ");
  	row = Integer.valueOf(UserInput.getX("Please specify the row number where you would like to put your rectangle: "));
  	column = Integer.valueOf(UserInput.getY("Please specify the column number where you would like to put your rectangle: "));

    Terminal.moveTo(row, column);
    Terminal.setBgColor(color);
    for (int i = 0; i < height.intValue(); i++) {
      Terminal.moveTo(Integer.valueOf(row.intValue() + i), column);
      System.out.print(" ".repeat((int) (((float) (height.intValue()*2))*widthRatio.floatValue())));     
    }
    Terminal.resetStyle();
    System.out.println();
  }  
}
