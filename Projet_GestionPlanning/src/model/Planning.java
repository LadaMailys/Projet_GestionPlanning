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
    
    private HashMap<Integer,ArrayList<Jour>> lesSemaines;
    private Promotion laPromotion;
    private int annee;
    
    // Constructeurs
    public Planning(){
    }    
    public Planning (Promotion promotion, int annee){
        this.lesSemaines = new HashMap<>();
        this.laPromotion = promotion;
        this.annee = annee;
    }
    
    public ArrayList<Jour> getLaSemaine(int rang){
        return lesSemaines.get(rang);
    }
    public void ajouteSemaine(int rang, ArrayList<Jour> jours){
        this.lesSemaines.put(rang, jours);
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
