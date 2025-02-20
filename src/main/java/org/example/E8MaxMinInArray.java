package org.example;
public class E8MaxMinInArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 9, 1, 7, 4, 8, 3};

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array to find max and min
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is greater
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }
        }

        // Print the results
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}




