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
public class Semaine {
    
    private int rang;
    private ArrayList<Jour>lesJours;
    
    public Semaine (int rang){
        this.rang = rang;
        this.lesJours = new ArrayList<>();
    }
    public int getRang(){
        return rang;
    }
    public void setRang (int rang){
        this.rang= rang;
    }
    public ArrayList getLesJours(){
        return lesJours;
    }
    public void setLesJours(ArrayList<Jour>lesJours){
        this.lesJours = lesJours;
    }
}
