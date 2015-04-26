/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author jiani
 */
public class Module {
    
    private String nom;
    private Color couleur;
    private String abbreviation;
    private int nbSceanceTotal;
    private int duree;
    private ArrayList<Sceance> lesSceancesFaites;
    
    public Module (String nom, Color couleur, String abb, int nbSceanceTotal,int duree){
        this.nom = nom;
        this.couleur = couleur;
        this.abbreviation = abb;
        this.nbSceanceTotal = nbSceanceTotal;
        this.duree = duree;
        this.lesSceancesFaites = new ArrayList<>();             
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom (String nom){
        this.nom = nom;
    }
    
    public Color getCouleur (){
        return couleur;
    }
    public void setCouleur (Color couleur){
        this.couleur = couleur;
    }
    
    public String getAbbreviation(){
        return abbreviation;
    }
    public void setAbbreviation (String abbreviation){
        this.abbreviation = abbreviation;
    }
    
    public int getNbSceanceTotal(){
        return nbSceanceTotal;
    }
    public void setNbSceanceTotal (int nbSceanceTotal){
        this.nbSceanceTotal = nbSceanceTotal;
    }
    
    public int getDuree (){
        return duree;
    }
    public void setDuree(int duree){
        this.duree = duree;
    }
    
    public ArrayList<Sceance> getLesSceancesFaites (){
        return lesSceancesFaites;
    }
    public void ajouteSceanceFaite (Sceance laSceance){
        this.lesSceancesFaites.add(laSceance);
    }
    public void retireSceanceFaite (Sceance laSceance){
        if (this.lesSceancesFaites.contains(laSceance)){
            this.lesSceancesFaites.remove(laSceance);
        }
    }
}

