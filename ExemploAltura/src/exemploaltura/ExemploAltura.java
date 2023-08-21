/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploaltura;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class ExemploAltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float altura1, altura2, altura3;
        
        System.out.println("Informe a primeira altura:");
        altura1 = ler.nextFloat();
        
        System.out.println("Informe a segunda altura:");
        altura2 = ler.nextFloat();
        
        System.out.println("Informe a terceira altura:");
        altura3 = ler.nextFloat();
        
        if(altura1 >= altura2 && altura1 >= altura3){
            System.out.println("Maior altura: " + altura1);
        }else if(altura2 >= altura1 && altura2 >= altura3) {
            System.out.println("Maior altura: " + altura2);
        }else{
            System.out.println("Maior altura: " + altura3);
        }
    }
}
