/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploswitch;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o status:");
        c = ler.next();
        //c = JOptionPane.showInputDialog("Informe o Valor");
        
        switch(c){
            case "A":
                System.out.println("Aluno Aprovado");
            break;
            case "P":
                System.out.println("Aluno com pedências");
            break;
            case "R":
                System.out.println("Aluno necessita de recuperação");
            break;
            case "D":
                System.out.println("Aluno desistente");
            break;
            case "X":
                System.out.println("Aluno reprovado");
            break;
            default:
                System.out.println("Status inválido!");
            break;
        };
    }
    
}
