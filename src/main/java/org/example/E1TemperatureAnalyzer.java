package org.example;
import java.util.Scanner;

public class E1TemperatureAnalyzer {
    public static void main(String[] args) {
        // Array to store temperatures for a week
        double[] temperatures = new double[7];
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        // Input temperatures for each day of the week
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter the temperature for " + daysOfWeek[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Initialize variables to store the highest and lowest temperatures
        double highestTemp = temperatures[0];
        double lowestTemp = temperatures[0];

        // Loop through the array to find the highest and lowest temperatures
        for (double temp : temperatures) {
            if (temp > highestTemp) {
                highestTemp = temp;
            }
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }

        // Output the results
        System.out.println("\nThe highest temperature for the week is: " + highestTemp + "°C");
        System.out.println("The lowest temperature for the week is: " + lowestTemp + "°C");

        scanner.close();
    }
}
