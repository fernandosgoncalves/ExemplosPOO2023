/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplofarmacia;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class ExemploFarmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int doses, saldo, diasAplic;
        float vlrUnit;
        String tipoAplic;
        int totalDoses;
        float vlrTotal;
        
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de doses ao dia: ");
        doses = ler.nextInt();
        
        System.out.print("Informe o valor Uniário: ");
        vlrUnit = ler.nextFloat();
        
        System.out.println("Informe o saldo: ");
        saldo = ler.nextInt();
        
        System.out.println("Dias aplicação: ");
        diasAplic = ler.nextInt();
        
        System.out.println("Tipo aplicação: ");
        tipoAplic = lerTexto.next();
        
        totalDoses = doses * diasAplic;
        vlrTotal = vlrUnit * totalDoses;
        
        System.out.println("Total de doses " + totalDoses);
        System.out.println("Valor total " + vlrTotal);
        
        if(totalDoses > saldo){
            System.out.println("Saldo insuficiente!");
        }else{
            System.out.println("Saldo suficiente");
        }
        
        switch(tipoAplic){
            case "O":
                System.out.println("Aplic. Oral");
            break;
            case "I":
                System.out.println("Aplic. Injetável");
            break;
            case "C":
                System.out.println("Colírio");
            break;
            default:
                System.out.println("Tipo inválido!");
            break;
        };
       
    }
    
}
