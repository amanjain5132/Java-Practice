package com.company;
import java.util.Scanner;
class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year=sc.nextInt();
        if (year%4==0){
            System.out.println( year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
            
        }
    }
}
