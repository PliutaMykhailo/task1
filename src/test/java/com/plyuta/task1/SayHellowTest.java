/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plyuta.task1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @version 1.0.0.0
 * @author Pliuta Mykhailo, mykhailo.pliuta@gmail.com, plyuta.misha@gmail.com
 */
public class SayHellowTest {

    public SayHellowTest() {
    }

    @BeforeClass
    public static void allTestsStarted() {
        System.out.println("All tests started");
    }

    @AfterClass
    public static void allTestsFinished() {
        System.out.println("All tests finished");
    }

    @Before
    public void testStarted() {
        System.out.println("Started");
    }

    @After
    public void testFinished() {
        System.out.println("Finished");
    }

    /**
     * Test of getZone method, of class SayHellow.
     */
    @Test
    public void testGetZone() {
        System.out.println("getZone");
        String city = "Isle of Man";
        SayHellow instance = new SayHellow();
        String expResult = "Europe/Isle_of_Man";
        String result = instance.getZone(city);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of printHello method, of class SayHellow.
     */
    @Test
    public void testPrintHello() {
        System.out.println("printHello");
        String city = "";
        String tZone = "";
        SayHellow instance = new SayHellow();
        instance.printHello(city, tZone);
    }
}
