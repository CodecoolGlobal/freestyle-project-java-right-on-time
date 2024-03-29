package com.codecool.termlib;

import java.io.*;


public class Terminal {
    /**
     * The beginning of control sequences.
     */
    // HINT: In \033 the '0' means it's an octal number. And 33 in octal equals 0x1B in hexadecimal.
    // Now you have some info to decode that page where the control codes are explained ;)
    private static final String CONTROL_CODE = "\033[";
    /**
     * Command for whole screen clearing.
     *
     * Might be partitioned if needed.
     */
    private static final String CLEAR = "2J";
    /**
     * Command for moving the cursor.
     */
    private static final String MOVE = "H";
    /**
     * Command for printing style settings.
     *
     * Handles foreground color, background color, and any other
     * styles, for example color brightness, or underlines.
     */
    private static final String STYLE = "m";

    /**
     * Reset printing rules in effect to terminal defaults.
     *
     * Reset the color, background color, and any other style
     * (i.e.: underlined, dim, bright) to the terminal defaults.
     */
    public static void resetStyle() {
	command(CONTROL_CODE+Attribute.RESET.getAttribute()+STYLE);
    }

    /**
     * Clear the whole screen.
     *
     * Might reset cursor position.
     */
    public static void clearScreen() {
	command(CONTROL_CODE+CLEAR);
    }


 /**
     * Get cursos position.
     *
     *  cursor position.
     */
    public static void getCursorPosition() {
	 command(CONTROL_CODE+"6n");
    }


    /**
     * Move cursor to the given position.
     *
     * Positions are counted from one.  Cursor position 1,1 is at
     * the top left corner of the screen.
     *
     * @param x Column number.
     * @param y Row number.
     */
    public static void moveTo(Integer x, Integer y) {
	command(CONTROL_CODE +x+";"+y+ MOVE);
    }



    public static void setAttribute(Attribute attribute) {
	command(CONTROL_CODE+attribute.getAttribute()+STYLE);
    }

    /**
     * Make cursor invisible.
     *
     */
    public static void setCursorInvisible() {
	command(CONTROL_CODE+"?25l");
    }


    /**
     * Make cursor visible.
     *
     */
    public static void setCursorVisible() {
	command(CONTROL_CODE+"?25h");
    }


    /**
     * Set the foreground printing color.
     *
     * Already printed text is not affected.
     *
     * @param color The color to set.
     */
    public static void setColor(Color color) {
	command(CONTROL_CODE+color.getColor()+STYLE);
    }

    /**
     * Set the background printing color.
     *
     * Already printed text is not affected.
     *
     * @param color The background color to set.
     */
    public static void setBgColor(Color color) {
	String bgColor = "4"+color.getColor().split("")[1];
	command(CONTROL_CODE+bgColor+STYLE);
    }

    /**
     * Make printed text underlined.
     *
     * On some terminals this might produce slanted text instead of
     * underlined.  Cannot be turned off without turning off colors as
     * well.
     */
    public static void setUnderline() {
	command(CONTROL_CODE+Attribute.UNDERSCORE.getAttribute()+STYLE);
    }

    /**
     * Move the cursor relatively.
     *
     * Move the cursor amount from its current position in the given
     * direction.
     *
     * @param direction Step the cursor in this direction.
     * @param amount Step the cursor this many times.
     */
    public static void moveCursor(Direction direction, Integer amount) {
	command(CONTROL_CODE+amount+direction.getDirection());
    }

    /**
     * Set the character diplayed under the current cursor position.
     *
     * The actual cursor position after calling this method is the
     * same as beforehand.  This method is useful for drawing shapes
     * (for example frame borders) with cursor movement.
     *
     * @param c the literal character to set for the current cursor
     * position.
     */
    public static void setChar(char c) {
	String toPrint = String.valueOf(c);
	command(toPrint);
	moveCursor(Direction.BACKWARD, 1);
    }

    public static void intoRawModeWithoutEcho() {
	String[] cmd = {"/bin/sh", "-c", "stty raw -echo </dev/tty"};       //-echo input is not given back - printed on terminal
		try {
			Runtime.getRuntime().exec(cmd);
		}
		catch(IOException e) {
		  e.printStackTrace();
		}
	}

    public static void intoCookedModeWithEcho() {
	String[] cmd = {"/bin/sh", "-c", "stty cooked echo </dev/tty"};
		try {		  
			Runtime.getRuntime().exec(cmd);
		}
		catch(IOException e) {
		  e.printStackTrace();
		}
	}

    /**
     * Helper function for sending commands to the terminal.
     *
     * The common parts of different commands shall be assembled here.
     * The actual printing shall be handled from this command.
     *
     * @param commandString The unique part of a command sequence.
     */
    private static void command(String commandString) {
	System.out.print(commandString);
    }
}
