package org.example;

public class E10Duplicate {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

        // Print duplicate elements
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
