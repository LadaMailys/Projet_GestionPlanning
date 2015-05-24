/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author U21406901
 */
public class JourTest {

    private Jour jour;

    /**
     * Test of getJour method, of class Jour.
     */
    @Test
    public void testGetJour() {
        System.out.println("getJour");
        jour = new Jour("lundi", 7, 9, 2015);
        assertEquals("lundi", jour.getJour());
    }

    /**
     * Test of setJour method, of class Jour.
     */
    @Test
    public void testSetJour() {
        System.out.println("setJour");
        jour = new Jour("lundi", 12, 9, 2015);
        jour.setJour("mardi");
        assertEquals("mardi", jour.getJour());
        assertEquals(true, jour.isOuvre());

        jour.setJour("samedi");
        assertEquals("samedi", jour.getJour());
        assertEquals(false, jour.isOuvre());
    }

    /**
     * Test of getDateJour method, of class Jour.
     */
    @Test
    public void testGetDateJour() {
        System.out.println("getDateJour");
        jour = new Jour("lundi", 7, 9, 2015);
        assertEquals(7, jour.getDateJour());
    }

    /**
     * Test of setDateJour method, of class Jour.
     */
    @Test
    public void testSetDateJour() {
        System.out.println("setDateJour");
        jour = new Jour("lundi", 7, 9, 2015);
        jour.setDateJour(12);
        assertEquals(12, jour.getDateJour());
    }

    /**
     * Test of getMois method, of class Jour.
     */
    @Test
    public void testGetMois() {
        System.out.println("getMois");
        jour = new Jour("lundi", 7, 9, 2015);
        assertEquals(9, jour.getMois());
    }

    /**
     * Test of setMois method, of class Jour.
     */
    @Test
    public void testSetMois() {
        System.out.println("setMois");
        jour = new Jour("lundi", 7, 10, 2015);
        jour.setMois(12);
        assertEquals(12, jour.getMois());
    }

    /**
     * Test of getAnnee method, of class Jour.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        jour = new Jour("lundi", 7, 9, 2015);
        assertEquals(2015, jour.getAnnee());
    }

    /**
     * Test of setAnnee method, of class Jour.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        jour = new Jour("vendredi", 7, 9, 2016);
        jour.setAnnee(2020);
        assertEquals(2020, jour.getAnnee());
    }

    /**
     * Test of isOuvre method, of class Jour.
     */
    @Test
    public void testIsOuvre() {
        System.out.println("isOuvre");
        jour = new Jour("lundi", 7, 9, 2015);
        assertEquals(true, jour.isOuvre());
        Jour jour2 = new Jour("samedi", 3, 10, 2015);
        assertEquals(false, jour2.isOuvre());
    }

    /**
     * Test of setOuvre method, of class Jour.
     */
    @Test
    public void testSetOuvre() {
        System.out.println("setOuvre");
        jour = new Jour("samedi", 12, 9, 2015);
        assertEquals(false, jour.isOuvre());
        jour.setOuvre();
        assertEquals(true, jour.isOuvre());
    }

    /**
     * Test of getSceanceMatin method, of class Jour.
     */
    @Test
    public void testGetSceanceMatin() {
        System.out.println("getSceanceMatin");
        jour = new Jour();
        assertEquals(null, jour.getSceanceMatin());

        Module mod = new Module("TEST 1", Color.blue, "T1", 15, 3);
        Sceance sc = new Sceance(jour, mod,new Promotion());

        jour.setSceanceMatin(sc);
        assertEquals(sc, jour.getSceanceMatin());
    }

    /**
     * Test of getSceanceSoir method, of class Jour.
     */
    @Test
    public void testGetSceanceSoir() {
        System.out.println("getSceanceSoir");
        jour = new Jour();
        assertEquals(null, jour.getSceanceSoir());

        Module mod = new Module("TEST X", Color.blue, "TX", 13, 2);
        Sceance sc = new Sceance(jour, mod,new Promotion());

        jour.setSceanceSoir(sc);
        assertEquals(sc, jour.getSceanceSoir());
    }

    /**
     * Test of setSceanceMatin method, of class Jour.
     */
    @Test
    public void testSetSceanceMatin() {
        System.out.println("setSceanceMatin");
        jour = new Jour();

        Module mod = new Module("TEST 1", Color.blue, "T1", 15, 3);
        Sceance sc = new Sceance(jour, mod,new Promotion());
        jour.setSceanceMatin(sc);
        assertEquals(sc, jour.getSceanceMatin());

        Module mod2 = new Module("TEST 2", Color.red, "T2", 13, 3);
        Sceance sc2 = new Sceance(jour, mod2,new Promotion());
        jour.setSceanceMatin(sc2);
        assertEquals(sc2, jour.getSceanceMatin());
    }

    /**
     * Test of setSceanceSoir method, of class Jour.
     */
    @Test
    public void testSetSceanceSoir() {
        System.out.println("setSceanceSoir");
        jour = new Jour();
        assertEquals(null, jour.getSceanceSoir());

        Module mod = new Module("TEST X", Color.blue, "TX", 13, 2);
        Sceance sc = new Sceance(jour, mod,new Promotion());

        jour.setSceanceSoir(sc);
        assertEquals(sc, jour.getSceanceSoir());
    }

    /**
     * Test of ajouteSceanceMatin method, of class Jour.
     */
    @Test
    public void testAjouteSceanceMatin() {
        System.out.println("ajouteSceanceMatin");
        jour = new Jour();
        Module mod = new Module("TEST X", Color.yellow, "TX", 13, 2);
        Promotion promo = new Promotion("TOTO", 2);
        jour.ajouteSceanceMatin(mod,promo);
        assertNotNull(jour.getSceanceMatin());
    }

    /**
     * Test of ajouteSceanceSoir method, of class Jour.
     */
    @Test
    public void testAjouteSceanceSoir() {
        System.out.println("ajouteSceanceSoir");
        jour = new Jour();
        Module mod = new Module("TEST Y", Color.MAGENTA, "TY", 13, 2);
        Promotion promo = new Promotion("TITI", 3);
        jour.ajouteSceanceSoir(mod,promo);
        assertNotNull(jour.getSceanceSoir());
    }

    /**
     * Test of toString method, of class Jour.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        jour = new Jour("lundi", 7, 9, 2015);
        assertEquals("7/9/2015", jour.toString());
    }

}
