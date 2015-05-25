/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import model.*;
import tools.Utilitaire;

/**
 *
 * @author Cynthia
 */
public class FrmAssocieModuleFormation extends javax.swing.JFrame implements Observer {

    static Promotion promotion;
    static ModeleTableauModuleForm modeleModuleForm;
    static ModeleTableauEnsembleModule modeleEnsMod;
    static Sauvegarde s;

    public static void refresh() {
        modeleModuleForm.fireTableDataChanged();
        modeleEnsMod.fireTableDataChanged();
    }

    /**
     * Creates new form FrmAssocieModuleFormation
     */
    public FrmAssocieModuleFormation(Promotion promo, Sauvegarde sauv) {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        promotion = promo;
        s = sauv;
        modeleModuleForm = new ModeleTableauModuleForm();
        modeleEnsMod = new ModeleTableauEnsembleModule();
        initComponents();

        if (s.getLstPromotions() != null && !s.getLstPromotions().isEmpty()) {
            for (Promotion p : s.getLstPromotions()) {
                jCbxFormations.addItem(p.getNom());
            }
        } else {
            jCbxFormations.addItem(promotion.getNom());
        }

        /*jTabModForm.setDefaultRenderer(Color.class, new ModuleCellRenderer());
         for (int i = 0; i < 2; i++) {
         jTabModForm.getColumnModel().getColumn(i).setCellRenderer(new ModuleCellRenderer());
         }*/
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

        jCbxFormations = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabModForm = new javax.swing.JTable();
        jBtnNouveau = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabEnsMod = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnAjouter = new javax.swing.JButton();
        jBtnRetirer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Associer un module");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ajouter des modules à la formation");

        jLabel2.setText("Formation");

        jTabModForm.setModel(modeleModuleForm);
        jScrollPane2.setViewportView(jTabModForm);

        jBtnNouveau.setText("Nouveau");
        jBtnNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNouveauActionPerformed(evt);
            }
        });

        jTabEnsMod.setModel(modeleEnsMod);
        jScrollPane1.setViewportView(jTabEnsMod);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Les modules existants");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Les modules de la formation");

        jBtnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Gauche.PNG"))); // NOI18N
        jBtnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAjouterActionPerformed(evt);
            }
        });

        jBtnRetirer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/Droite.PNG"))); // NOI18N
        jBtnRetirer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetirerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCbxFormations, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnRetirer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jBtnNouveau))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxFormations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jBtnAjouter)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnRetirer)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnNouveau)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNouveauActionPerformed
        FrmAjoutModule frmAjMod = new FrmAjoutModule(promotion, s);
        frmAjMod.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../tools/icone.gif")));
        frmAjMod.setVisible(true);
    }//GEN-LAST:event_jBtnNouveauActionPerformed

    private void jBtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAjouterActionPerformed
        if (jTabEnsMod.getSelectedColumn() > -1) {
            String mod = (String) jTabEnsMod.getValueAt(jTabEnsMod.getSelectedRow(),0);
            Module m = Utilitaire.getModule(mod, s);
            s.ajouterModule(m);
            promotion.ajouteModule(m);
            refresh();
        }
    }//GEN-LAST:event_jBtnAjouterActionPerformed

    private void jBtnRetirerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetirerActionPerformed
        if (jTabModForm.getSelectedColumn() > -1) {
            String mod = (String) jTabModForm.getValueAt(jTabModForm.getSelectedRow(),0);
            Module m = Utilitaire.getModule(mod, s);
            promotion.retireModule(m);
            refresh();
        }
    }//GEN-LAST:event_jBtnRetirerActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAssocieModuleFormation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAssocieModuleFormation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAssocieModuleFormation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAssocieModuleFormation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAssocieModuleFormation(promotion, s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAjouter;
    private javax.swing.JButton jBtnNouveau;
    private javax.swing.JButton jBtnRetirer;
    private javax.swing.JComboBox jCbxFormations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabEnsMod;
    private javax.swing.JTable jTabModForm;
    // End of variables declaration//GEN-END:variables

    private static class ModeleTableauModuleForm extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return promotion.getLesModules().size();
        }

        @Override
        public String getColumnName(int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return "Nom";
                case 1:
                    return "Abbr.";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override
        public int getColumnCount() {
            return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (columnIndex == 0) {
                return promotion.getLesModules().get(rowIndex).getNom();
            } else {
                return promotion.getLesModules().get(rowIndex).getAbbreviation();
            }
        }
    }

    public class ModuleCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            Color color = (Color) value;

            if (color == null) {
                setBackground(Color.WHITE);
            } else {
                setBackground(color);
            }

            return this;
        }
    }

    private class ModeleTableauEnsembleModule extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return s.getLstModules().size();
            //return Module.getLstModules().size();
        }

        @Override
        public String getColumnName(int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return "Nom";
                case 1:
                    return "Abbr.";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override
        public int getColumnCount() {
            return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (columnIndex == 0) {
                return s.getLstModules().get(rowIndex).getNom();
            } else {
                return s.getLstModules().get(rowIndex).getAbbreviation();
            }
        }
    }
}