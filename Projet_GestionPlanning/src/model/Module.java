/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.ArrayList;
import model.Sceance;

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
    
    public Module (String nom, Color couleur, String abb, int nbSceanceTotal,int duree, ArrayList<Sceance> lesSceancesFaites){
        this.nom = nom;
        this.couleur = couleur;
        this.abbreviation = abb;
        this.nbSceanceTotal = nbSceanceTotal;
        this.duree = duree;
        this.lesSceancesFaites = lesSceancesFaites;
             
    }
    
    public String getNom(){
        return nom;
    }
    public Color getCouleur (){
        return couleur;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
    public int getNbSceanceTotal(){
        return nbSceanceTotal;
    }
    public int getDuree (){
        return duree;
    }
    public ArrayList<Sceance> getLesSceancesFaites (){
        return lesSceancesFaites;
    }
    public void setNom (String nom){
        this.nom = nom;
    }
    public void setCouleur (Color couleur){
        this.couleur = couleur;
    }
    public void setAbbreviation (String abbreviation){
        this.abbreviation = abbreviation;
    }
    public void setNbSceanceTotal (int nbSceanceTotal){
        this.nbSceanceTotal = nbSceanceTotal;
    }
    public void setLesSceancesFaites (ArrayList<Sceance> lesSceances){
        this.lesSceancesFaites = lesSceances;
    }
}

