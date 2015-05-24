/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import org.junit.Before;
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
        jour = new Jour("lundi",7,9,2015);
        module = new Module("Test 1", Color.blue, "T1", 15, 3);
        instance = new Sceance(jour,module,new Promotion());
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
        assertEquals(module, instance.getModule());
    }

    /**
     * Test of setJourSceance method, of class Sceance.
     */
    @Test
    public void testSetJourSceance() {
        System.out.println("setJourSceance");
        jour = new Jour("lundi",14,9,2015);
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
        instance.setModule(module);
        assertEquals(module, instance.getModule());
    }
    
}
