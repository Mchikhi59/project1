package org.example;

import java.util.Scanner;

public class forLoopp {
    public static void main(String[] args) {

            String[][] grocery = new String[3][3];

            Scanner scanner = new Scanner(System.in);

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.println("Please Enter the item name ");
                    grocery[row][col] = scanner.next();
                }

            }
            System.out.println("Your grocery items are");

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.print(grocery[row][col]+" ");
                }
                System.out.println();
            }


        }
    }




