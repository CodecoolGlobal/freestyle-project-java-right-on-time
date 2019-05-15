package com.company;

import com.codecool.termlib.*;

import java.awt.event.ActionListener;


public class Command {
    /* Contains the hotkeys for different commands, ie: press '0' to reset settings, press '1' to set the char color
      black.
      */

    private static char fillChar = (char) 219;
    private static String fill = String.valueOf(fillChar);
    private static String fill10 = "                                      ";
    private static String space5 = "      ";


    private static void printSquare(Color color, int x, int y) {
        Terminal.moveTo(x, y);
        Terminal.setBgColor(color);
        System.out.print(space5);
        Terminal.moveTo(x + 1, y);
        System.out.print(space5);
        Terminal.moveTo(x + 2, y);
        System.out.print(space5);
        Terminal.resetStyle();


    }

    private static void flagPattern(Color color) {
        System.out.print("\n");
        Terminal.setBgColor(color);
//        Terminal.moveTo(5, 40);
        System.out.print(fill10);
        Terminal.resetStyle();
        System.out.print("\n");
        Terminal.setBgColor(color);
        System.out.print(fill10);
        Terminal.resetStyle();
        System.out.print("\n");
        Terminal.setBgColor(color);
        System.out.print(fill10);
        Terminal.resetStyle();
    }

    public static void drawHungarianFlag() {
        Terminal.clearScreen();
        flagPattern(Color.RED);
        flagPattern(Color.WHITE);
        flagPattern(Color.GREEN);
    }

    public static void drawUkrainianFlag() {
        Terminal.clearScreen();
        flagPattern(Color.BLUE);
        flagPattern(Color.BLUE);
        flagPattern(Color.YELLOW);
        flagPattern(Color.YELLOW);
    }

    public static void drawHeart() {
        Terminal.clearScreen();
        printSquare(Color.RED, 50, 100);
        printSquare(Color.RED, 47, 94);
        printSquare(Color.RED, 47, 106);
        printSquare(Color.RED, 44, 88);
        printSquare(Color.RED, 44, 112);
        printSquare(Color.RED, 41, 82);
        printSquare(Color.RED, 41, 118);
        printSquare(Color.RED, 38, 76);
        printSquare(Color.RED, 38, 124);
        printSquare(Color.RED, 35, 76);
        printSquare(Color.RED, 35, 124);
        printSquare(Color.RED, 32, 82);
        printSquare(Color.RED, 32, 118);
        printSquare(Color.RED, 32, 88);
        printSquare(Color.RED, 32, 112);
        printSquare(Color.RED, 35, 94);
        printSquare(Color.RED, 35, 106);
        printSquare(Color.RED, 38, 100);
//        printSquare(Color.RED, 47, 94);
//        printSquare(Color.RED, 47, 106);
//        printSquare(Color.RED, 47, 94);
//        printSquare(Color.RED, 47, 106);
    }

}
