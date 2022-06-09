// Calculate Student percentage and marks 

import java.util.Scanner;

class Student_Marks_Calculator_by_Amanjain
{
public static void main(String args[])
{
     float S1 , S2 , S3, S4 , S5; 
     double total, average, percentage;
     
    Scanner op=new Scanner(System.in);
    
    /* Input marks of all five subjects */
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subjects:");
    S1=op.nextFloat();
    System.out.print("Enter marks of physics subjects:");
    S2=op.nextFloat();
    System.out.print("Enter marks of chemistry subjects:");
    S3=op.nextFloat();
    System.out.print("Enter marks of maths subjects:");
    S4=op.nextFloat();
    System.out.print("Enter marks of computers subjects:");
    S5=op.nextFloat();

    /* Calculate total, average and percentage */
    total = S1 + S2 + S3 + S4 + S5;
    average = (total / 5.0);
    percentage = (total / 500.0) * 100;

    /* Print all results */
    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
    System.out.println("Percentage = "+percentage);

   }
}
