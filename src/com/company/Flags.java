package com.company;

import com.codecool.termlib.*;

/**
* This class contains methods for printing out flags.
* Every name of the flag's nation (method) contains only lowercase letter.
* (america, hungary etc.)
*/
public class Flags {

    
    public static void hungary(){

        String line = "                        ";

        Terminal.setBgColor(Color.RED);
        System.out.println(line);
        System.out.println(line);
        Terminal.setBgColor(Color.WHITE);
        System.out.println(line);
        System.out.println(line);
        Terminal.setBgColor(Color.GREEN);
        System.out.println(line);
        System.out.println(line);
        Terminal.resetStyle();
    }

    public static void ukraine(){

        String line = "                        ";

        Terminal.setBgColor(Color.BLUE);
        System.out.println(line);
        System.out.println(line);
        System.out.println(line);
        Terminal.setBgColor(Color.YELLOW);
        System.out.println(line);
        System.out.println(line);
        System.out.println(line);
        Terminal.resetStyle();
    }

    public static void spain(){

        String line = "                        ";
        Terminal.setBgColor(Color.RED);
        System.out.println(line);
        Terminal.setBgColor(Color.YELLOW);
        System.out.println(line);
        System.out.print("    ");
        Terminal.setBgColor(Color.WHITE);
        System.out.print("  ");
        Terminal.setBgColor(Color.YELLOW);
        System.out.println("                  ");
        System.out.println(line);
        System.out.println(line);
        Terminal.setBgColor(Color.RED);
        System.out.println(line);
        Terminal.resetStyle();
    }

    public static void france(){

        String block = "        ";

        Terminal.setBgColor(Color.BLUE);
        System.out.print(block);
        Terminal.setBgColor(Color.WHITE);
        System.out.print(block);
        Terminal.setBgColor(Color.RED);
        System.out.print(block);
        Terminal.moveCursor(Direction.DOWN, 1);
        Terminal.moveCursor(Direction.BACKWARD, 24);
        Terminal.resetStyle();
        Terminal.setBgColor(Color.BLUE);
        System.out.print(block);
        Terminal.setBgColor(Color.WHITE);
        System.out.print(block);
        Terminal.setBgColor(Color.RED);
        System.out.print(block);
        Terminal.moveCursor(Direction.DOWN, 1);
        Terminal.moveCursor(Direction.BACKWARD, 24);
        Terminal.resetStyle();
        Terminal.setBgColor(Color.BLUE);
        System.out.print(block);
        Terminal.setBgColor(Color.WHITE);
        System.out.print(block);
        Terminal.setBgColor(Color.RED);
        System.out.print(block);
        Terminal.moveCursor(Direction.DOWN, 1);
        Terminal.moveCursor(Direction.BACKWARD, 24);
        Terminal.resetStyle();
        Terminal.setBgColor(Color.BLUE);
        System.out.print(block);
        Terminal.setBgColor(Color.WHITE);
        System.out.print(block);
        Terminal.setBgColor(Color.RED);
        System.out.print(block);
        Terminal.moveCursor(Direction.DOWN, 1);
        Terminal.moveCursor(Direction.BACKWARD, 24);
        Terminal.resetStyle();
        Terminal.setBgColor(Color.BLUE);
        System.out.print(block);
        Terminal.setBgColor(Color.WHITE);
        System.out.print(block);
        Terminal.setBgColor(Color.RED);
        System.out.print(block);
        Terminal.moveCursor(Direction.DOWN, 1);
        Terminal.moveCursor(Direction.BACKWARD, 24);
        Terminal.resetStyle();
        Terminal.setBgColor(Color.BLUE);
        System.out.print(block);
        Terminal.setBgColor(Color.WHITE);
        System.out.print(block);
        Terminal.setBgColor(Color.RED);
        System.out.print(block);
        Terminal.moveCursor(Direction.DOWN, 1);
        Terminal.moveCursor(Direction.BACKWARD, 24);
        Terminal.resetStyle();
    }

    public static void germany(){

        String block = "                        ";

        Terminal.setBgColor(Color.BLACK);
        System.out.println(block);
        System.out.println(block);
        Terminal.setBgColor(Color.RED);
        System.out.println(block);
        System.out.println(block);
        Terminal.setBgColor(Color.YELLOW);
        System.out.println(block);
        System.out.println(block);
        Terminal.resetStyle();
    }

    public static void lithuania(){

        String line = "                        ";

        Terminal.setBgColor(Color.YELLOW);
        System.out.println(line);
        System.out.println(line);
        Terminal.setBgColor(Color.GREEN);
        System.out.println(line);
        System.out.println(line);
        Terminal.setBgColor(Color.RED);
        System.out.println(line);
        System.out.println(line);
        Terminal.resetStyle();
    }

    public static void lgbtq(){

        String line = "                        ";

        Terminal.setBgColor(Color.RED);
        System.out.println(line);
        Terminal.setBgColor(Color.YELLOW);
        System.out.println(line);
        Terminal.setBgColor(Color.MAGENTA);
        System.out.println(line);
        Terminal.setBgColor(Color.GREEN);
        System.out.println(line);
        Terminal.setBgColor(Color.BLUE);
        System.out.println(line);
        Terminal.setBgColor(Color.RED);
        System.out.println(line);
        Terminal.resetStyle();
    }
}
