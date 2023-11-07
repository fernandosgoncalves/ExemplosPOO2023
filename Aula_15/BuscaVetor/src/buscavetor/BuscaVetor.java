/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscavetor;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class BuscaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cores = {"Azul", "Verde", "Preto", "Amarelo"};
        
        String cor = JOptionPane.showInputDialog("Informe uma cor:");
        
        String mensagem = "Cor não encontrada";
        
        for(String elemento : cores){
            if(elemento.equals(cor)){
                mensagem = "Cor encontrada!";
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
