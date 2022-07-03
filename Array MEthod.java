package com.company;

public class cwh_array2 {
    public static void main(String[] args) {
        int[] marks = {11, 33, 44, 66, 77, 88};
        System.out.println("Printing using NAive Method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        //Display Array in Simple way
        //array Traversal
        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Display the element in For EAch loop
        System.out.println("Printing using for each loop ");
        for (int Element : marks){
            System.out.println(Element);
        }
    }
}
