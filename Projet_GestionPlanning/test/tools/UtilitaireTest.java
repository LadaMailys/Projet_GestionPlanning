/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cynthia
 */
public class UtilitaireTest {

    /**
     * Test de la méthode isInteger.
     */
    @Test
    public void testIsInteger() {
        System.out.println("isInteger");
        Object obj;
        boolean expected;
        boolean result;

        obj = null;
        expected = false;
        result = Utilitaire.isInteger(obj);
        assertEquals(expected, result);

        obj = "abc";
        expected = false;
        result = Utilitaire.isInteger(obj);
        assertEquals(expected, result);

        obj = "123";
        expected = true;
        result = Utilitaire.isInteger(obj);
        assertEquals(expected, result);

        obj = "12a";
        expected = false;
        result = Utilitaire.isInteger(obj);
        assertEquals(expected, result);

        obj = "¹²³";
        expected = false;
        result = Utilitaire.isInteger(obj);
        assertEquals(expected, result);
    }

    /**
     * Test de la methode isAlpha.
     */
    @Test
    public void testIsAlpha() {
        System.out.println("isAlpha");
        String s;
        boolean expected;
        boolean result;

        s = "";
        expected = false;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = " ";
        expected = false;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = "abc";
        expected = true;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = "aBC";
        expected = true;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = "123";
        expected = false;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = "ab1";
        expected = false;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = "éàç";
        expected = false;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);

        s = "!/*";
        expected = false;
        result = Utilitaire.isAlpha(s);
        assertEquals(expected, result);
    }

}
