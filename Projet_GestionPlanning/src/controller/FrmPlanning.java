/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Component;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import model.*;
import view.*;

/**
 *
 * @author Cynthia
 */
public class FrmPlanning extends javax.swing.JFrame implements Observer {

    int annee;
    ModeleTableau modele;
    static Promotion promotion;
    static Sauvegarde s;

    /**
     * Creates new form FrmCalendrier
     *
     * @param promotion
     * @param planning
     */
    public FrmPlanning(Promotion promotion, Sauvegarde s) {
        this.s = s;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        FrmPlanning.promotion = promotion;
        annee = Calendar.getInstance().get(Calendar.YEAR);
        promotion.getCalendrier().setAnnee(annee);

        modele = new ModeleTableau();
        initComponents();
        for (int i = annee; i <= annee + 10; i++) {
            jcbxAnnee.addItem(i + " / " + (i + 1));
        }
        jLblPromo.setText(promotion.getNom());
        jTabPlanning.setDefaultRenderer(boolean.class, new OuvreCellRenderer());
        for (int i = 0; i < 7; i++) {
            jTabPlanning.getColumnModel().getColumn(i).setCellRenderer(new OuvreCellRenderer());
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jcbxAnnee = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabPlanning = new javax.swing.JTable();
        jLblRangSem = new javax.swing.JLabel();
        jLblPlageSem = new javax.swing.JLabel();
        jbtnSauvegarder = new javax.swing.JButton();
        jbtnDroite = new javax.swing.JButton();
        jcbxSemaines = new javax.swing.JComboBox();
        jbtnGauche = new javax.swing.JButton();
        jbtnExporter = new javax.swing.JButton();
        jbtnQuitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLblPromo = new javax.swing.JLabel();
        jBtnCreeSeance = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAjoutFormation = new javax.swing.JMenuItem();
        jMenuAjoutModule = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuModifFormation = new javax.swing.JMenuItem();
        jMenuModifModule = new javax.swing.JMenuItem();
        jMenuModifSceance = new javax.swing.JMenuItem();
        jMenuModifJourOuvre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuVoirFormation = new javax.swing.JMenuItem();
        jMenuVoirModule = new javax.swing.JMenuItem();
        jMenuVoirSceance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenue dans la gestion de planning");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Sélectionnez l'année :");

        jcbxAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxAnneeActionPerformed(evt);
            }
        });

        jTabPlanning.setModel(modele);
        jTabPlanning.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTabPlanning.setCellSelectionEnabled(true);
        jTabPlanning.setRowHeight(150);
        jScrollPane1.setViewportView(jTabPlanning);

        jLblRangSem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLblRangSem.setText("Semaine 1");

        jLblPlageSem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblPlageSem.setText("du 01/09/2015 au 30/07/2016");

        jbtnSauvegarder.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSauvegarder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Sauvegarder.PNG"))); // NOI18N
        jbtnSauvegarder.setToolTipText("Sauvegarder les données");
        jbtnSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSauvegarderActionPerformed(evt);
            }
        });

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
        jbtnExporter.setToolTipText("Exporter en HTML");
        jbtnExporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExporterActionPerformed(evt);
            }
        });

        jbtnQuitter.setBackground(new java.awt.Color(255, 255, 255));
        jbtnQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Quitter.PNG"))); // NOI18N
        jbtnQuitter.setToolTipText("Quitter");
        jbtnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuitterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Promotion :");

        jLblPromo.setText("jLabel3");

        jBtnCreeSeance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Creer.PNG"))); // NOI18N
        jBtnCreeSeance.setText("Créer scéance");
        jBtnCreeSeance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreeSeanceActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Ajouter.PNG"))); // NOI18N
        jMenu1.setText("Ajouter");

        jMenuAjoutFormation.setText("Formation");
        jMenuAjoutFormation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjoutFormationActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAjoutFormation);

        jMenuAjoutModule.setText("Module");
        jMenuAjoutModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjoutModuleActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAjoutModule);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Modifier.PNG"))); // NOI18N
        jMenu3.setText("Modifier / Supprimer");

        jMenuModifFormation.setText("Formation");
        jMenu3.add(jMenuModifFormation);

        jMenuModifModule.setText("Module");
        jMenuModifModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModifModuleActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuModifModule);

        jMenuModifSceance.setText("Scéance");
        jMenu3.add(jMenuModifSceance);

        jMenuModifJourOuvre.setText("Jour ouvré");
        jMenuModifJourOuvre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModifJourOuvreActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuModifJourOuvre);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Consulter.PNG"))); // NOI18N
        jMenu2.setText("Consulter");

        jMenuVoirFormation.setText("Formation");
        jMenuVoirFormation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVoirFormationActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuVoirFormation);

        jMenuVoirModule.setText("Module");
        jMenuVoirModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVoirModuleActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuVoirModule);

        jMenuVoirSceance.setText("Scéance");
        jMenuVoirSceance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVoirSceanceActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuVoirSceance);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jcbxSemaines, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCreeSeance)
                                .addGap(243, 243, 243)
                                .addComponent(jLblPlageSem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                        .addComponent(jbtnExporter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jbtnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSauvegarder, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblPromo)
                        .addGap(235, 235, 235)
                        .addComponent(jLblRangSem)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblRangSem)
                    .addComponent(jLabel2)
                    .addComponent(jLblPromo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLblPlageSem)
                        .addComponent(jBtnCreeSeance))
                    .addComponent(jbtnExporter)
                    .addComponent(jbtnSauvegarder))
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
        String an = jcbxAnnee.getSelectedItem() + "";
        promotion.getCalendrier().setAnnee(Integer.parseInt(an.substring(0, 4)));
        promotion.getCalendrier().remplirCalendrier();
        for (int i = 1; i <= promotion.getCalendrier().getNbSemainesAnnee(); i++) {
            jcbxSemaines.addItem("Du " + promotion.getCalendrier().getLaSemaine(i).get(0) + " au " + promotion.getCalendrier().getLaSemaine(i).get(6));
        }
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
        if (jcbxSemaines.getSelectedIndex() == 0) {
            jbtnGauche.setEnabled(false);
            jbtnDroite.setEnabled(true);
        } else if (jcbxSemaines.getSelectedIndex() == jcbxSemaines.getItemCount() - 1) {
            jbtnGauche.setEnabled(true);
            jbtnDroite.setEnabled(false);
        } else {
            jbtnGauche.setEnabled(true);
            jbtnDroite.setEnabled(true);
        }
        jLblPlageSem.setText(jcbxSemaines.getSelectedItem() + "");
        jLblRangSem.setText("Semaine " + (jcbxSemaines.getSelectedIndex() + 1));
    }//GEN-LAST:event_jcbxSemainesActionPerformed

    private void jbtnSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSauvegarderActionPerformed
        Sauvegarde.serialiser(s);
    }//GEN-LAST:event_jbtnSauvegarderActionPerformed

    private void jMenuAjoutFormationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjoutFormationActionPerformed
        FrmAjoutFormation frmAjoutForm = new FrmAjoutFormation(s);
        frmAjoutForm.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmAjoutForm.setVisible(true);
    }//GEN-LAST:event_jMenuAjoutFormationActionPerformed

    private void jMenuModifModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModifModuleActionPerformed
        FrmModifModule frmModifMod = new FrmModifModule(promotion, s);
        frmModifMod.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmModifMod.setVisible(true);
    }//GEN-LAST:event_jMenuModifModuleActionPerformed

    private void jMenuModifJourOuvreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModifJourOuvreActionPerformed
        FrmModifJourOuvre frmModifJO = new FrmModifJourOuvre(promotion, s);
        frmModifJO.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmModifJO.setVisible(true);
    }//GEN-LAST:event_jMenuModifJourOuvreActionPerformed

    private void jbtnExporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExporterActionPerformed
        try {
            // Creation fichier
            FileWriter fstream = new FileWriter("planning.html");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(promotion.codeHTML());
            // Fermeture
            out.close();
            JOptionPane.showMessageDialog(null, "Planning exporté! ");
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnExporterActionPerformed

    private void jMenuVoirFormationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVoirFormationActionPerformed
        FrmVoirFormation frmVoirForm = new FrmVoirFormation(promotion, s);
        frmVoirForm.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmVoirForm.setVisible(true);

    }//GEN-LAST:event_jMenuVoirFormationActionPerformed

    private void jMenuVoirModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVoirModuleActionPerformed
        //FrmVoirModule frmVoirMod = new FrmVoirModule(promotion, s);
        //frmVoirMod.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        //frmVoirMod.setVisible(true);
    }//GEN-LAST:event_jMenuVoirModuleActionPerformed

    private void jMenuVoirSceanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVoirSceanceActionPerformed
        FrmVoirSceance frmVoirSce = new FrmVoirSceance(promotion, s);
        frmVoirSce.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmVoirSce.setVisible(true);
    }//GEN-LAST:event_jMenuVoirSceanceActionPerformed

    private void jBtnCreeSeanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreeSeanceActionPerformed
        FrmAjoutSceance frmAjSc = new FrmAjoutSceance(s, promotion);
        frmAjSc.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmajSc.setVisible(true);
    }//GEN-LAST:event_jBtnCreeSeanceActionPerformed

    private void jMenuAjoutModuleActionPerformed(java.awt.event.ActionEvent evt) {
        FrmAssocieModuleFormation frmAsMF = new FrmAssocieModuleFormation(promotion, s);
        frmAsMF.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmAsMF.setVisible(true);
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
                new FrmPlanning(promotion, s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCreeSeance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblPlageSem;
    private javax.swing.JLabel jLblPromo;
    private javax.swing.JLabel jLblRangSem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAjoutFormation;
    private javax.swing.JMenuItem jMenuAjoutModule;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuModifFormation;
    private javax.swing.JMenuItem jMenuModifJourOuvre;
    private javax.swing.JMenuItem jMenuModifModule;
    private javax.swing.JMenuItem jMenuModifSceance;
    private javax.swing.JMenuItem jMenuVoirFormation;
    private javax.swing.JMenuItem jMenuVoirModule;
    private javax.swing.JMenuItem jMenuVoirSceance;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabPlanning;
    private javax.swing.JButton jbtnDroite;
    private javax.swing.JButton jbtnExporter;
    private javax.swing.JButton jbtnGauche;
    private javax.swing.JButton jbtnQuitter;
    private javax.swing.JButton jbtnSauvegarder;
    private javax.swing.JComboBox jcbxAnnee;
    private javax.swing.JComboBox jcbxSemaines;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Sauvegarde) {
            s = (Sauvegarde) o;
        }
    }

    private class ModeleTableau extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return 2;
        }

        @Override
        public String getColumnName(int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return "Lundi";
                case 1:
                    return "Mardi";
                case 2:
                    return "Mercredi";
                case 3:
                    return "Jeudi";
                case 4:
                    return "Vendredi";
                case 5:
                    return "Samedi";
                case 6:
                    return "Dimanche";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            String module = "";
            Jour j = promotion.getCalendrier().getLaSemaine(jcbxSemaines.getSelectedIndex() + 1).get(columnIndex);

            if (rowIndex == 0) {
                if (j.isOuvre()) {
                    if (j.getSceanceMatin() != null) {
                        module = "<html>" + j.getSceanceMatin().getModule().getNom() + " ("
                                + j.getSceanceMatin().getModule().getAbbreviation() + ") <br/>"
                                + promotion.getDureeSceance() + "h <br/> Scéance "
                                + promotion.getLesSceancesFaites().size() + "/" + j.getSceanceMatin().getModule().getNbSceanceTotal() + "</html>";
                    } else {
                        module = "Créer une scéance";
                    }
                } else {
                    module = "";
                }

            } else if (rowIndex == 1) {
                if (j.isOuvre()) {
                    if (j.getSceanceSoir() != null) {
                        module = "<html>" + j.getSceanceSoir().getModule().getNom() + " ("
                                + j.getSceanceSoir().getModule().getAbbreviation() + ") <br/>"
                                + "</html>";
                    } else {
                        module = "Créer une scéance";
                    }
                } else {
                    module = "";
                }
            }
            return module;
        }
    }

    public class OuvreCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            String ouv = (String) value;

            if (ouv.equals("")) {
                setBackground(Color.LIGHT_GRAY);
                setEnabled(false);
            } else {
                setBackground(WHITE);
                setEnabled(true);
            }

            return this;
        }
    }
}
