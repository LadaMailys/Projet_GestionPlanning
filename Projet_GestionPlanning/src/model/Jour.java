/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Maïlys
 */
public class Jour implements Serializable {

    private String jour;
    private int dateJour;
    private int mois;
    private int annee;
    private boolean ouvre;
    private Sceance sceanceMatin;
    private Sceance sceanceSoir;

    // Constructeurs
    public Jour() {

    }

    public Jour(String jour, int dateJour, int mois, int annee) {
        this.jour = jour;
        this.dateJour = dateJour;
        this.mois = mois;
        this.annee = annee;
        this.ouvre = !this.jour.toUpperCase().equals("SAMEDI") && !this.jour.toUpperCase().equals("DIMANCHE");
        sceanceMatin = null;
        sceanceSoir = null;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
        this.ouvre = !jour.toUpperCase().equals("SAMEDI") && !jour.toUpperCase().equals("DIMANCHE");
    }

    public int getDateJour() {
        return dateJour;
    }

    public void setDateJour(int dateJour) {
        this.dateJour = dateJour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public boolean isOuvre() {
        return ouvre;
    }

    public void setOuvre() {
        this.ouvre = !ouvre;
    }

    public Sceance getSceanceMatin() {
        return sceanceMatin;
    }

    public Sceance getSceanceSoir() {
        return sceanceSoir;
    }

    public void setSceanceMatin(Sceance s) {
        sceanceMatin = s;
    }

    public void setSceanceSoir(Sceance s) {
        sceanceSoir = s;
    }

    public void ajouteSceanceMatin(Module mod, Promotion promo) {
        sceanceMatin = new Sceance(this, mod, promo);
    }

    public void ajouteSceanceSoir(Module mod, Promotion promo) {
        sceanceSoir = new Sceance(this, mod, promo);
    }

    @Override
    public String toString() {
        return this.dateJour + "/" + this.mois + "/" + this.annee;
    }

    public boolean equals(Jour j) {
        return jour.equals(j.jour)
                && dateJour == j.dateJour
                && mois == j.mois
                && annee == j.annee;
    }

}
