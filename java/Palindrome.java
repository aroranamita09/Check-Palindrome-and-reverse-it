package com.stackroute;
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
     boolean checkPalindrome(String numAsString)
    {
        int i, flag = 0;
        /*your code here*/
    }

    String  check(String str) {

        if (str.matches("[0-9]+")) {
            if (checkPalindrome(str)) {
                return  "Success! It is a palindrome";
            } else {
                return "Failure! Not a palindrome";
            }
            if (checkSumOfEven(str)) {
                return "Sum is greater than 25";
            } else {
               return "Sum is less than 25";
            }
        } else {
            return "Invalid input";
        }
    }
}
