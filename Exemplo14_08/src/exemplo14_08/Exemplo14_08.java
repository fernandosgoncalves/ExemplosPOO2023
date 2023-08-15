/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo14_08;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class Exemplo14_08 {
    
    int x;
    char a;
    String texto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        
        String teste;
        
        teste = lerString.nextLine();
        
        System.out.println(teste);
        
        int x, y;
        
        System.out.println("Informe o primeiro numero: ");
        x = ler.nextInt();
        
        System.out.println("Informe um segundo numero: ");
        y = ler.nextInt();
        
        System.out.println("Soma de " + x + " + "
                + y + " = " + soma(x,y)); 
                        
        System.out.println("Soma de 5 + 3 = " 
                + soma(5,3));

        float a = (float) 4.5;
        float b, c;
        b = 3;
        c = (float) 8.9;
        
        System.out.println("A + B = " + (a+b));
        System.out.println("B * C = " + b*c);
        
        System.out.println("A + B = " + (a+b) + "\n"
                + "B * C = " + b*c);
    }
    
    public static int soma(int a, int b){
        return a+b;
    }
}
