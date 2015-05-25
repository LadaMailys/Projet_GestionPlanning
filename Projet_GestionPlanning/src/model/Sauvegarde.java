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
import java.util.Observable;

/**
 *
 * @author Cynthia
 */
public class Sauvegarde extends Observable implements Serializable {

    private final Calendrier calendrier = new Calendrier();
    private final ArrayList<Module> lstModules = new ArrayList<>();
    private final ArrayList<Promotion> lstPromotions = new ArrayList<>();
    private final ArrayList<Sceance> lstSceancesProgrammees = new ArrayList<>();

    public Sauvegarde() {
    }

    public Calendrier getCalendrier() {
        return calendrier;
    }

    public ArrayList<Module> getLstModules() {
        return lstModules;
    }

    public ArrayList<Promotion> getLstPromotions() {
        return lstPromotions;
    }

    public ArrayList<Sceance> getLstSceance() {
        return lstSceancesProgrammees;
    }

    public void ajouterModule(Module m) {
        if (!lstModules.contains(m)) {
            lstModules.add(m);
        }
        setChanged();
        notifyObservers();
    }

    public void retirerModule(Module m) {
        if (lstModules.contains(m)) {
            lstModules.remove(m);
        }
        setChanged();
        notifyObservers();
    }

    public void ajouterPromotion(Promotion p) {
        if (!lstPromotions.contains(p)) {
            lstPromotions.add(p);
        }
        setChanged();
        notifyObservers();
    }

    public void retirerPromotion(Promotion p) {
        if (lstPromotions.contains(p)) {
            lstPromotions.remove(p);
        }
        setChanged();
        notifyObservers();
    }

    public void ajouterSceance(Sceance s) {
        if (!lstSceancesProgrammees.contains(s)) {
            lstSceancesProgrammees.add(s);
        }
        setChanged();
        notifyObservers();
    }

    public void retirerSceance(Sceance s) {
        if (lstSceancesProgrammees.contains(s)) {
            lstSceancesProgrammees.remove(s);
        }
        setChanged();
        notifyObservers();
    }

    public static void serialiser(Sauvegarde s) {
        try {
            FileOutputStream fout = new FileOutputStream("auth.bin");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s);
            System.out.println("La sauvegarde a été serialisée");
            oout.close();
            fout.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static Sauvegarde deserialiser() {
        Sauvegarde s = null;
        try {
            FileInputStream fin = new FileInputStream("auth.bin");
            ObjectInputStream oin = new ObjectInputStream(fin);
            s = (Sauvegarde) oin.readObject();
            System.out.println("La sauvegarde a été deserialisée");
            oin.close();
            fin.close();
        } catch (ClassNotFoundException nfe) {
            nfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return s;
    }
}
