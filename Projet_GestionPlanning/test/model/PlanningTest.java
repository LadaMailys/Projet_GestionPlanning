/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author U21406901
 */
public class PlanningTest {
    
    Planning instance;
    
    @Before
    public void initialise() {
        instance = new Planning(new Promotion("TEST",3), 2015);
    }

    /**
     * Test of getNbSemainesAnnee method, of class Planning.
     */
    @Test
    public void testGetNbSemainesAnnee() {
        System.out.println("getNbSemainesAnnee");
        assertEquals(51,instance.getNbSemainesAnnee());
    }

    /**
     * Test of getLaSemaine method, of class Planning.
     */
    @Test
    public void testGetLaSemaine() {
        System.out.println("getLaSemaine");
        for (int i = 1;i<instance.getNbSemainesAnnee();i++){
            assertTrue(instance.getLaSemaine(i).size() == 7);
        }
    }

    /**
     * Test of getLaPromotion method, of class Planning.
     */
    @Test
    public void testGetLaPromotion() {
        assertNotNull(instance.getLaPromotion());
        assertEquals("TEST", instance.getLaPromotion().getNom());
    }

    /**
     * Test of setLaPromotion method, of class Planning.
     */
    @Test
    public void testSetLaPromotion() {
        System.out.println("setLaPromotion");
        Promotion promo = new Promotion("TOTO", 5);
        assertNotSame(instance.getLaPromotion(), promo);
        instance.setLaPromotion(promo);
        assertSame(instance.getLaPromotion(), promo);
    }

    /**
     * Test of getAnnee method, of class Planning.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        assertEquals(2015, instance.getAnnee());
    }

    /**
     * Test of setAnnee method, of class Planning.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        instance.setAnnee(2020);
        assertEquals(2020, instance.getAnnee());
    }

    /**
     * Test of rangJourToString method, of class Planning.
     */
    @Test
    public void testRangJourToString() {
        System.out.println("rangJourToString");
        assertEquals("Lundi", instance.rangJourToString(2));
    }

    /**
     * Test of getJour method, of class Planning.
     */
    @Test
    public void testGetJour() {
        System.out.println("getJour");
        assertNotNull(instance.getJour(10, 10, 2015));
    }

    /**
     * Test of codeHTML method, of class Planning.
     */
    @Test
    public void testCodeHTML() {
        System.out.println("codeHTML");
        assertNotNull(instance.codeHTML());
    }
    
}
