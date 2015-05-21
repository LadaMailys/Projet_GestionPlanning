package tools;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.regex.Pattern;

/**
 *
 * @author u21405875
 */
public class Utilitaire {

    /**
     * Définit si l'objet passé en paramètre est de convertissable en Integer
     *
     * @param obj
     * @return
     */
    public static boolean isInteger(Object obj) {
        try {
            Integer.parseInt(obj.toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    /**
     * Détermine si le String passé en paramètre ne contient que des lettres
     * @param s
     * @return 
     */
    public static boolean isAlpha(String s) {
        if (!(Pattern.matches("^[a-zA-Z]+$", s.trim()))) 
            return false;
         else 
            return true;
        
    }

}
