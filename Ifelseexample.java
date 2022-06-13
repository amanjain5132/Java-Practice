import java.util.Scanner;
public class Switch_CAseElseIFEXAMPLE {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age to check your Experiance");
        
        int age = input.nextInt();
        
        if(age>55)
        {
            System.out.println("you are experianced");
        }
        else if (age>46)
        {
            System.out.println("you are Semi-experianced");
        }
        else if (age>36)
        {
            System.out.println("you are Semi-Semi-experianced");
        }
        else 
        {
            System.out.println("You are not experianced");
        }
    }
}


