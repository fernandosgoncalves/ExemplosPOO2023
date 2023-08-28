/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplorepeticao;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class ExemploRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0, soma2 = 0, z = 0;
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i <=100; i+=2){
            System.out.println(i);
        }
        
        for(int x=0; x<=100; x+=3){
            soma += x;
        }
        
        System.out.println("Soma: " + soma);
        
        int x=0;
        System.out.println("Informe um valor:");
        x = ler.nextInt();
                
        z =10;
        /*do{
            soma2 += z;
            z++;
        } while (z < x);*/
        
        while (z < x){
            soma2 += z;
            z++;
        };
        
        System.out.println("Soma 2: " + soma2);
        
        //Exemplo break e continue
        int w =1, soma3 =0;
        
        while (w < 105){
            System.out.println(w);
            if(w == 45)
                break;
            if(w%10 == 0){
                w++;
                continue;
            }
            soma3 += w;
            w++;
        }
        
        System.out.println("Soma 3: " + soma3);
        
        
        
    }
    
}
