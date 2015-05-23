/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.ArrayList;
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
public class ModuleTest {
   /** 
    private Module module;
    
    public ModuleTest() {
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
     * Test of getNom method, of class Module.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Module instance = new Module("anglais, rouge, GB,5,20");
        String expResult = "anglais";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Module.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "anglais";
        Module instance = new Module("statistiques, bleu, stats, 6, 18");
        instance.setNom(nom);
        assertEquals ("statistiques", instance.getNom());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCouleur method, of class Module.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Module instance = new Module("anglais, rouge, GB,5,20");
        Color expResult = rouge;
        Color result = instance.getCouleur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCouleur method, of class Module.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        Color couleur = null;
        Module instance = new Module();
        instance.setCouleur(couleur);
    }

    /**
     * Test of getAbbreviation method, of class Module.
     */
    @Test
    public void testGetAbbreviation() {
        System.out.println("getAbbreviation");
        Module instance = new Module("anglais, rouge, GB,5,20");
        String expResult = "GB";
        String result = instance.getAbbreviation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAbbreviation method, of class Module.
     */
    @Test
    public void testSetAbbreviation() {
        System.out.println("setAbbreviation");
        String abbreviation = "";
        Module instance = new Module("statistiques, bleu, stats, 6, 18");
        instance.setAbbreviation(abbreviation);
        assertEquals("stats", instance.getAbbreviation());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNbSceanceTotal method, of class Module.
     */
    @Test
    public void testGetNbSceanceTotal() {
        System.out.println("getNbSceanceTotal");
        Module instance = new Module("anglais, rouge, GB,5,20");
        int expResult = 5;
        int result = instance.getNbSceanceTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNbSceanceTotal method, of class Module.
     */
    @Test
    public void testSetNbSceanceTotal() {
        System.out.println("setNbSceanceTotal");
        int nbSceanceTotal = 5;
        Module instance = new Module("statistiques, bleu, stats, 6, 18");
        instance.setNbSceanceTotal(nbSceanceTotal);
        assertEquals(6, instance.getNbSceanceTotal());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDuree method, of class Module.
     */
    @Test
    public void testGetDuree() {
        System.out.println("getDuree");
        Module instance = new Module("anglais, rouge, GB,5,20");
        int expResult = 20;
        int result = instance.getDuree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDuree method, of class Module.
     */
    @Test
    public void testSetDuree() {
        System.out.println("setDuree");
        int duree = 18;
        Module instance = new Module("statistiques, bleu, stats, 6, 18");
        instance.setDuree(duree);
        assertEquals(18, instance.getDuree());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLesSceancesFaites method, of class Module.
     */
    @Test
    public void testGetLesSceancesFaites() {
        System.out.println("getLesSceancesFaites");
        Module instance = new Module();
        ArrayList<Sceance> expResult = null;
        ArrayList<Sceance> result = instance.getLesSceancesFaites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteSceanceFaite method, of class Module.
     */
    @Test
    public void testAjouteSceanceFaite() {
        System.out.println("ajouteSceanceFaite");
        Sceance laSceance = null;
        Module instance = new Module("statistiques, bleu, stats, 6, 18");
        instance.ajouteSceanceFaite(laSceance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retireSceanceFaite method, of class Module.
     */
    @Test
    public void testRetireSceanceFaite() {
        System.out.println("retireSceanceFaite");
        Sceance laSceance = null;
        Module instance = new Module();
        instance.retireSceanceFaite(laSceance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
