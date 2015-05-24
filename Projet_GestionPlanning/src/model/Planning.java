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
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Maïlys
 */
public class Planning implements Serializable {

    private HashMap<Integer, ArrayList<Jour>> lesSemaines;
    private Promotion laPromotion;
    private int annee;

    /**
     * Constructeur
     */
    public Planning() {
        remplirCalendrier();
    }

    public Planning(Promotion promotion, int annee) {
        this.lesSemaines = new HashMap<>();
        this.laPromotion = promotion;
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
     * Accesseur en lecture de l'attribut laPromotion
     *
     * @return
     */
    public Promotion getLaPromotion() {
        return laPromotion;
    }

    /**
     * Accesseur en écriture de l'attribut promotion
     *
     * @param laPromotion
     */
    public void setLaPromotion(Promotion laPromotion) {
        this.laPromotion = laPromotion;
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
    public final void remplirCalendrier() {
        try {
            this.lesSemaines.clear();
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
                        this.lesSemaines.put(rangSemaine, lesJours);
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

    /**
     * Créé, à partir d'un objet, un fichier binaire de sauvegarde
     *
     * @param p
     */
    public static void serialiser(Planning p) {
        try {
            FileOutputStream fout = new FileOutputStream("auth.bin");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(p);
            System.out.println("Le planning a été serialisé");
            oout.close();
            fout.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * Obtient, à partir d'un fichier binaire, un objet de la classe Planning
     *
     * @return Planning
     */
    public static Planning deserialiser() {
        Planning p = null;
        try {
            FileInputStream fin = new FileInputStream("auth.bin");
            ObjectInputStream oin = new ObjectInputStream(fin);
            p = (Planning) oin.readObject();
            System.out.println("Le planning a été deserialise");
            oin.close();
            fin.close();
        } catch (ClassNotFoundException nfe) {
            nfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return p;
    }

    /**
     * Retourne les lignes de codes html du planning
     */
    public String codeHTML() {
        
        // ATTENTION, ceci est une maquette !
        // Les vraies valeurs seront contenues dans l'instance Planning !!
        String contenu = "<html> ";
        String head, body;
        head = "<head> "
                + "<meta charset=\"utf-8\">"
                + "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
                + "<meta name=\"description\" content=\"\">"
                + "<meta name=\"author\" content=\"\">"
                + "<title>Planning - " + laPromotion.getNom() + " " + annee + " </title>"
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
                + "        <h1 class=\"cover-heading\">Planning " + laPromotion.getNom() + " " + annee + "/" + (annee + 1) + " " + laPromotion.getDureeSceance() + "h </h1>"
                + "            <p class=\"lead\">Cette page recense les séances programmées de la promotion, de septembre à août.</p>"
                + "      </div>"
                + "      <table class=\"table table-striped\">"
                + "        <tr>"
                + "          <th>N°</th>"
                + "          <th>Date</th>"
                + "          <th>Module</th>"
                + "          <th>Restant</th>"
                + "        </tr>"
                + "        <tr style='background-color: blue;' >"
                + "          <td>1</th>"
                + "          <td>01/09/2015 matin</th>"
                + "          <td>T1 - Test</th>"
                + "          <td>1/50</th>"
                + "        </tr>"
                + "        <tr style='background-color: red;' >"
                + "          <th>2</th>"
                + "          <th>02/09/2015 matin</th>"
                + "          <th>T2 - Test</th>"
                + "          <th>5/25</th>"
                + "        </tr>"
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
}
