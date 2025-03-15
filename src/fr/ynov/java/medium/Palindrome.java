package fr.ynov.java.medium;

import java.io.IOException;
import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome0(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome1(String str) {
        int i = 0, j = str.length() - 1;
        do {
            i++;
            j--;
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        } while (i < j && str.charAt(i) != str.charAt(j));
        return true;
    }

    public static boolean isReverse(){
        Scanner keyboard =  new Scanner(System.in);
        System.out.print("Please type something: ");
        String line = ((keyboard.nextLine()).toLowerCase()).replaceAll("\\W","");
        return (line.equals(new StringBuffer(line).reverse().toString()));
    }

    public static void main(String[] args) throws IOException {
        checkPalindrome0("radar");
        checkPalindrome0("ra");

        checkPalindrome1("le");
        checkPalindrome1("level");

        boolean b1 = checkPalindrome0("radar");
        boolean b2 = checkPalindrome0("ra");

        boolean b3 = checkPalindrome1("le");
        boolean b4 = checkPalindrome1("level");

        System.out.println(b1 + " b1 Test");
        System.out.println(b2 + " b2 Test");

        System.out.println(b3 + " b3 Test");
        System.out.println(b4 + " b4 Test");

        if(isReverse()){
            System.out.println("This is a palindrome.");
        } else {
            System.out.print("This is not a palindrome");
        }
    }
}