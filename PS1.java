package com.company;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class PS1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 Number");
        float N1 = sc.nextFloat();
        System.out.println("Enter 2 Number");
        float N2 = sc.nextFloat();
        System.out.println("Enter 3 Number");
        float N3 = sc.nextFloat();
        float Sum = N1+N2+N3;
        System.out.println("The Sum is : "+Sum+"");

       System.out.println("enter the Marks :");
       System.out.println("1 subject");
        float S1 = sc.nextFloat();
        System.out.println("2 subject");
        float S2 = sc.nextFloat();
        System.out.println("3 subject");
        float S3 = sc.nextFloat();
        float CGPA = (S1+S2+S3)/30;
        System.out.println("the CGPA is : "+CGPA+"");

        System.out.println("What is your name");
        String name = sc.next();
        System.out.println("Hello "+name+" Have a good day");

        System.out.println("Km into mile Conversion :");
        System.out.println("Enter the Km :");
        float KM = sc.nextFloat();
        float miles = (float)(0.6213711922 * KM);
        System.out.println("the Mile is : "+miles+"");

        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());

    }
}


