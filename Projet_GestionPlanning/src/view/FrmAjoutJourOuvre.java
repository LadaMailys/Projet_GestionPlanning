/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exception.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;
import model.Planning;
import tools.Utilitaire;

/**
 *
 * @author Cynthia
 */
public class FrmAjoutJourOuvre extends javax.swing.JFrame {

// MODIFICATION A PREVOIR -> Déplacer ce formulaire (dans le FrmPlanning) dans le menu MODIF/SUPPRESSION
//                        -> Le renommer en FrmModifJourOuvre

    static Planning planning;
    DateFormat format;
    DateFormatter df;

    int iJour = 0, iMois = 0, iAnnee = 0;
    Jour j = null;

    /**
     * Creates new form FrmAjoutJourOuvre
     */
    public FrmAjoutJourOuvre(Planning p) {
        initComponents();
        iAnnee = p.getAnnee();
        jLblAnnee.setText(iAnnee + "");
        planning = p;
        format = new SimpleDateFormat("dd/MM/yyyy");
        df = new DateFormatter(format);
    }
    
    private void RecommenceSaisie(){
        jFTxtDate.setText("");
        iJour = 0; 
        iMois = 0; 
        iAnnee = p.getAnnee();
        Jour j = null;
        jLblAnnee.setText(iAnnee + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBtnValider = new javax.swing.JButton();
        jFTxtDate = new JFormattedTextField(df);
        jLabel1 = new javax.swing.JLabel();
        jLblAnnee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Définir un jour férié");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Définir le jour férié");

        jBtnValider.setText("Valider");
        jBtnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnValiderActionPerformed(evt);
            }
        });

        jFTxtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFTxtDateKeyPressed(evt);
            }
        });

        jLabel1.setText("Saisie la date fériée (dd/mm)");

        jLblAnnee.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblAnnee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jBtnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblAnnee))
                .addGap(18, 18, 18)
                .addComponent(jBtnValider)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnValiderActionPerformed
        String ouv = "";
        if (j != null){
            if(j.isOuvre){
                ouv = " qu'ouvré";
            } else {
                ouv = " que non ouvré";
            }
            // OUI / NON
            JOptionPane.showMessageDialog(null, "Définir " + j.toString() + " en tant" + ouv + "?");
            // if (ResultDialog == ResultDialog.YES){ j.setOuvre(); RecommenceSaisie(); }
            RecommenceSaisie();
        }
    }//GEN-LAST:event_jBtnValiderActionPerformed

    private void jFTxtDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTxtDateKeyPressed
        if (jFTxtDate.getText().length() == 5) {
            try {
                String sJour, sMois;
                sJour = jFTxtDate.getText().substring(0, 2);
                sMois = jFTxtDate.getText().substring(3, 5);
                if (Utilitaire.isInteger(sJour) && Utilitaire.isInteger(sMois)) {
                    iJour = Integer.parseInt(sJour);
                    iMois = Integer.parseInt(sMois);
                } else {
                    throw new NotNumberException();
                }
                if (iJour > 31 || iJour < 1 || iMois < 1 || iMois > 12 || planning.getJour(iJour, iMois) == null) {
                    throw new FormatDateException();
                } else {
                    if (iMois <= 8) {
                        iAnnee = planning.getAnnee() + 1;
                    } else if (iMois >= 9) {
                        iAnnee = planning.getAnnee();
                    }
                    jLblAnnee.setText(iAnnee + "");
                    j = planning.getJour(iJour,iMois);
                    if (j.isOuvre()){
                        //jLblIndicOuvre.setText("Ouvré");
                    } else {
                        //jLblIndicOuvre.setText("Non ouvré");
                    }
                }
            } catch (NotNumberException nne) {
            } catch (FormatDateException fde) {
            }
        }
    }//GEN-LAST:event_jFTxtDateKeyPressed

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
            java.util.logging.Logger.getLogger(FrmAjoutJourOuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutJourOuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutJourOuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutJourOuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAjoutJourOuvre(planning).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnValider;
    private javax.swing.JFormattedTextField jFTxtDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblAnnee;
    // End of variables declaration//GEN-END:variables
}
