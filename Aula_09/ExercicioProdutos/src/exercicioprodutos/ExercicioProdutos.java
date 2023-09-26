/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioprodutos;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExercicioProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String descricao, unidade;
        float saldo, valorUnitario, subtotal;
        
        //Criação da primeira instancia
        Produto p1 = new Produto("Memória RAM", "UN", 15, (float)450.45);
        
        //Entrada de dados
        descricao = JOptionPane.showInputDialog("Informe a descrição do produto:");
        unidade = JOptionPane.showInputDialog("Informe a unidade:");
        saldo = Float.valueOf(JOptionPane.showInputDialog("Informe o Saldo:"));
        valorUnitario = Float.valueOf(JOptionPane.showInputDialog("Informe o valor unitário:"));
        
        //Criação da Segunda instância
        Produto p2 = new Produto(descricao, unidade, saldo, valorUnitario);
        
        //p1.mostrar();
        //p2.mostrar();
        
        p1.atualizaSubtotal();
        subtotal = p2.atualizaSubtotal();
        
        p1.mostrar();
        p2.mostrar();
        
        System.out.println("Saldo p1: " + p1.getSaldo());
        System.out.println("Subtotal p2: " + subtotal);
        
    }
    
}
