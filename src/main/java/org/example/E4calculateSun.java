package org.example;

public class E4calculateSun {

    public static void main(String[] args) {
        /*Create a 2D array of integers. Develop a program which will calculate the
        sum of even and odd numbers for that array.*/

        int[][] array = {
                {1, 3, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumEven = 0, sumOdd = 0;

        // Loop through each row (1D array)
        for (int[] row : array)
            for (int num : row) { // Loop through each element in the row
                if (num % 2 == 0) {
                    sumEven += num;/*0+num*/
                } else {
                    sumOdd += num;
                }
            }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}


