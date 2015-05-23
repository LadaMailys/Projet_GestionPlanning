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
    
    /**public JourTest() {
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
        Jour instance = new Jour("lundi", 7,9,2015);
        String expResult = "lundi";
        String result = instance.getJour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJour method, of class Jour.
     */
    @Test
    public void testSetJour() {
        System.out.println("setJour");
        String jour = "samedi";
        Jour instance = new Jour("samedi", 12,9,2015);
        instance.setJour(jour);
        assertEquals("samedi", instance.getJour());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateJour method, of class Jour.
     */
    @Test
    public void testGetDateJour() {
        System.out.println("getDateJour");
        Jour instance = new Jour("lundi",7,9,2015);
        int expResult = 7;
        int result = instance.getDateJour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDateJour method, of class Jour.
     */
    @Test
    public void testSetDateJour() {
        System.out.println("setDateJour");
        int dateJour = 12;
        Jour instance = new Jour("samedi",12,9,2015);
        instance.setDateJour(dateJour);
        assertEquals( 12, instance.getDateJour());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMois method, of class Jour.
     */
    @Test
    public void testGetMois() {
        System.out.println("getMois");
        Jour instance = new Jour("lundi", 7,9,2015);
        int expResult = 9;
        int result = instance.getMois();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMois method, of class Jour.
     */
    @Test
    public void testSetMois() {
        System.out.println("setMois");
        int mois = 10;
        Jour instance = new Jour("lundi", 7,10,2015);
        instance.setMois(mois);
        assertEquals(10, instance.getMois());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class Jour.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Jour instance = new Jour("lundi", 7,9,2015);
        int expResult = 2015;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnee method, of class Jour.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 2016;
        Jour instance = new Jour("vendredi", 7,9,2016);
        int expResult = 2016;
        instance.setAnnee(annee);
        assertEquals(2016, instance.getAnnee());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isOuvre method, of class Jour.
     */
    @Test
    public void testIsOuvre() {
        System.out.println("isOuvre");
        Jour instance = new Jour("lundi", 7,9,2015);
        boolean expResult = true;
        boolean result = instance.isOuvre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOuvre method, of class Jour.
     */
    @Test
    public void testSetOuvre() {
        System.out.println("setOuvre");
        Jour instance = new Jour("samedi", 12,9,2015);
        instance.setOuvre();
        assertEquals(false, instance.isOuvre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jour.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jour instance = new Jour("lundi", 7,9,2015);
        String expResult = "7/9/2015";
        String result = instance.toString();
        assertEquals(expResult, result);
        Jour jour = new Jour ("samedi", 12,9,2015);
        jour.toString();
        jour.toString();
        assertEquals("samedi 12/9/2015", jour.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
