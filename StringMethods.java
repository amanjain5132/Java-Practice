import java.util.Scanner;
class String_Methods
{
    public static void main(String[] args) 
    {
        String name = "AmanJain";
        
        int value = name.length();// length() : count the length of string
        System.out.println(value); 
       
        //String Lstring = name.toLowerCase();//Converts all the characters of the string to the lower case letters.
        //System.out.println(Lstring); 
       
        //String Upstring = name.toUpperCase();////Converts all the characters of the string to the upper case letters.
       // System.out.println(Upstring);
        
        //String nonTrimmedString = "        AmanJain      ";
        //System.out.println(nonTrimmedString);
        
        //String trimmedstring = nonTrimmedString.trim(); //Returns a new String after removing all the leading and trailing spaces from the original string.
        //System.out.println(trimmedstring);
        
        //System.out.println(name.substring(5));//Returns a substring from start to the end. Substring(5) returns “ain”. 
        //[Note that indexing starts from 0]
        
        //System.out.println(name.substring(1,8));//Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
        
        //System.out.println(name.replace('A', 'p'));//Returns a new string after replacing A with p. pmanJain is returned in this case. (This method takes char as argument)
        
        //System.out.println(name.startsWith("Am”));//Returns true if the name starts with the string “Am”. (True in this case)

        //System.out.println(name.endsWith(“in”)); Returns true if the name ends with the string “in”. (True in this case)
        
        // System.out.println(name.charAt(7)); // Returns the character at a given index position. (n in this case)

        //System.out.println(name.indexOf(“J”));//Returns the index of the first occurrence of the specified character in the given string.
 
        //System.out.println(name.lastIndexOf(“n”));//Returns the last index of the specified character from the given string. (7 in this case)

        //System.out.println(name.equals(“AmanJain”));Returns true if the given string is equal to “AmanJain” false otherwise [Case sensitive]

        //System.out.println(name.equalsIgnoreCase(“amanjain”));//Returns true if two strings are equal, ignoring the case of characters.


    }
}
