package com.company;

public class linearsearch
{
    public static void main(String[] args)
    {
        int[] array = {10 , 20 , 30 , 40 , 50 , 60};
        int searchvalue = 20 ;
        boolean flag = false;

        for (int i = 0 ; i < array.length ; i++)
        {
            //System.out.println(array[i]);
            if (searchvalue == array[i])
            {
                System.out.println("Element Found At :" +i);
                flag = true;
                break;
            }
        }
        if (flag == false)
        System.out.println("Element Not Found");
    }
}
