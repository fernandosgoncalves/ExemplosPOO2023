/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscabinaria;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class BuscaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = new int[10000];
        
        for(int i=0; i<10000; i++){
            //Geração de números aleatórios para inicializar o vetor
            lista[i] = (int) (Math.random() * 1000);
        }
        
        //Solicita ao usuário o valor a ser buscado
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Informe um valor:"));
        
        String resultado = "Valor não encontrado!";
        
        //Busca posição por posição
        for(int i=0; i<1000; i++){
            if(lista[i] == valor){
                resultado = "Valor encontrado na posição " + (i+1);
                break;
            }
        }

        for(int i=0; i<1000; i++){
            System.out.println(lista[i]);    
        }
        
        System.out.println(" ------------- ");        
        
        System.out.println(resultado);
        
        //---- Busca Binária ---------
        // 1º Passo, ordenar o vetor 
        Arrays.sort(lista);
        
        System.out.println(" ------------- ");
        
        for(int i=0; i<1000; i++){
            System.out.println(lista[i]);    
        }

        //2º Passo, Realizar a busca utilizando a biblioteca de arrays
        int res = Arrays.binarySearch(lista, valor);
        
        if(res > -1)
            System.out.println("Valor econtrado na posicao " + res);
        else
            System.out.println("Valor não encontrado!");
        
    }
    
}
