package com.codesignal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {

    private int year;
    private int expected;

    public Test2(int year, int expected){
        this.year = year;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][] {
                {1700, 17},
                {1905, 20},
                {1988, 20},
                {2000, 20},
                {8, 1}
        });
    }

    @Test
    public void Test2(){
        Problem2 problem = new Problem2();

        int result = problem.centuryFromYear(year);

        System.out.print("Year: " + year);
        Assert.assertEquals(expected, result);

    }


}
