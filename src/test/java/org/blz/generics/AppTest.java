package org.blz.generics;

import org.junit.Assert;
import org.junit.Test;


public class AppTest 
{

    @Test
    public void shouldFindMAxInteger_findCorrectOne_fromGiven3Values()
    {
       int ActualResult = Maximum.getMaximum(8,3,4);
        Assert.assertEquals(8,ActualResult);
    }
}
