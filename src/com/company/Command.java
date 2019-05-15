package com.company;
import com.codecool.termlib.*;

import java.awt.event.ActionListener;


public class Command {
    /* Contains the hotkeys for different commands, ie: press '0' to reset settings, press '1' to set the char color
      black.
      */

    private static char fillChar = (char) 219;
    private static String fill = String.valueOf(fillChar);
    private static String fill10 = fill.repeat(10);


    private static void flagPattern(Color color) {
        System.out.print("\n");
        Terminal.moveCursor(Direction.FORWARD, 40);
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


}
