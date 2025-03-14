package fr.ynov.java.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int firstNumber = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter your operator : ");
        String operator = scan2.nextLine();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter your second number : ");
        int secondNumber = scan3.nextInt();

        String Equation = firstNumber + operator + secondNumber;
        System.out.println("The Equation is : " + Equation);

        int result = switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> 0;
        };
        System.out.print("Your result is : "+ result);
    }
}
