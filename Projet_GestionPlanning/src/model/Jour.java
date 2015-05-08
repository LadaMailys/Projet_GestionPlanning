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
    private Sceance sceance;

    // Constructeurs
    public Jour(){
    }
    public Jour (int dateJour, int mois, int annee){
        this.dateJour = dateJour;
        this.mois = mois;
        this.annee = annee;
        sceance = null;
    }
    public Jour(String jour, int dateJour, int mois, int annee) {
        this.jour = jour;
        this.dateJour = dateJour;
        this.mois = mois;
        this.annee = annee;
        this.ouvre = this.jour.toUpperCase().equals("SATURDAY") || this.jour.toUpperCase().equals("SUNDAY");
        sceance = null;
    }

    /**
     * Retourne M ou S
     * M = Matin
     * S = Soir
     * @return 
     */
    public char getMoment() {
        return moment;
    }
    /**
     * Change le moment en M ou S
     * M = Matin
     * S = Soir
     */
    public void setMoment() {
        if (this.moment == 'M')
            moment = 'S';
        else
            moment = 'M';
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

    public void setOuvre() {
        this.ouvre = !ouvre;
    }
    
    public Sceance getSceance(){
        return sceance;
    }
    public void setSceance(Sceance s){
        sceance = s;
    }
    
    @Override
    public String toString(){
        return this.dateJour +"/"+this.mois+"/"+this.annee;
    }
}
