package com.company;

import com.codecool.termlib.*;

public class Main {


public static void main(String[] args) {
	//getCursorPosition();
	Terminal.setColor(Color.GREEN);
	Terminal.setBgColor(Color.YELLOW);
	System.out.println("newgreen");
	Terminal.setUnderline();
	System.out.println("underlinegreen");
	Terminal.resetStyle();
	System.out.println("reseted");
	//clearScreen();
	//moveTo(10, 0);
	//moveCursor(Direction.UP, 6);
	}

}
