/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticarepvetor;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class PraticaRepVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = new int[10];
        int maior = 0, menor = 0, soma = 0, produto = 0;
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            System.out.println("Informe o valor " + (i+1) + ":");
            lista[i] = ler.nextInt();
        }
        
        for(int i=0; i<10; i++){
            if(i==0){
                maior = lista[i];
                menor = lista[i];
                produto = lista[i];
            }else{
                if(lista[i] > maior)
                    maior = lista[i];
                if(lista[i] < menor)
                    menor = lista[i];
                
                produto *= lista[i];
            }
            soma += lista[i]; 
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
    }
    
}
