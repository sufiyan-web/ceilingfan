/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inhouse.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sufiy
 */
public class StartFanTest {
    
    public StartFanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setUpClass method, of class StartFanTest.
     */
    @Test
    public void testSetUpClass() {
        System.out.println("setUpClass");
        StartFanTest.setUpClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDownClass method, of class StartFanTest.
     */
    @Test
    public void testTearDownClass() {
        System.out.println("tearDownClass");
        StartFanTest.tearDownClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUp method, of class StartFanTest.
     */
    @Test
    public void testSetUp() {
        System.out.println("setUp");
        StartFanTest instance = new StartFanTest();
        instance.setUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tearDown method, of class StartFanTest.
     */
    @Test
    public void testTearDown() {
        System.out.println("tearDown");
        StartFanTest instance = new StartFanTest();
        instance.tearDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
