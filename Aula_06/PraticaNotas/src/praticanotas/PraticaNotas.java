/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticanotas;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class PraticaNotas {

    /**
     * @param args the command line arguments
     */
    //Quando uso throws ele tem que ser especificado na chamada da função
    public static void main(String[] args) throws IllegalArgumentException {
        //Scanner para entrada de dados
        Scanner ler = new Scanner(System.in);
        //Declaração do vetor de notas
        float[] lista = new float[5];
        
        try{ //Abertura do bloco de exceção try-cath
            for(int i = 0; i<5; i++){
                //Entrada de dados pelo usário
                System.out.println("Informe um valor:");
                lista[i] = ler.nextFloat();

                //Verifição se o valor informado é válido, ou seja, maior que zero
                if(lista[i] <= 0){
                    //Mensagem exibida ao usuário                    
                    JOptionPane.showMessageDialog(null, "O valor " + lista[i] + " é inválido!" );
                    //Ativação da exceção throw
                    throw new IllegalArgumentException("Valor inválido!");
                }
            }
        }catch (InputMismatchException n){
            //Tratamento de exceção de entrada de dados no formato incorreto
            JOptionPane.showMessageDialog(null, n.toString());
        }
        
        float maior = lista[0], media = lista[0];
        
        for(int i=1; i<5; i++){
            if(lista[i] > maior)
                maior = lista[i];
            
            media += lista[i];
        }
        
        media = media/5;
        
        JOptionPane.showMessageDialog(null, "Maior: " + maior);
        JOptionPane.showMessageDialog(null, "Media: " + media);
    }
    
}
