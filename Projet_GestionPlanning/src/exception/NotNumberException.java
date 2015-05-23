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
public class NotNumberException extends Exception {

    public NotNumberException() {
        JOptionPane.showMessageDialog(null, "Veuillez n'entrer que des chiffres.","Exception",JOptionPane.ERROR_MESSAGE);
    }

}
