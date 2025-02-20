package org.example;

public class E7FibonacciSeries {
    public static void main(String[] args) {
        // Number of Fibonacci numbers to generate
        int n = 10;

        // Initialize the first two numbers of the Fibonacci series
        int first = 0;
        int second = 1;

        System.out.println("First " + n + " numbers of the Fibonacci series:");

        // Print the first two numbers
        System.out.print(first + " " + second + " ");

        // Generate and print the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            int next = first + second; // Calculate the next Fibonacci number
            System.out.print(next + " ");

            // Update the values of first and second
            first = second;
            second = next;
        }
    }
}
