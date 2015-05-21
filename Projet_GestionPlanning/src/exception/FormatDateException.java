/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception;

import javax.swing.JOptionPane;

/**
 *
 * @author Cynthia
 */
public class FormatDateException extends Exception{
        public FormatDateException() {
        JOptionPane.showMessageDialog(null, "Veuillez entrer une date valide.");
    }    
}
