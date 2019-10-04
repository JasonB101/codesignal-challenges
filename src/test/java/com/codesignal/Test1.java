package com.codesignal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {

    private int a;
    private int b;
    private int expected;

    public Test1(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][] {
                {1, 2, 3},
                {0, 1000, 1000},
                {-1, -2, -3}
        });
    }

    @Test
    public void test1(){
        Problem1 problem = new Problem1();

        int result = problem.sum(a, b);

        Assert.assertEquals(expected, result);

    }
}
