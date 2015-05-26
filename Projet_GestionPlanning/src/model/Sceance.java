/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author jiani
 */
public class Sceance implements Serializable {

    private Jour jourSceance;
    private Module module;
    private Promotion promotion;
    private Formateur formateur;

    // Constructeurs
    public Sceance() {
    }

    public Sceance(Jour jour, Module mod, Promotion promo) {
        this.jourSceance = jour;
        this.module = mod;
        this.promotion = promo;
    }

    public Jour getJourSceance() {
        return jourSceance;
    }

    public Module getModule() {
        return module;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setJourSceance(Jour jour) {
        this.jourSceance = jour;
    }

    public void setModule(Module mod) {
        this.module = mod;
    }

    public void setPromotion(Promotion promo) {
        promotion = promo;
    }

    public void setFormateur(Formateur f) {
        formateur = f;
    }

    public boolean equals(Sceance obj) {
        Sceance sc = (Sceance) obj;
        return jourSceance.equals(sc.jourSceance) && module.equals(sc.module) && promotion.equals(sc.promotion);
    }

}
