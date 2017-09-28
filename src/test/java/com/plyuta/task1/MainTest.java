/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plyuta.task1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @version 1.0.0.0
 * @author Pliuta Mykhailo, mykhailo.pliuta@gmail.com, plyuta.misha@gmail.com
 */
public class MainTest {

    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = new String[2];
        args[0] = "New York";
        args[1] = "America/New_York";
        Main.main(args);
    }

}
