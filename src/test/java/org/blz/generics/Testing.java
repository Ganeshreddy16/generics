package org.blz.generics;

import org.junit.Assert;
import org.junit.Test;


public class Testing
{

    @Test
    public void shouldFindMaxString_findCorrectOne_fromGiven3Values()
    {
       String ActualResult = Maximum.getMaximum("gh","ij","kl");
        Assert.assertEquals("kl",ActualResult);
    }
}
