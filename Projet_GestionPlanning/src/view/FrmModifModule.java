/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author Cynthia
 */
public class FrmModifModule extends javax.swing.JFrame implements Observer {

    static Promotion p;
    Module m;
    static Sauvegarde s;

    /**
     * Creates new form FrmModifModule
     *
     * @param planning
     */
    public FrmModifModule(Promotion promo, Sauvegarde s) {
        FrmModifModule.p = promo;
        FrmModifModule.s = s;
        //this.s.addObserver(this);
        initComponents();
        jPnlAction.setVisible(false);
        this.setSize(300, 150);
        for (Module mod : s.getLstModules()) {
            jCbxModules.addItem(mod.getNom());
        }
        jCbxModules.setSelectedIndex(-1);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Sauvegarde) {
            s = (Sauvegarde) o;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCbxModules = new javax.swing.JComboBox();
        jPnlAction = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jColor = new javax.swing.JColorChooser();
        jBtnModif = new javax.swing.JButton();
        jBtnSuppr = new javax.swing.JButton();
        jTxtNom = new javax.swing.JTextField();
        jTxtAbbr = new javax.swing.JTextField();
        jTxtNbSceance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion d'un module");

        jLabel1.setText("Choisir le module");

        jCbxModules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxModulesActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom");

        jLabel3.setText("Abbréviation");

        jLabel4.setText("Nombre de scéances du module");

        jLabel6.setText("Modifier la couleur");

        jBtnModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Modifier.PNG"))); // NOI18N
        jBtnModif.setText("Modifier");
        jBtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModifActionPerformed(evt);
            }
        });

        jBtnSuppr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Supprimer.PNG"))); // NOI18N
        jBtnSuppr.setText("Supprimer");
        jBtnSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlActionLayout = new javax.swing.GroupLayout(jPnlAction);
        jPnlAction.setLayout(jPnlActionLayout);
        jPnlActionLayout.setHorizontalGroup(
            jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlActionLayout.createSequentialGroup()
                .addGroup(jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlActionLayout.createSequentialGroup()
                        .addGroup(jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPnlActionLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTxtAbbr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtNbSceance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPnlActionLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jBtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jBtnSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPnlActionLayout.setVerticalGroup(
            jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtAbbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNbSceance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jCbxModules, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCbxModules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbxModulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxModulesActionPerformed
        if (jCbxModules.getSelectedIndex() == -1) {
            jPnlAction.setVisible(false);
            this.setSize(300, 150);
        }

        if (jCbxModules.getSelectedIndex() > -1) {
            jPnlAction.setVisible(true);
            this.setSize(700, 700);
            for (Module mod : s.getLstModules()) {
                if (mod.getNom() == jCbxModules.getSelectedItem()) {
                    this.m = mod;
                }
            }

            jTxtNom.setText(m.getNom());
            jTxtAbbr.setText(m.getAbbreviation());
            jTxtNbSceance.setText(m.getNbSceanceTotal() + "");
            jColor.setColor(m.getCouleur());
        }
    }//GEN-LAST:event_jCbxModulesActionPerformed

    private void jBtnModifActionPerformed(java.awt.event.ActionEvent evt) {
        s.retirerModule(m);
        p.retireModule(m);
        m.setNom(jTxtNom.getText());
        m.setAbbreviation(jTxtAbbr.getText());
        m.setNbSceanceTotal(Integer.parseInt(jTxtNbSceance.getText()));
        m.setCouleur(jColor.getColor());
        p.ajouteModule(m);
        s.ajouterModule(m);
        JOptionPane.showMessageDialog(null, "Module " + m.getNom() + " modifié!");
    }

    private void jBtnSupprActionPerformed(java.awt.event.ActionEvent evt) {
        for (Promotion prom : s.getLstPromotions()) {
            prom.retireModule(m);
        }
        s.retirerModule(m);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Module " + m.getNom() + " supprimé!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmModifModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModifModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModifModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModifModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmModifModule(p, s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnModif;
    private javax.swing.JButton jBtnSuppr;
    private javax.swing.JComboBox jCbxModules;
    private javax.swing.JColorChooser jColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPnlAction;
    private javax.swing.JTextField jTxtAbbr;
    private javax.swing.JTextField jTxtNbSceance;
    private javax.swing.JTextField jTxtNom;
    // End of variables declaration//GEN-END:variables
}
