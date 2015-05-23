/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class PromotionTest {
    
    public PromotionTest() {
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
     * Test of getNom method, of class Promotion.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Promotion instance = new Promotion();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Promotion.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Promotion instance = new Promotion();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuree method, of class Promotion.
     */
    @Test
    public void testGetDuree() {
        System.out.println("getDuree");
        Promotion instance = new Promotion();
        int expResult = 0;
        int result = instance.getDuree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuree method, of class Promotion.
     */
    @Test
    public void testSetDuree() {
        System.out.println("setDuree");
        int duree = 0;
        Promotion instance = new Promotion();
        instance.setDuree(duree);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLesModules method, of class Promotion.
     */
    @Test
    public void testGetLesModules() {
        System.out.println("getLesModules");
        Promotion instance = new Promotion();
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getLesModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteModule method, of class Promotion.
     */
    @Test
    public void testAjouteModule() {
        System.out.println("ajouteModule");
        Module mod = null;
        Promotion instance = new Promotion();
        instance.ajouteModule(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retireModule method, of class Promotion.
     */
    @Test
    public void testRetireModule() {
        System.out.println("retireModule");
        Module mod = null;
        Promotion instance = new Promotion();
        instance.retireModule(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
