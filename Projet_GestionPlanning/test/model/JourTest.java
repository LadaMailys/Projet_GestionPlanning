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
public class JourTest {
    
    private Jour jour;
    
   /** public JourTest() {
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
     * Test of getJour method, of class Jour.
     */
    @Test
    public void testGetJour() {
        System.out.println("getJour");
        Jour instance = new Jour();
        String expResult = "";
        String result = instance.getJour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJour method, of class Jour.
     */
    @Test
    public void testSetJour() {
        System.out.println("setJour");
        String jour = "";
        Jour instance = new Jour();
        instance.setJour(jour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateJour method, of class Jour.
     */
    @Test
    public void testGetDateJour() {
        System.out.println("getDateJour");
        Jour instance = new Jour();
        int expResult = 0;
        int result = instance.getDateJour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateJour method, of class Jour.
     */
    @Test
    public void testSetDateJour() {
        System.out.println("setDateJour");
        int dateJour = 0;
        Jour instance = new Jour();
        instance.setDateJour(dateJour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMois method, of class Jour.
     */
    @Test
    public void testGetMois() {
        System.out.println("getMois");
        Jour instance = new Jour();
        int expResult = 0;
        int result = instance.getMois();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMois method, of class Jour.
     */
    @Test
    public void testSetMois() {
        System.out.println("setMois");
        int mois = 0;
        Jour instance = new Jour();
        instance.setMois(mois);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class Jour.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Jour instance = new Jour();
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnee method, of class Jour.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 0;
        Jour instance = new Jour();
        instance.setAnnee(annee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOuvre method, of class Jour.
     */
    @Test
    public void testIsOuvre() {
        System.out.println("isOuvre");
        Jour instance = new Jour();
        boolean expResult = false;
        boolean result = instance.isOuvre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOuvre method, of class Jour.
     */
    @Test
    public void testSetOuvre() {
        System.out.println("setOuvre");
        Jour instance = new Jour();
        instance.setOuvre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSceanceMatin method, of class Jour.
     */
    @Test
    public void testGetSceanceMatin() {
        System.out.println("getSceanceMatin");
        Jour instance = new Jour();
        Sceance expResult = null;
        Sceance result = instance.getSceanceMatin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSceanceSoir method, of class Jour.
     */
    @Test
    public void testGetSceanceSoir() {
        System.out.println("getSceanceSoir");
        Jour instance = new Jour();
        Sceance expResult = null;
        Sceance result = instance.getSceanceSoir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSceanceMatin method, of class Jour.
     */
    @Test
    public void testSetSceanceMatin() {
        System.out.println("setSceanceMatin");
        Sceance s = null;
        Jour instance = new Jour();
        instance.setSceanceMatin(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSceanceSoir method, of class Jour.
     */
    @Test
    public void testSetSceanceSoir() {
        System.out.println("setSceanceSoir");
        Sceance s = null;
        Jour instance = new Jour();
        instance.setSceanceSoir(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteSceanceMatin method, of class Jour.
     */
    @Test
    public void testAjouteSceanceMatin() {
        System.out.println("ajouteSceanceMatin");
        Module mod = null;
        Jour instance = new Jour();
        instance.ajouteSceanceMatin(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteSceanceSoir method, of class Jour.
     */
    @Test
    public void testAjouteSceanceSoir() {
        System.out.println("ajouteSceanceSoir");
        Module mod = null;
        Jour instance = new Jour();
        instance.ajouteSceanceSoir(mod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jour.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jour instance = new Jour();
        String expResult = "7/9/2015";
        String result = instance.toString();
        assertEquals(expResult, result);
        jour.toString();
        jour.toString();
        assertEquals(9/9/2015, jour.toString());
    }
    
}
