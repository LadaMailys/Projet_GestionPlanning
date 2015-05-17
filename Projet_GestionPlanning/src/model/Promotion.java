/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cynthia
 */
public class Promotion implements Serializable{
    private String nom;
    private int duree;
    private ArrayList<Module> lesModules;
    
    // Constructeurs
    public Promotion(){
    }
    public Promotion(String nom, int duree){
        this.nom = nom;
        this.duree = duree;
        this.lesModules = new ArrayList<>();
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public int getDuree(){
        return duree;
    }
    public void setDuree(int duree){
        this.duree = duree;
    }
    
    public ArrayList<Module> getLesModules(){
        return lesModules;
    }
    public void ajouteModule(Module mod){
        lesModules.add(mod);
    }
    public void retireModule(Module mod){
        if (lesModules.contains(mod)){
            lesModules.remove(mod);
        }
    }
    
}
