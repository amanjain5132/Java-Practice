package com.company;
import java.util.Scanner;

public class multiarray
{
    public static void main(String[] args)
    {
     int row , column , i , j ;
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows");
        row = sc.nextInt();

        System.out.println("Enter no of Columns");
        column = sc.nextInt();

     int array[][] = new int[row][column];
        System.out.println("Enter Values");

     for (i = 0 ; i < row ; i++) // row = 2 column = 3
     {
         for (j = 0; j < column; j++)
         {

             array[i][j] = sc.nextInt(); // [0,0] [0,1] [0,2] and [1,0] [1,1] ,[1,2]
         }
     }
        for (i = 0 ; i < row ; i++) // row = 2 column = 3
        {
        for (j = 0; j < column; j++) {
            System.out.print(array[i][j] + " ");
            }
                System.out.println();
        }
    }
}
