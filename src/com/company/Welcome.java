package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionListener;

public class Welcome {	

	private static void timeSpan(int sec) {
	try {
		Thread.sleep(sec);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	} 

	private static char fillChar = '\u2588';


	private static void drawH() {
		for (int i=0;i<=6;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.UP, 4);
			Terminal.moveCursor(Direction.FORWARD, 1);

			for (int i=0;i<=3;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.UP, 3);

			for (int i=0;i<=6;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
			timeSpan(40);
			}
	} 

	private static void drawE() {
		for (int i=0;i<=6;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.UP, 7);
			Terminal.moveCursor(Direction.FORWARD, 1);

			for (int i=0;i<=3;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.BACKWARD, 5);
			Terminal.moveCursor(Direction.DOWN, 3);
			Terminal.moveCursor(Direction.FORWARD, 1);

			for (int i=0;i<=3;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.BACKWARD, 5);
			Terminal.moveCursor(Direction.DOWN, 3);
			Terminal.moveCursor(Direction.FORWARD, 1);

			for (int i=0;i<=3;i++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}
		}

	private static void drawL() {
		for (int j=0;j<=5;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
			timeSpan(40);
			}
		for (int j=0;j<=3;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}
		}

	private static void drawO() {
		for (int j=0;j<=0;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.UP, 1);

			for (int j=0;j<=3;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.DOWN, 1);

			for (int j=0;j<=0;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.FORWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.DOWN, 1);

			for (int j=0;j<=2;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.BACKWARD, 1);

			for (int j=0;j<=0;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.BACKWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.DOWN, 1);

			for (int j=0;j<=3;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.BACKWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.UP, 1);

			for (int j=0;j<=0;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.BACKWARD, 1);
			timeSpan(40);
			}

			Terminal.moveCursor(Direction.UP, 1);

			for (int j=0;j<=2;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.UP, 1);
			timeSpan(40);
			}
		}


	private static void drawExcl() {
		for (int j=0;j<=4;j++) {
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
			timeSpan(40);
			}
			Terminal.moveCursor(Direction.DOWN, 1);
			Terminal.setChar(fillChar);
			Terminal.moveCursor(Direction.DOWN, 1);
		}


	public static void hello(Color color) {
		Terminal.setColor(color);
		Terminal.moveTo(5,70);
		drawH();

		Terminal.moveCursor(Direction.UP, 7);
		Terminal.moveCursor(Direction.FORWARD, 3);
		drawE();

		for (int i=0;i<=1;i++) {
		Terminal.moveCursor(Direction.UP, 6);
		Terminal.moveCursor(Direction.FORWARD, 2);
		drawL();
		}
		Terminal.moveCursor(Direction.UP, 5);
		Terminal.moveCursor(Direction.FORWARD, 4);
		drawO();

		Terminal.moveCursor(Direction.UP, 1);
		Terminal.moveCursor(Direction.FORWARD,10);
		drawExcl();

		Terminal.resetStyle();
		Terminal.moveTo(15, 0);
		System.out.println();
	}
}

