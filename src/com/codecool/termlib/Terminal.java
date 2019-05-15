package com.codecool.termlib;

public class Terminal {
    /**
     * The beginning of control sequences.
     */
    // HINT: In \033 the '0' means it's an octal number. And 33 in octal equals 0x1B in hexadecimal.
    // Now you have some info to decode that page where the control codes are explained ;)
    private static final String CONTROL_CODE = "\033[";
    /**
     * Command for whole screen clearing.
     * <p>
     * Might be partitioned if needed.
     */
    private static final String CLEAR = "2J";
    /**
     * Command for moving the cursor.
     */
    private static final String MOVE = "H";
    /**
     * Command for printing style settings.
     * <p>
     * Handles foreground color, background color, and any other
     * styles, for example color brightness, or underlines.
     */
    private static final String STYLE = "m";

    /**
     * Reset printing rules in effect to terminal defaults.
     * <p>
     * Reset the color, background color, and any other style
     * (i.e.: underlined, dim, bright) to the terminal defaults.
     */
    public static void resetStyle() {
        command(CONTROL_CODE + Attribute.RESET.getAttribute() + STYLE);
    }

    /**
     * Clear the whole screen.
     * <p>
     * Might reset cursor position.
     */
    public static void clearScreen() {
        command(CONTROL_CODE + CLEAR);
    }


    /**
     * Get cursos position.
     * <p>
     * cursor position.
     */
    public static void getCursorPosition() {
        command(CONTROL_CODE + "6n");
    }


    /**
     * Move cursor to the given position.
     * <p>
     * Positions are counted from one.  Cursor position 1,1 is at
     * the top left corner of the screen.
     *
     * @param x Column number.
     * @param y Row number.
     */
    public static void moveTo(Integer x, Integer y) {
        command(CONTROL_CODE + x + ";" + y + MOVE);
    }

    /**
     * Set the foreground printing color.
     * <p>
     * Already printed text is not affected.
     *
     * @param color The color to set.
     */
    public static void setColor(Color color) {
        command(CONTROL_CODE + color.getColor() + STYLE);
    }

    /**
     * Set the background printing color.
     * <p>
     * Already printed text is not affected.
     *
     * @param color The background color to set.
     */
    public static void setBgColor(Color color) {
        String bgColor = "4" + color.getColor().split("")[1];
        command(CONTROL_CODE + bgColor + STYLE);
    }

    /**
     * Make printed text underlined.
     * <p>
     * On some terminals this might produce slanted text instead of
     * underlined.  Cannot be turned off without turning off colors as
     * well.
     */
    public static void setUnderline() {
        command(CONTROL_CODE + Attribute.UNDERSCORE.getAttribute() + STYLE);
    }

    /**
     * Move the cursor relatively.
     * <p>
     * Move the cursor amount from its current position in the given
     * direction.
     *
     * @param direction Step the cursor in this direction.
     * @param amount    Step the cursor this many times.
     */
    public static void moveCursor(Direction direction, Integer amount) {
        command(CONTROL_CODE+amount+direction);
    }

    /**
     * Set the character diplayed under the current cursor position.
     * <p>
     * The actual cursor position after calling this method is the
     * same as beforehand.  This method is useful for drawing shapes
     * (for example frame borders) with cursor movement.
     *
     * @param c the literal character to set for the current cursor
     *          position.
     */
    public static void setChar(char c) {
        //command(CONTROL_CODE+c);
    }

    /**
     * Helper function for sending commands to the terminal.
     * <p>
     * The common parts of different commands shall be assembled here.
     * The actual printing shall be handled from this command.
     *
     * @param commandString The unique part of a command sequence.
     */
    private static void command(String commandString) {
        System.out.println(commandString);
    }
}
