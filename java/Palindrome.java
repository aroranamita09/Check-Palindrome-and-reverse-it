package com.stackroute;
/*Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
        a. Add all the even numbers and check whether the sum is more than 25.
        b. Print success and failure messages for all 3 conditions*/
public class Palindrome
{
     boolean checkSumOfEven(String numAsString)
    {
        int i, sum = 0;
       /*your code here*/
        if(sum > 25)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean checkPalindrome(String numAsString)
    {
        int i, flag = 0;
       /*your code here*/
    }

    String  check(String str)
    {
       
        if(str.matches("[0-9]+"))
        {
            if(checkPalindrome(str))
            {
                System.out.println("Success! It is a palindrome");
            }
            else{
                System.out.println("Failure! Not a palindrome");
            }
            if(checkSumOfEven(str))
            {
                System.out.println("Sum is greater than 25");
            }
            else
            {
                System.out.println("Sum is less than 25");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
