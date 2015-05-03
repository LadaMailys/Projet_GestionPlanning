/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Maïlys
 */
public class Planning {
    
    private HashMap<Integer,ArrayList<Jour>> lesSemainesMatin;
    private HashMap<Integer,ArrayList<Jour>> lesSemainesSoir;
    private Promotion laPromotion;
    private int annee;
    
    // Constructeurs
    public Planning(){
    }    
    public Planning (Promotion promotion, int annee){
        this.lesSemainesMatin = new HashMap<>();
        this.lesSemainesSoir = new HashMap<>();
        this.laPromotion = promotion;
        this.annee = annee;
    }
    
    public ArrayList<Jour> getLaSemaineMatin(int rang){
        return lesSemainesMatin.get(rang);
    }
    public void ajouteSemaine(int rang, ArrayList<Jour> jours){
        this.lesSemainesMatin.put(rang, jours);
        this.lesSemainesSoir.put(rang, jours);
    }
    
    public ArrayList<Jour> getLaSemaineSoir(int rang){
        return lesSemainesSoir.get(rang);
    }
    
    public Promotion getLaPromotion(){
        return laPromotion;
    }
    public void laPromotion(Promotion laPromotion){
        this.laPromotion = laPromotion;
    }
    public int getAnnee (){
        return annee;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
}
