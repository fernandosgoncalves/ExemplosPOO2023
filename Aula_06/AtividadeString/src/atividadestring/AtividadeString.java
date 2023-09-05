/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadestring;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class AtividadeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase, palavra;
        
        frase = JOptionPane.showInputDialog("Informe uma frase: ");
        palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
        
        System.out.println("Frase: " + frase.toUpperCase());
        System.out.println("Palavra: " + palavra.toUpperCase());
        System.out.println("Tamanho frase: " + frase.length());
        System.out.println("Tamanho palavra: " + palavra.length());
        
        if(frase.toUpperCase().contains(palavra.toUpperCase()))
            System.out.println("Palavra encontrada!");
        else
            System.out.println("Palavra não encontrada");
        
    }
    
}
