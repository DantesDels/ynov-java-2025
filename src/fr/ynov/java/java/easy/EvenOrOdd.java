package fr.ynov.java.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner evenOrOdd = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int evenOrOddInput = Integer.parseInt(evenOrOdd.nextLine());

            if (evenOrOddInput % 2 == 0)
            {
                System.out.println("Your number is : " + evenOrOddInput);
                System.out.println("So the number is Even");
            } else{
                System.out.println("Your number is : " + evenOrOddInput);
                System.out.println("So the number is Odd");
            }
        }
    }
