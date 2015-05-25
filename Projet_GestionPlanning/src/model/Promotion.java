/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cynthia
 */
public class Promotion implements Serializable {

    private String nom;
    private int dureeSceance;
    private Calendrier calendrier;
    private ArrayList<Module> lesModules;
    private ArrayList<Sceance> lesSceancesFaites;

    // Constructeurs
    public Promotion() {
        //lstPromotions.add(this);
        lesModules = new ArrayList<>();
        calendrier = new Calendrier();
        this.lesSceancesFaites = new ArrayList<>();
    }

    public Promotion(String nom, int duree) {
        this.nom = nom;
        this.dureeSceance = duree;
        this.lesSceancesFaites = new ArrayList<>();
        calendrier = new Calendrier();
        lesModules = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeSceance() {
        return dureeSceance;
    }

    public void setDureeSceance(int dureeSceance) {
        this.dureeSceance = dureeSceance;
    }

    public Calendrier getCalendrier() {
        return calendrier;
    }

    public void setCalendrier(Calendrier cal) {
        calendrier = cal;
    }

    public ArrayList<Module> getLesModules() {
        return lesModules;
    }

    public void ajouteModule(Module mod) {
        if (!lesModules.contains(mod)) {
            lesModules.add(mod);
        }
    }

    public void retireModule(Module mod) {
        for (Module m : lesModules){
            if (m.equals(mod)){
                lesModules.remove(m);
            }
        }
    }

    public ArrayList<Sceance> getLesSceancesFaites() {
        return lesSceancesFaites;
    }

    public void ajouteSceanceFaite(Sceance sc) {
        lesSceancesFaites.add(sc);
    }

    public void retireSceanceFaite(Sceance sc) {
        if (lesSceancesFaites.contains(sc)) {
            lesSceancesFaites.remove(sc);
        }
    }  

    /**
     * Retourne les lignes de codes html de la promo et ses scéances
     */
    public String codeHTML() {

        // ATTENTION, ceci est une maquette !
        // Les vraies valeurs seront contenues dans l'instance Calendrier !!
        String contenu = "<html> ";
        String head, body, tableau = "";
        int compt = 0;
        for (int i = 1; i < calendrier.getNbSemainesAnnee(); i++) {
            for (Jour j : this.calendrier.getLaSemaine(i)) {
                if (j.getSceanceMatin() != null) {
                    compt++;
                    tableau += "<tr style='background-color: #" + j.getSceanceMatin().getModule().getCouleur().getRGB() + " ;'>"
                            + "<td>" + compt + "</td>"
                            + "<td>" + j.getSceanceMatin().getModule().getAbbreviation() + " - " + j.getSceanceMatin().getModule().getNom() + "</td>"
                            + "<td>" + j.toString() + " MATIN </td>"
                            + "<td>" + this.getLesSceancesFaites().size() + "/" + j.getSceanceMatin().getModule().getNbSceanceTotal() + "</td>"
                            + "</tr>";
                }
                if (j.getSceanceSoir() != null) {
                    compt++;
                    tableau += "<tr style='background-color: #" + j.getSceanceSoir().getModule().getCouleur().getRGB() + " ;'>"
                            + "<td>" + compt + "</td>"
                            + "<td>" + j.getSceanceSoir().getModule().getAbbreviation() + " - " + j.getSceanceSoir().getModule().getNom() + "</td>"
                            + "<td>" + j.toString() + " MATIN </td>"
                            + "<td>" + this.getLesSceancesFaites().size() + "/" + j.getSceanceSoir().getModule().getNbSceanceTotal() + "</td>"
                            + "</tr>";
                }
            }

        }

        head = "<head> "
                + "<meta charset=\"utf-8\">"
                + "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
                + "<meta name=\"description\" content=\"\">"
                + "<meta name=\"author\" content=\"\">"
                + "<title>Planning - " + nom + " " + this.getCalendrier().getAnnee() + " </title>"
                + "<link href=\"html/bootstrap.min.css\" rel=\"stylesheet\">"
                + "<link href=\"html/cover.css\" rel=\"stylesheet\">"
                + "<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n"
                + "<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n"
                + "</head>";

        body = "<body>"
                + "<div class=\"site-wrapper\">"
                + "  <div class=\"site-wrapper-inner\">"
                + "    <div class=\"cover-container\">"
                + "      <div class=\"masthead clearfix\">"
                + "        <div class=\"inner\">"
                + "          <h3 class=\"masthead-brand\">Projet JAVA</h3>"
                + "        </div>"
                + "      </div>"
                + "      <div class=\"inner cover\">"
                + "        <h1 class=\"cover-heading\">Planning " + this.getCalendrier().getAnnee() + "/" + (this.getCalendrier().getAnnee() + 1) + "</h1>"
                + "            <p class=\"lead\">Cette page recense les séances programmées de la promotion, de septembre à août.</p>"
                + "      </div>"
                + "      <table class=\"table table-striped\">"
                + "        <tr>"
                + "          <th>N°</th>"
                + "          <th>Date</th>"
                + "          <th>Module</th>"
                + "          <th>Restant</th>"
                + "        </tr>"
                + tableau
                + "      </table>"
                + "      <div class=\"mastfoot\">"
                + "        <div class=\"inner\">"
                + "        </div>"
                + "      </div>"
                + "    </div>"
                + "  </div>"
                + "</div>"
                + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>"
                + "<script src=\"../../dist/js/bootstrap.min.js\"></script>"
                + "<script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>"
                + "</body>";
        contenu += head + body + "</html>";
        return contenu;
    }
   
     public boolean equals(Promotion obj) {
        Promotion p = (Promotion) obj;
        return nom.equals(p.nom) && dureeSceance == p.dureeSceance && calendrier == p.calendrier && lesModules == p.lesModules && lesSceancesFaites == p.lesSceancesFaites;
    }

}


