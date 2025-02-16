package org.example;

public class E9secondLargestNumber {
    public static void main(String[] args) {
        int [] numbers={10,12,42,85,34,96,10,52,};
        int largest=numbers[0];
        int secondLargest=numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = numbers[i]; // Update largest
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i]; // Update second largest
            }

        }
        System.out.println("The second largest number is: " + secondLargest);


    }
}
