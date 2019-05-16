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

    private static void printSquareAtCursor(Color color) {
        Terminal.setBgColor(color);
        System.out.print(space5);
        Terminal.moveCursor(Direction.BACKWARD, 6);
        Terminal.moveCursor(Direction.DOWN, 1);
        System.out.print(space5);
        Terminal.moveCursor(Direction.BACKWARD, 6);
        Terminal.moveCursor(Direction.DOWN, 1);
        System.out.print(space5);
        Terminal.resetStyle();
    }

    private static void moveRight(int amount) {
        Terminal.moveCursor(Direction.UP, 2 + 3 * (amount - 1));
        if (amount > 1) {
            Terminal.moveCursor(Direction.FORWARD, 3 * amount);
        }
    }

    private static void skipSquaresToRightXTimes(int amount) {
//        Terminal.moveCursor(Direction.UP, 2);
        Terminal.moveCursor(Direction.FORWARD, 6 * amount);
    }

    private static void moveLeft(int amount) {
        Terminal.moveCursor(Direction.BACKWARD, 6 + 6 * (amount - 1));
    }

    private static void moveUp(int amount) {
        Terminal.moveCursor(Direction.UP, 5 + 3 * (amount - 1));
        Terminal.moveCursor(Direction.BACKWARD, 3);
    }

    private static void moveDown(int amount) {
        Terminal.moveCursor(Direction.DOWN, 3 + 3 * (amount - 1));
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
    }

    public static void drawDonald() {
        Terminal.clearScreen();
        Terminal.moveTo(10, 120);
        drawThenRight(Color.BLUE, 5);
        moveLeft(6);
        moveDown(1);
        drawThenRight(Color.BLUE, 7);
        moveLeft(7);
        moveDown(1);
        drawThenRight(Color.BLUE, 7);
        moveLeft(8);
        moveDown(1);
        drawThenRight(Color.BLUE, 8);
        moveLeft(9);
        moveDown(1);
        drawThenRight(Color.BLUE, 3);
        drawThenRight(Color.BLACK, 5);
        moveLeft(10);
        moveDown(1);
        drawThenRight(Color.BLUE, 4);
        drawThenRight(Color.BLACK, 6);

        moveLeft(11);
        moveDown(1);
        drawThenRight(Color.BLUE, 4);
        drawThenRight(Color.BLACK, 1);
        drawThenRight(Color.WHITE, 7);

        moveLeft(12);
        moveDown(1);
        drawThenRight(Color.BLUE, 3);
        drawThenRight(Color.BLACK, 1);
        drawThenRight(Color.WHITE, 9);

        moveLeft(14);
        moveDown(1);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.BLUE, 2);
        drawThenRight(Color.WHITE, 4);
        drawThenRight(Color.CYAN, 1);
        drawThenRight(Color.WHITE, 4);
        drawThenRight(Color.CYAN, 1);

        moveLeft(15);
        moveDown(1);
        drawThenRight(Color.BLACK, 3);
        skipSquaresToRightXTimes(1);
        drawThenRight(Color.WHITE, 4);
        drawThenRight(Color.CYAN, 3);
        drawThenRight(Color.WHITE, 2);
        drawThenRight(Color.CYAN, 3);

        moveLeft(17);
        moveDown(1);
        drawThenRight(Color.BLACK, 3);
        skipSquaresToRightXTimes(2);
        drawThenRight(Color.WHITE, 4);
        drawThenRight(Color.CYAN, 3);
        drawThenRight(Color.WHITE, 2);
        drawThenRight(Color.CYAN, 3);

        moveLeft(17);
        moveDown(1);
        drawThenRight(Color.BLACK, 3);
        skipSquaresToRightXTimes(2);
        drawThenRight(Color.WHITE, 4);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.CYAN, 1);
        drawThenRight(Color.WHITE, 2);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.CYAN, 1);

        moveLeft(17);
        moveDown(1);
        drawThenRight(Color.BLACK, 1);
        skipSquaresToRightXTimes(1);
        drawThenRight(Color.BLACK, 1);
        skipSquaresToRightXTimes(2);
        drawThenRight(Color.WHITE, 4);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.CYAN, 1);
        drawThenRight(Color.WHITE, 2);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.CYAN, 1);

        moveLeft(11);
        moveDown(1);
        drawThenRight(Color.YELLOW, 2);
        drawThenRight(Color.WHITE, 1);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.CYAN, 1);
        drawThenRight(Color.YELLOW, 2);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.YELLOW, 1);

        moveLeft(11);
        moveDown(1);
        drawThenRight(Color.YELLOW, 14);

        moveLeft(14);
        moveDown(1);
        drawThenRight(Color.YELLOW, 1);
        drawThenRight(Color.RED, 1);
        drawThenRight(Color.YELLOW, 12);

        moveLeft(13);
        moveDown(1);
        drawThenRight(Color.YELLOW, 1);
        drawThenRight(Color.RED, 3);
        drawThenRight(Color.BLACK, 2);
        drawThenRight(Color.RED, 2);
        drawThenRight(Color.YELLOW, 1);

        moveLeft(9);
        moveDown(1);
        drawThenRight(Color.YELLOW, 1);
        drawThenRight(Color.RED, 3);
        drawThenRight(Color.BLACK, 1);
        drawThenRight(Color.RED, 2);
        drawThenRight(Color.YELLOW, 1);

        moveLeft(8);
        moveDown(1);
        drawThenRight(Color.YELLOW, 2);
        drawThenRight(Color.RED, 5);
        drawThenRight(Color.YELLOW, 1);

        moveLeft(7);
        moveDown(1);
        drawThenRight(Color.YELLOW, 2);
        drawThenRight(Color.RED, 3);
        drawThenRight(Color.YELLOW, 2);

        moveLeft(6);
        moveDown(1);
        drawThenRight(Color.YELLOW, 5);

    }

    private static void drawThenRight(Color color, int amount) {
        for (int i = 0; i < amount; i++) {
            printSquareAtCursor(color);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            moveRight(1);
        }
    }
}
