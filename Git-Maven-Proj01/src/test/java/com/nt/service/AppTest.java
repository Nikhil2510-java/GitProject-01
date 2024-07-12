package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.nt.sbean.ArthematicOpration;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testWithPositiveNumber()
    {
    	ArthematicOpration ar=new ArthematicOpration();
    	double actual=ar.sumOftwoNum(40, 50);
    	double excepected=90;
        assertEquals(excepected, actual);
    }
}
