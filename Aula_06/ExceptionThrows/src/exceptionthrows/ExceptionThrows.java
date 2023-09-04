/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author professor
 */
public class ExceptionThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException, InputMismatchException {
        Scanner ler = new Scanner(System.in);
        
        int x;
        int y = 8;
        
        System.out.println("Informe um valor:");
        if(!ler.hasNextInt()){
            throw new InputMismatchException("Entrada inválida!");
        }
        x= ler.nextInt();
        
        if(x == 0){
            throw new IllegalArgumentException("Operação inválida, divisão por zero!");
        } else{
            x = x+y;
            System.out.println(x);
        }
    }
    
}
