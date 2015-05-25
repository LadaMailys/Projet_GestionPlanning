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
public class PromotionTest {

    Promotion instance;

    @Before
    public void initialise() {
        instance = new Promotion("TEST", 3);
    }

    /**
     * Test of getNom method, of class Promotion.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        assertEquals("TEST", instance.getNom());
    }

    /**
     * Test of setNom method, of class Promotion.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        instance.setNom("TOTO");
        assertEquals("TOTO", instance.getNom());
    }

    /**
     * Test of getDuree method, of class Promotion.
     */
    @Test
    public void testGetDuree() {
        System.out.println("getDuree");
        assertEquals(3, instance.getDureeSceance());
    }

    /**
     * Test of setDuree method, of class Promotion.
     */
    @Test
    public void testSetDuree() {
        System.out.println("setDuree");
        instance.setDureeSceance(5);
        assertEquals(5, instance.getDureeSceance());
    }

    /**
     * Test of getLesModules method, of class Promotion.
     */
    @Test
    public void testGetLesModules() {
        System.out.println("getLesModules");
        assertNotNull(instance.getLesModules());
        assertTrue(instance.getLesModules().isEmpty());
    }

    /**
     * Test of ajouteModule method, of class Promotion.
     */
    @Test
    public void testAjouteModule() {
        System.out.println("ajouteModule");
        assertTrue(instance.getLesModules().isEmpty());

        instance.ajouteModule(new Module("TEST_1", Color.blue, "T1", 15));
        assertTrue(instance.getLesModules().size() == 1);

        instance.ajouteModule(new Module("TEST_2", Color.yellow, "T2", 12));
        assertTrue(instance.getLesModules().size() == 2);
    }

    /**
     * Test of retireModule method, of class Promotion.
     */
    @Test
    public void testRetireModule() {
        System.out.println("retireModule");
        Module mod = new Module("TEST_3", Color.red, "T3", 9);
        instance.ajouteModule(mod);
        assertTrue(instance.getLesModules().size() == 1);
        instance.retireModule(mod);
        assertTrue(instance.getLesModules().isEmpty());
    }

}
