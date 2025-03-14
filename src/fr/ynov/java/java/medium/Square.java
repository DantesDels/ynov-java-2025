package fr.ynov.java.java.medium;

import java.util.Scanner;

public class Square {

    static void mySquareMethod(int parameter){
        System.out.println("The Equation is : "+ parameter + "^2");
        parameter = parameter*parameter;
        System.out.println("Your result is : "+ parameter);
    };

    static void mySquareInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose your Number : ");
        int parameter = scan.nextInt();
        System.out.println("The Equation is : "+ parameter + "^2");
        parameter = parameter*parameter;
        System.out.println("Your result is : "+ parameter);
    }

    static void chooseMethod(String parameter) {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Select a method : ");
        System.out.println("1. SquareMethod - the parameter is already set (" + parameter + ")");
        System.out.println("2. SquareInput - you can choose the parameter");
        int choice = userChoice.nextInt();
        switch (choice) {
            case 1: mySquareMethod(Integer.parseInt(parameter));
            case 2: mySquareInput();
        }
    }

    public static void main(String[] args) {
        chooseMethod(args[0]);
    }
}
