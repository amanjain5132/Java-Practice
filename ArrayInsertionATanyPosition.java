package com.company;
import java.util.*;

public class ArrayInsertionATanyPos
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i , size , Loc , item ;
        int array[] = new int[100];

        System.out.println(" Enter Array Size: ");
        size = in.nextInt();

        System.out.println("Enter Array Elements");
        for (i = 0 ; i < size ; i++)
        {
            array[i] = in.nextInt();
        }

        System.out.println("Enter Array Location");
        Loc = in.nextInt();

        System.out.println("Enter New Item");
        item = in.nextInt();

        for (i = size ; i > Loc; i--)
        {
            array[i] = array[i - 1];
        }
        array[Loc] = item;
        size++;
        for (i=0 ; i < size ; i++)
        {
            System.out.println(array[i] +"");
        }
    }
}
