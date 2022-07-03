package com.company;

public class SUMARRAY
{
    public static void main(String[] args)
    {
    float[] Marks = {55.7f,33.5f,77.3f,53.7f,33.9f};
    float sum = 0;
    for (float element:Marks){
        sum = sum + element;
    }
        System.out.println("the TOTAL iS "+sum);
    }
}
