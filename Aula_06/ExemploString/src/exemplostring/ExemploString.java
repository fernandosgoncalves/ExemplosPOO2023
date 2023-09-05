/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostring;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExemploString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        
        texto = JOptionPane.showInputDialog("Informe um texto");
        
        System.out.println("Texto: " + texto);
        System.out.println("Tamanho: " + texto.length());
        System.out.println("charAt: " + texto.charAt(3));
        System.out.println("UpperCase: " + texto.toUpperCase());
        System.out.println("substring: " + texto.substring(4, 7));
        System.out.println("trim: " + texto.trim());
        System.out.println("Tamanho: " + texto.trim().length());
        System.out.println("Replace: " + texto.replace("poo", "bd-I"));
        System.out.println("Index of: " + texto.indexOf("poo"));
        
    }
    
}
