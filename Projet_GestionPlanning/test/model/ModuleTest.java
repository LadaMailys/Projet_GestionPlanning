/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author U21406901
 */
public class ModuleTest {
    
    Module instance;
    
    @Before
    public void initialise(){
        instance = new Module("anglais", Color.RED, "EN",5);
    }

    /**
     * Test of getNom method, of class Module.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        assertEquals("anglais", instance.getNom());
    }

    /**
     * Test of setNom method, of class Module.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        instance.setNom("Statistiques");
        assertEquals ("Statistiques", instance.getNom());
    }

    /**
     * Test of getCouleur method, of class Module.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        assertEquals(Color.red, instance.getCouleur());
    }

    /**
     * Test of setCouleur method, of class Module.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        instance.setCouleur(Color.blue);
        assertEquals(Color.blue, instance.getCouleur());
    }

    /**
     * Test of getAbbreviation method, of class Module.
     */
    @Test
    public void testGetAbbreviation() {
        System.out.println("getAbbreviation");
        assertEquals("EN", instance.getAbbreviation());
    }

    /**
     * Test of setAbbreviation method, of class Module.
     */
    @Test
    public void testSetAbbreviation() {
        System.out.println("setAbbreviation");
        instance.setAbbreviation("ANG");
        assertEquals("ANG", instance.getAbbreviation());
    }

    /**
     * Test of getNbSceanceTotal method, of class Module.
     */
    @Test
    public void testGetNbSceanceTotal() {
        System.out.println("getNbSceanceTotal");
        assertEquals(5, instance.getNbSceanceTotal());
    }

    /**
     * Test of setNbSceanceTotal method, of class Module.
     */
    @Test
    public void testSetNbSceanceTotal() {
        System.out.println("setNbSceanceTotal");
        instance.setNbSceanceTotal(15);
        assertEquals(15, instance.getNbSceanceTotal());
    }
}
