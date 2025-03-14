package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameInput = name.nextLine();
        System.out.println("Your name is " + nameInput);
    }
}
