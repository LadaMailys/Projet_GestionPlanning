package tools;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.Pattern;
import model.*;

/**
 *
 * @author u21405875
 */
public class Utilitaire {

    static Sauvegarde s = Sauvegarde.deserialiser();;

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
     *
     * @param s
     * @return
     */
    public static boolean isAlpha(String s) {
        if (!(Pattern.matches("^[a-zA-Z]+$", s.trim()))) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * Retourne le module par rapport au nom passé en paramètre
     * et à la sauvegarde en cours
     * @param nom
     * @param sa
     * @return 
     */
    public static Module getModule(String nom, Sauvegarde sa) {
        for (Module m : sa.getLstModules()) {
            if (m.getNom().equals(nom)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Retourne la promotion par rapport au nom passé en paramètre
     * et à la sauvegarde en cours
     * @param nom
     * @return 
     */
    public static Promotion getPromotion(String nom) {
        for (Promotion p : s.getLstPromotions()) {
            if (p.getNom().equals(nom)) {
                return p;
            }
        }
        return null;
    }

}
