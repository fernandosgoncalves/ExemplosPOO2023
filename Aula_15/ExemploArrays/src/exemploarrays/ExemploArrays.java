/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import java.util.Arrays;

/**
 *
 * @author professor
 */
public class ExemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notaAluno = new int[5];
        String[] nomeAluno = new String[5];
        float[] notaAluno2 = {8.5f, 4.3f, 5.8f, 4.4f, 9f};
        
        int[][] matriz = new int[3][2];        
        int[][] matriz2 = {{1,2},{3,4},{5,6}};
        
        nomeAluno[2] = "Cevert";
        notaAluno[2] = 8;
        
        nomeAluno[0] = "Maria";
        notaAluno[0] = 6;
        
        for(int i=0; i<5; i++){
            System.out.println("Nome: " + nomeAluno[i]);
            System.out.println("Nota: " + notaAluno[i]);
            System.out.println("Nota2: " + notaAluno2[i]);
        }
        
        Arrays.sort(notaAluno2);
        
        System.out.println("--------");
        for(int i=0; i<5; i++){
            System.out.println("Nota2: " + notaAluno2[i]);
        }
        
        for(int x = 0; x < 3; x++){
            for(int y=0; y<2; y++){
                System.out.print(matriz2[x][y] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
