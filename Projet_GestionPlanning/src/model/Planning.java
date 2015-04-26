/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Maïlys
 */
public class Planning {
    
    private ArrayList<Semaine>lesSemaines;
    private Planning laPromotion;
    private int annee;
    
    public Planning(){
    }
    
    public Planning (ArrayList<Semaine>lesSemaines, Planning promotion, int annee){
        this.lesSemaines = lesSemaines;
        this.laPromotion = promotion;
        this.annee = annee;
    }
    public ArrayList getLesSemaines(){
        return lesSemaines;
    }
    public void setLesSemaine (ArrayList<Semaine> lesSemaines){
        this.lesSemaines= lesSemaines;
    }
    public Planning getLaPromotion(){
        return laPromotion;
    }
    public void laPromotion(Planning laPromotion){
        this.laPromotion = laPromotion;
    }
    public int getAnnee (){
        return annee;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
}
