package com.kishore.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void passTest(){
        assert(true);
    }

    @Test
    public void failTest(){
        fail("Intentionally failing to test webhook!");
    }
}
