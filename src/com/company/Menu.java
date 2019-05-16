package com.company;
import java.util.Scanner;


public class Menu {

    public static void init() {
        input();
    }

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new command");
        scanner.nextLine();
    }

}
