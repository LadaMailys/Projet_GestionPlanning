/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Maïlys
 */
public class Jour {

    private char moment;
    private String jour;
    private int dateJour;
    private int mois;
    private int annee;
    private boolean ouvre;

    public Jour(String jour, int dateJour, int mois, int annee) {
        this.jour = jour;
        this.dateJour = dateJour;
        this.mois = mois;
        this.annee = annee;
        this.ouvre = this.jour.toUpperCase().equals("SAMEDI") || this.jour.toUpperCase().equals("DIMANCHE");
    }

    public char getMoment() {
        return moment;
    }

    public void setMoment(char moment) {
        this.moment = moment;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
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

    public void setOuvre(boolean ouvre) {
        this.ouvre = ouvre;
    }
}
