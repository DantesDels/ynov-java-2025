package fr.ynov.java.java.easy;

public class Arrays {
    public static void main(String[] args) {
        int[] array =  new int[10];

        for (int j : array) {
            System.out.println(j);
        }
        System.out.println();
        for (int i = 0;i < array.length;i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }
    }
}
