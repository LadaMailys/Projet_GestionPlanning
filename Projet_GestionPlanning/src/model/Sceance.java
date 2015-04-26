/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jiani
 */
public class Sceance {

    private Jour jourSceance;
    private Module leModule;

    public Sceance(Jour jour, Module mod) {
        this.jourSceance = jour;
        this.leModule = mod;
    }

    public Jour getJourSceance() {
        return jourSceance;
    }

    public Module getLeModule() {
        return leModule;
    }

    public void setJourSceance(Jour jour) {
        this.jourSceance = jour;
    }

    public void setLeModule(Module mod) {
        this.leModule = mod;
    }
}
