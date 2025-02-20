package org.exa;

import java.util.Scanner;

public class E6PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= number; i++) {


        if (number % i == 0) {
            count++;
        }
            }if (count==2){
                System.out.println(number+"is a prime number");
            }else {
                System.out.println(number+"is not a prime number");
            }


        }
    }


