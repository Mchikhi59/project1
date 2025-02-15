package org.example;

public class Main {
    public static void main(String[] args) {

        /* *3*   Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even numbers
        only*/
        int num [][]={
                {1, 2, 3, 20, 40},
                {9, 30, 13},
                {16, 8, 4},
                {5, 12, 18}
        };
        for (int i=0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
                if ( num[i][j] %2==0){
                    System.out.print(num[i][j]+" ");

                }
            }
            System.out.println();

        }

    }
}