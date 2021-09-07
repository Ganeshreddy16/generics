package org.blz.generics;

import org.junit.Assert;
import org.junit.Test;


public class Testing
{
    @Test
    public void shouldFindMAxInteger_findCorrectOne_fromGiven3Values()
    {
        int ActualResult = Maximum.getMaximum(8,3,4);
        Assert.assertEquals(8,ActualResult);
    }
    @Test
    public void shouldFindMAxFloat_findCorrectOne_fromGiven3Values()
    {
        float ActualResult = Maximum.getMaximum(8.4f,3.3f,4.5f);
        Assert.assertEquals(8.4f,ActualResult,0.0);
    }

    @Test
    public void shouldFindMaxString_findCorrectOne_fromGiven3Values()
    {
       String ActualResult = Maximum.getMaximum("gh","ij","kl");
        Assert.assertEquals("kl",ActualResult);
    }

    @Test
    public void shouldFindMaxinClass_findCorrectOne_fromGiven3Values()
    {
       Maximum maximum = new Maximum<>(1,2,3);
       int ActualResult = (int) maximum.getMaximum();
       Assert.assertEquals(3,ActualResult);
    }
}
