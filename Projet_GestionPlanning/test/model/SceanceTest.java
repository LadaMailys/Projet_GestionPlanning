/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
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
    
    Sceance instance;
    Jour jour;
    Module module;
    
    @Before
    public void initialise(){
        jour = new Jour(7,9,2015);
        module = new Module("Test 1", Color.blue, "T1", 15, 3);
        instance = new Sceance(jour,module);
    }

    /**
     * Test of getJourSceance method, of class Sceance.
     */
    @Test
    public void testGetJourSceance() {
        System.out.println("getJourSceance");
        assertEquals(jour, instance.getJourSceance());
    }

    /**
     * Test of getLeModule method, of class Sceance.
     */
    @Test
    public void testGetLeModule() {
        System.out.println("getLeModule");
        assertEquals(module, instance.getLeModule());
    }

    /**
     * Test of setJourSceance method, of class Sceance.
     */
    @Test
    public void testSetJourSceance() {
        System.out.println("setJourSceance");
        jour = new Jour(14,9,2015);
        instance.setJourSceance(jour);
        assertEquals(jour, instance.getJourSceance());
    }

    /**
     * Test of setLeModule method, of class Sceance.
     */
    @Test
    public void testSetLeModule() {
        System.out.println("setLeModule");
        module = new Module("TEST X", Color.red, "TX", 20, 2);
        instance.setLeModule(module);
        assertEquals(module, instance.getLeModule());
    }
    
}
