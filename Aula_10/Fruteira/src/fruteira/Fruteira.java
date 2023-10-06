/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteira;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class Fruteira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruta fruta1 = new Fruta("Laranja", "Lima", 15);
        String nome, tipo;
        
        nome = JOptionPane.showInputDialog("Informe o nome da fruta:");
        tipo = JOptionPane.showInputDialog("Informe o tipo da fruta:");
        
        Fruta fruta2 = new Fruta(nome, tipo);
        
        fruta2.setQuantidade(25);
        
        fruta1.setNome("Maçã");
        
        fruta2.setTipo("Média");
        
        fruta1.consultar();
        fruta2.consultar();
    }
    
}
