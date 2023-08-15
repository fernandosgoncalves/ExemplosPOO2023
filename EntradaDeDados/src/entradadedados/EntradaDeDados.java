/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class EntradaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        double v1, v2, v3;
        double resultado = 0;
        
        String texto;
        
        System.out.println("Informe o valor 1:");
        v1 = entrada.nextInt();
        
        System.out.println("Informe o valor 2:");
        v2 = entrada.nextInt();
        
        System.out.println("Informe o valor 3:");
        v3 = entrada.nextInt();
        
        texto = entradaString.nextLine();
        
        System.out.println("Meu texto: " + texto);
        
        resultado = v1 + v2 - v3;
        System.out.println("O valor de a) e: " + resultado);
        
        resultado = (v1-v3) / (v2-v1);
        System.out.println("O valor de d) e:" + resultado);
        
        resultado = v1*v3-v2*v1;
        System.out.println("O valor de e) e:" + resultado);                
    }
    
}
