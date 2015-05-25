/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Maïlys
 */
public class Calendrier implements Serializable {

    private static HashMap<Integer, ArrayList<Jour>> lesSemaines;
    private static int annee;

    /**
     * Constructeur
     */
    public Calendrier() {
        remplirCalendrier();
    }

    public Calendrier(Promotion promotion, int annee) {
        this.lesSemaines = new HashMap<>();
        this.annee = annee;
        remplirCalendrier();
    }

    /**
     * Retourne le nombre de semaines dans l'année
     *
     * @return
     */
    public int getNbSemainesAnnee() {
        return lesSemaines.size();
    }

    /**
     * Accesseur en lecture de l'attribut lesSemaines
     *
     * @param rang
     * @return la semaine (liste de 7 jours) au rang passé en paramètre
     */
    public ArrayList<Jour> getLaSemaine(int rang) {
        return lesSemaines.get(rang);
    }

    /**
     * Accesseur en lecture de l'attribut année
     *
     * @return
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Accesseur en écriture de l'attribut année
     *
     * @param annee
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * Méthode qui remplit automatiquement le HashMap lesSemaines<int rang,
     * ArrayList<Jour>> lesJours à partir de l'année donnée du planning
     */
    public void remplirCalendrier() {
        try {
            if (annee == 0){
                annee = Calendar.getInstance().get(Calendar.YEAR);
            }
            lesSemaines = new HashMap<>();
            lesSemaines.clear();
            ArrayList<Jour> lesJours = null;
            Calendar calDeb = Calendar.getInstance();
            Calendar calFin = Calendar.getInstance();
            calDeb.set(annee, Calendar.SEPTEMBER, 1, 0, 0, 0);
            calFin.set((annee + 1), Calendar.AUGUST, 31, 0, 0, 0);
            // Nombre de jours entre le 1er septembre et le 31 août
            int nbJours = (int) TimeUnit.MILLISECONDS.toDays(calFin.getTimeInMillis() - calDeb.getTimeInMillis());
            int rangSemaine = 1;
            Jour j;
            int compt = -1;
            for (int i = 1; i <= nbJours; i++) {

                // Création du Jour j avec les données du Calendrier cal
                j = new Jour(rangJourToString(calDeb.get(Calendar.DAY_OF_WEEK)),
                        calDeb.get(Calendar.DAY_OF_MONTH),
                        calDeb.get(Calendar.MONTH) + 1,
                        calDeb.get(Calendar.YEAR));

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
                        lesSemaines.put(rangSemaine, lesJours);
                        rangSemaine++;
                    }
                }
                // On passe au jour suivant
                calDeb.add(Calendar.DATE, 1);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * Retourne le jour de la semaine en toute lettre selon le rang donné
     *
     * @param rang
     * @return String
     */
    public static String rangJourToString(int rang) {
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

    public Jour getJour(int jour, int mois, int annee) {
        Jour leJour = null;
        for (int i = 1; i <= getNbSemainesAnnee(); i++) {
            for (Jour j : lesSemaines.get(i)) {
                if (j.getDateJour() == jour && j.getMois() == mois && j.getAnnee() == annee) {
                    leJour = j;
                }
            }
        }
        return leJour;
    }
}
