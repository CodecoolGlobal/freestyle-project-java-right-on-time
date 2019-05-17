package com.company;

import com.codecool.termlib.*;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionListener;

public class Welcome {	

	public static void hello() {
		

		Terminal.moveTo(5,70);
		//H
		for (int i=0;i<=6;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 4);
		Terminal.moveCursor(Direction.FORWARD, 1);

		for (int i=0;i<=3;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 3);

		for (int i=0;i<=6;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 7);
		Terminal.moveCursor(Direction.FORWARD, 2);

		for (int i=0;i<=6;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 7);
		Terminal.moveCursor(Direction.FORWARD, 1);

		for (int i=0;i<=3;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.BACKWARD, 5);
		Terminal.moveCursor(Direction.DOWN, 3);
		Terminal.moveCursor(Direction.FORWARD, 1);

		for (int i=0;i<=3;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.BACKWARD, 5);
		Terminal.moveCursor(Direction.DOWN, 3);
		Terminal.moveCursor(Direction.FORWARD, 1);

		for (int i=0;i<=3;i++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		for (int i=0;i<=1;i++) {
		Terminal.moveCursor(Direction.UP, 6);
		Terminal.moveCursor(Direction.FORWARD, 2);

		for (int j=0;j<=5;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}
		for (int j=0;j<=3;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		}

		//O
		Terminal.moveCursor(Direction.UP, 5);
		Terminal.moveCursor(Direction.FORWARD, 4);

		for (int j=0;j<=0;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 1);

		for (int j=0;j<=3;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.DOWN, 1);

		for (int j=0;j<=0;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.FORWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.DOWN, 1);

		for (int j=0;j<=2;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.BACKWARD, 1);

		for (int j=0;j<=0;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.BACKWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.DOWN, 1);

		for (int j=0;j<=3;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.BACKWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 1);

		for (int j=0;j<=0;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.BACKWARD, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		Terminal.moveCursor(Direction.UP, 1);

		for (int j=0;j<=2;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.UP, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}

		//!

		Terminal.moveCursor(Direction.UP, 1);
		Terminal.moveCursor(Direction.FORWARD,10);

		for (int j=0;j<=4;j++) {
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);
		try {
				Thread.sleep(40);
			    } catch (InterruptedException e) {
				e.printStackTrace();
			    }
		}
		Terminal.moveCursor(Direction.DOWN, 1);
		Terminal.setChar('*');
		Terminal.moveCursor(Direction.DOWN, 1);


		Terminal.moveTo(15, 0);
		System.out.println();
			}

}

