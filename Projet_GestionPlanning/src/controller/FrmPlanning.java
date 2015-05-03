/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Calendar;
import model.*;
import view.*;

/**
 *
 * @author Cynthia
 */
public class FrmPlanning extends javax.swing.JFrame {

    PanelPlanning pnlPlanning;
    Planning p;
    int annee;

    /**
     * Creates new form FrmPlanning
     */
    public FrmPlanning() {
        initComponents();
        annee = Calendar.getInstance().get(Calendar.YEAR);
        p = new Planning();
        pnlPlanning = new PanelPlanning(p, 1);
        for (int i = annee; i <= annee + 10; i++) {
            jcbxAnnee.addItem(i + " / " + (i + 1));
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
        jcbxAnnee = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnAjouter = new javax.swing.JButton();
        jbtnSupprimer = new javax.swing.JButton();
        jbtnModifier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnSauvegarder = new javax.swing.JButton();
        jbtnOuvrir = new javax.swing.JButton();
        jbtnDroite = new javax.swing.JButton();
        jcbxSemaines = new javax.swing.JComboBox();
        jbtnGauche = new javax.swing.JButton();
        jbtnExporter = new javax.swing.JButton();
        jbtnQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Sélectionnez l'année :");

        jcbxAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxAnneeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Anglais", "Java IHM", "<html>Comptabilité de <br/>gestion</html>", "<html>Théorie des <br/>graphes</html>", "<html>Processus <br/>stochastiques</html>", null, null},
                {"Francais", "<html>Base de<br/>données</p>", "Analyse financière", "<html>Théorie des<br/> organisations</html>", "Statistiques", null, null}
            },
            new String [] {
                "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(150);
        jScrollPane1.setViewportView(jTable1);

        jbtnAjouter.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Ajouter.PNG"))); // NOI18N

        jbtnSupprimer.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Supprimer.PNG"))); // NOI18N

        jbtnModifier.setBackground(new java.awt.Color(255, 255, 255));
        jbtnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Modifier.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Semaine 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("du 01/09/2015 au 30/07/2016");

        jbtnSauvegarder.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSauvegarder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Sauvegarder.PNG"))); // NOI18N

        jbtnOuvrir.setBackground(new java.awt.Color(255, 255, 255));
        jbtnOuvrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Ouvrir.PNG"))); // NOI18N

        jbtnDroite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Droite.PNG"))); // NOI18N
        jbtnDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDroiteActionPerformed(evt);
            }
        });

        jcbxSemaines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxSemainesActionPerformed(evt);
            }
        });

        jbtnGauche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Gauche.PNG"))); // NOI18N
        jbtnGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGaucheActionPerformed(evt);
            }
        });

        jbtnExporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Exporter.PNG"))); // NOI18N

        jbtnQuitter.setBackground(new java.awt.Color(255, 255, 255));
        jbtnQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Quitter.PNG"))); // NOI18N
        jbtnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 267, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnExporter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnSauvegarder, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnOuvrir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jcbxSemaines, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnQuitter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jcbxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAjouter)
                    .addComponent(jbtnSupprimer)
                    .addComponent(jbtnModifier)
                    .addComponent(jLabel3)
                    .addComponent(jbtnExporter)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnOuvrir, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtnSauvegarder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnDroite)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbxSemaines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnGauche)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbxAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxAnneeActionPerformed
        jcbxSemaines.removeAllItems();
        String an = String.valueOf(jcbxAnnee.getSelectedItem());
        for (int i = 9; i <= 12; i++) {
            for (int j = 1; j <= 30; j += 7) {
                jcbxSemaines.addItem("Du " + j + "/" + i + "/" + an.substring(0, 4) + " au " + (j + 6) + "/" + i + "/" + an.substring(0, 4));
            }
        }
//javax.swing.JOptionPane.showMessageDialog(null,jcbxAnnee.getSelectedItem());
    }//GEN-LAST:event_jcbxAnneeActionPerformed

    private void jbtnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnQuitterActionPerformed

    private void jbtnDroiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDroiteActionPerformed
        int idx = jcbxSemaines.getSelectedIndex() + 1;
        if (jcbxSemaines.getItemAt(idx) != null) {
            jcbxSemaines.setSelectedIndex(idx);
        }
    }//GEN-LAST:event_jbtnDroiteActionPerformed

    private void jbtnGaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGaucheActionPerformed
        int idx = jcbxSemaines.getSelectedIndex() - 1;
        if (jcbxSemaines.getItemAt(idx) != null) {
            jcbxSemaines.setSelectedIndex(idx);
        }
    }//GEN-LAST:event_jbtnGaucheActionPerformed

    private void jcbxSemainesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxSemainesActionPerformed
        if(jcbxSemaines.getSelectedIndex() == 0 ){
            jbtnGauche.setEnabled(false);
            jbtnDroite.setEnabled(true);
        } else if(jcbxSemaines.getSelectedIndex() == jcbxSemaines.getItemCount() -1 ) {
            jbtnGauche.setEnabled(true);
            jbtnDroite.setEnabled(false);
        } else {
            jbtnGauche.setEnabled(true);
            jbtnDroite.setEnabled(true);
        }
    }//GEN-LAST:event_jcbxSemainesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPlanning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAjouter;
    private javax.swing.JButton jbtnDroite;
    private javax.swing.JButton jbtnExporter;
    private javax.swing.JButton jbtnGauche;
    private javax.swing.JButton jbtnModifier;
    private javax.swing.JButton jbtnOuvrir;
    private javax.swing.JButton jbtnQuitter;
    private javax.swing.JButton jbtnSauvegarder;
    private javax.swing.JButton jbtnSupprimer;
    private javax.swing.JComboBox jcbxAnnee;
    private javax.swing.JComboBox jcbxSemaines;
    // End of variables declaration//GEN-END:variables
}
