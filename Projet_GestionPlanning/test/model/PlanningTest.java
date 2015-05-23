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
public class PlanningTest {
    
    public PlanningTest() {
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
     * Test of getNbSemainesAnnee method, of class Planning.
     */
    @Test
    public void testGetNbSemainesAnnee() {
        System.out.println("getNbSemainesAnnee");
        Planning instance = new Planning();
        int expResult = 0;
        int result = instance.getNbSemainesAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaSemaine method, of class Planning.
     */
    @Test
    public void testGetLaSemaine() {
        System.out.println("getLaSemaine");
        int rang = 0;
        Planning instance = new Planning();
        ArrayList<Jour> expResult = null;
        ArrayList<Jour> result = instance.getLaSemaine(rang);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaPromotion method, of class Planning.
     */
    @Test
    public void testGetLaPromotion() {
        System.out.println("getLaPromotion");
        Planning instance = new Planning();
        Promotion expResult = null;
        Promotion result = instance.getLaPromotion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLaPromotion method, of class Planning.
     */
    @Test
    public void testSetLaPromotion() {
        System.out.println("setLaPromotion");
        Promotion laPromotion = null;
        Planning instance = new Planning();
        instance.setLaPromotion(laPromotion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class Planning.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Planning instance = new Planning();
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnee method, of class Planning.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 0;
        Planning instance = new Planning();
        instance.setAnnee(annee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remplirCalendrier method, of class Planning.
     */
    @Test
    public void testRemplirCalendrier() {
        System.out.println("remplirCalendrier");
        Planning instance = new Planning();
        instance.remplirCalendrier();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rangJourToString method, of class Planning.
     */
    @Test
    public void testRangJourToString() {
        System.out.println("rangJourToString");
        int rang = 0;
        Planning instance = new Planning();
        String expResult = "";
        String result = instance.rangJourToString(rang);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJour method, of class Planning.
     */
    @Test
    public void testGetJour() {
        System.out.println("getJour");
        int jour = 0;
        int mois = 0;
        int annee = 0;
        Planning instance = new Planning();
        Jour expResult = null;
        Jour result = instance.getJour(jour, mois, annee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serialiser method, of class Planning.
     */
    @Test
    public void testSerialiser() {
        System.out.println("serialiser");
        Planning p = null;
        Planning.serialiser(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deserialiser method, of class Planning.
     */
    @Test
    public void testDeserialiser() {
        System.out.println("deserialiser");
        Planning expResult = null;
        Planning result = Planning.deserialiser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of codeHTML method, of class Planning.
     */
    @Test
    public void testCodeHTML() {
        System.out.println("codeHTML");
        Planning instance = new Planning();
        String expResult = "";
        String result = instance.codeHTML();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
