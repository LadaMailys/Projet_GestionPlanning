/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author u21405875
 */
public class Utilitaire {

    /**
     * Définit si l'objet passé en paramètre est de convertissable en Integer
     * @param obj
     * @return 
     */
    public static boolean isInteger(Object obj){
        try{
            Integer.parseInt(obj.toString());
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
