/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraticaRepeticoes;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class PraticaRepeticoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {10,8,15,43,22};
        int valor, aux = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        valor = ler.nextInt();
        
        for(int i=0; i<5; i++){
            if(lista[i] == valor){
                aux = 1;
                System.out.println("Encontrou na poisicao: " + i);
            }
        }
        
        if(aux == 0)
            System.out.println("Valor nao encontrado na lista!");
       
        //-------------------------
        
        int numero;
        
        System.out.println("Informe um numero:");
        numero = ler.nextInt();
        
        while (numero > 0){
            numero--;
            System.out.println(numero);
        }
        
    }
    
}
