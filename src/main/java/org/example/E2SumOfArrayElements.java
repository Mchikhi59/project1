package org.example;

public class E2SumOfArrayElements {
    public static void main(String[] args) {
        // Create an array of integer values
        int[] numbers = {10, 20, 30, 40, 50};

        // Initialize a variable to store the sum
        int sum = 0;

        // Loop through the array and calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add each element to the sum
        }

        // Print the sum of all elements
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
