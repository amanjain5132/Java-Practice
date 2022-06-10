import java.util.Scanner;
class Km_Mile_conversion{
    public static void main(String[] args){
System.out.println("Enter the Distance in Kilometers: ");
 Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
     
//Kilometers to miles conversion
        float miles = (float)(0.6213711922 * km);
        
        System.out.println("Distance in miles will be: "+miles);   
    }
    
}
