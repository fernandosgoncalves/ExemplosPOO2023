/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class Estacionamento {

    public static void main(String[] args) {
        ListaVagas estacionamento = new ListaVagas();
        int opcao = 0, auxValor;
        String auxPlaca;
        
        while(opcao != 4){
            opcao = Integer.valueOf(JOptionPane.showInputDialog("-- Menu --\n1 - Entrada"
                    + "\n2 - Saída\n3 - Lista\n4 - Sair\nInforme uma opção:"));
            
            switch(opcao){
                case 1: 
                    //Entrada
                    auxPlaca = JOptionPane.showInputDialog("Informe a placa:");
                    estacionamento.insereVeiculo(auxPlaca);
                break;
                case 2:
                    //Saída
                    auxValor = Integer.valueOf(JOptionPane.showInputDialog("Informe a vaga que deseja desocupar:"));
                    estacionamento.removeVeiculo(auxValor);
                break;
                case 3:
                    //Listar
                    estacionamento.listarVeiculos();
                break;
            }
        }
    }
}
