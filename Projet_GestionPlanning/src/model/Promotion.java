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
    private int dureeSceance;
    private ArrayList<Module> lesModules;
    private ArrayList<Sceance> lesSceancesFaites;
    
    // Constructeurs
    public Promotion(){
    }
    public Promotion(String nom, int duree){
        this.nom = nom;
        this.dureeSceance = duree;
        this.lesModules = new ArrayList<>();
        this.lesSceancesFaites = new ArrayList<>();
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public int getDureeSceance(){
        return dureeSceance;
    }
    public void setDureeSceance(int dureeSceance){
        this.dureeSceance = dureeSceance;
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
    
    public ArrayList<Sceance> getLesSceancesFaites(){
        return lesSceancesFaites;
    }
    public void ajouteSceanceFaite(Sceance sc){
        lesSceancesFaites.add(sc);
    }
    public void retireSceanceFaite(Sceance sc){
        if (lesSceancesFaites.contains(sc)){
            lesSceancesFaites.remove(sc);
        }
    }
    
}
