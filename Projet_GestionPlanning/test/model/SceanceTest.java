/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author U21406901
 */
public class SceanceTest {
    
    public SceanceTest() {
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
     * Test of getJourSceance method, of class Sceance.
     */
    @Test
    public void testGetJourSceance() {
        System.out.println("getJourSceance");
        Sceance instance = new Sceance();
        Jour expResult = null;
        Jour result = instance.getJourSceance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeModule method, of class Sceance.
     */
    @Test
    public void testGetLeModule() {
        System.out.println("getLeModule");
        Sceance instance = new Sceance();
        Module expResult = null;
        Module result = instance.getLeModule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJourSceance method, of class Sceance.
     */
    @Test
    public void testSetJourSceance() {
        System.out.println("setJourSceance");
        Jour jour = null;
        Sceance instance = new Sceance();
        instance.setJourSceance(jour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeModule method, of class Sceance.
     */
    @Test
    public void testSetLeModule() {
        System.out.println("setLeModule");
        Module mod = null;
        Sceance instance = new Sceance();
        instance.setLeModule(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
