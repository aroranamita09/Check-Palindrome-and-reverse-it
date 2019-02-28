package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.*;

 class PalindromeReverseTest {
    @Test
    public void testReverseString() throws Exception{
        String expectedValue = "Yes";
        Palindrome data=new Palindrome();
        String actualValue=data.ReverseString("namiman");
        assertEquals(expectedValue, actualValue);
        }
        @Test
        public void testReverseAString() throws Exception{
            String expectedValue1 = "maniman";
            Palindrome var=new Palindrome();
            String actualValue1=var.ReverseString("namiman");
            assertEquals(expectedValue, actualValue1);
    }
}
