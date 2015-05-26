/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jiani
 */
public class Module implements Serializable {

    private String nom;
    private Color couleur;
    private String abbreviation;
    private int nbSceanceTotal;
    private ArrayList<Formateur> lesFormateurs;

    // Constructeurs
    public Module() {
    }

    public Module(String nom, Color couleur, String abb, int nbSceanceTotal) {
        this.nom = nom;
        this.couleur = couleur;
        this.abbreviation = abb;
        this.nbSceanceTotal = nbSceanceTotal;
        lesFormateurs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getNbSceanceTotal() {
        return nbSceanceTotal;
    }

    public void setNbSceanceTotal(int nbSceanceTotal) {
        this.nbSceanceTotal = nbSceanceTotal;
    }

    public ArrayList<Formateur> getLesFormateurs() {
        return lesFormateurs;
    }

    public void setLesFormateurs(ArrayList<Formateur> lstForm) {
        lesFormateurs = lstForm;
    }

    public void ajouteFormateur(Formateur form) {
        if (!lesFormateurs.contains(form)) {
            lesFormateurs.add(form);
        }
    }

    public void retireFormateur(Formateur f) {
        if (lesFormateurs.contains(f)) {
            lesFormateurs.remove(f);
        }
    }

    public boolean equals(Module obj) {
        Module o = (Module) obj;
        return nom.equals(o.nom) && couleur.equals(o.couleur) && abbreviation.equals(o.abbreviation) && nbSceanceTotal == o.nbSceanceTotal;
    }
}
