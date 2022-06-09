import java.util.Scanner;
class CGPA_Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the First Subject Marks you want to add :");
        float S1 = sc.nextFloat();
        System.out.println("enter the Second Subject Marks you want to add :");
        float S2 = sc.nextFloat();
        System.out.println("enter the Third Subject Marks you want to add :");
        float S3 = sc.nextFloat();
        float CGPA = (S1+S2+S3)/30;
        System.out.println(CGPA);
    }
}
