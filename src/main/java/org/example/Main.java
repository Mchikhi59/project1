package org.example;

public class Main {
    public static void main(String[] args) {

        /* *3*   Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even numbers
        only*/
        // Create a 2D array with a mix of odd and even numbers
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Loop through the 2D array to find and print even numbers
        System.out.println("Even numbers in the 2D array:");
        for (int[] row : numbers) {
            for (int number : row) {
                if (number % 2 == 0) { // Check if the number is even
                    System.out.print(number + " ");
                }
            }
        }

    }
}