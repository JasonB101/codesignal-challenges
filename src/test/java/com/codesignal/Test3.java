package com.codesignal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test3 {
    private String str;
    private boolean expected;

    public Test3(String str, boolean expected){
        this.str = str;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection params(){
        return Arrays.asList(new Object[][] {
                {"racecar", true},
                {"aabaa", true},
                {"a", true},
                {"nope", false},
                {"Racecar", true}


        });
    }

    @Test
    public void Test3(){
        System.out.println("String: " + str);
        Problem3 problem = new Problem3();
        boolean result = problem.checkPalindrome(str);

        Assert.assertEquals(expected, result);
    }


}
