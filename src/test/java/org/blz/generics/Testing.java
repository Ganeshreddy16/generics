package org.blz.generics;

import org.junit.Assert;
import org.junit.Test;


public class Testing
{

    @Test
    public void shouldFindMAxFloat_findCorrectOne_fromGiven3Values()
    {
       float ActualResult = Maximum.getMaximum(8.4f,3.3f,4.5f);
        Assert.assertEquals(8.4f,ActualResult,0.0);
    }
}
