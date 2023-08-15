/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaotemp;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class ConversaoTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float tempC, tempF, tempK;
        
        System.out.println("Informe a temp em C:");
        tempC = ler.nextFloat();
        
        tempF = tempC * (float) 1.8 + 32;
        tempK = tempC + (float) 273.15;
        
        System.out.println("Temp F: " + tempF);
        System.out.println("Temp K: " + tempK);
    }
    
}
