/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Maïlys
 */
public class Planning {

    private HashMap<Integer, ArrayList<Jour>> lesSemaines;
    private Promotion laPromotion;
    private int annee;

    // Constructeurs
    public Planning() {
        remplirCalendrier();
    }

    public Planning(Promotion promotion, int annee) {
        this.lesSemaines = new HashMap<>();
        this.laPromotion = promotion;
        this.annee = annee;
        remplirCalendrier();
    }
    
    public int getNbSemainesAnnee(){
        return lesSemaines.size();
    }

    public ArrayList<Jour> getLaSemaine(int rang) {
        return lesSemaines.get(rang);
    }

    public void ajouteSemaine(int rang, ArrayList<Jour> jours) {
        this.lesSemaines.put(rang, jours);
    }

    public Promotion getLaPromotion() {
        return laPromotion;
    }

    public void laPromotion(Promotion laPromotion) {
        this.laPromotion = laPromotion;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * Méthode qui remplit automatiquement le HashMap lesSemaines<int rang, ArrayList<Jour>> lesJours
     * à partir de l'année du planning
     */
    public final void remplirCalendrier() {
        try {
            ArrayList<Jour> lesJours = null;
            Calendar calDeb = Calendar.getInstance();
            Calendar calFin = Calendar.getInstance();
            calDeb.set(this.annee, Calendar.SEPTEMBER, 1, 0, 0, 0);
            calFin.set((this.annee + 1), Calendar.AUGUST, 31, 0, 0, 0);
            // Nombre de jours entre le 1er septembre et le 31 août
            int nbJours = (int) TimeUnit.MILLISECONDS.toDays(calFin.getTimeInMillis() - calDeb.getTimeInMillis());
            int rangSemaine = 1;
            Jour j;
            int compt = -1;
            for (int i = 1; i <= nbJours; i++) {
                // Création du Jour j avec les données du Calendrier cal
                j = new Jour();
                j.setAnnee(calDeb.get(Calendar.YEAR));
                j.setMois(calDeb.get(Calendar.MONTH) + 1);
                j.setDateJour(calDeb.get(Calendar.DAY_OF_MONTH));
                j.setJour(rangJourToString(calDeb.get(Calendar.DAY_OF_WEEK)));

                // On remplit la liste à partir de lundi
                if (j.getJour().equals("Lundi")) {
                    lesJours = new ArrayList<>();
                    compt = 6;
                }
                
                // Si le compteur vaut 0 ou plus, c'est que dans la boucle, on est entre lundi et dimanche
                if (compt >= 0) {
                    lesJours.add(j);
                    compt--;
                }
                
                // Si le compteur vaut -1, on vient de rajouter le dimanche dans la liste => Fin de liste
                // Ou bien c'est la première itération, qui n'est pas un lundi, dans ces cas on ne fait rien
                if (compt == -1 && lesJours != null) {
                    if (lesJours.size() == 7) {
                        // Si la liste est remplie de lundi à dimanche, on l'ajoute au HashMap 
                        // avec un rang comme clé et la liste des jours en valeur
                        ajouteSemaine(rangSemaine, lesJours);
                        rangSemaine++;
                    }
                }
                // On passe au jour suivant
                calDeb.add(Calendar.DATE, 1);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public String rangJourToString(int rang) {
        switch (rang) {
            case 1:
                return "Dimanche";
            case 2:
                return "Lundi";
            case 3:
                return "Mardi";
            case 4:
                return "Mercredi";
            case 5:
                return "Jeudi";
            case 6:
                return "Vendredi";
            case 7:
                return "Samedi";
            default:
                return "";
        }
    }
}
