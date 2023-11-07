/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticavetormatriz;

/**
 *
 * @author professor
 */
public class PraticaVetorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "Luiza", "Ruan"};
        float[][] notas = {{8.5f,4.8f,8.9f,0f}, 
            {7.5f,6.8f,5.9f,0f}, {9.5f,7.8f,8.9f,0f}, 
            {8.3f,7.3f,6.9f,0f}};
        
        for(int i=0; i<4; i++){
            notas[i][3] = (notas[i][0] + notas[i][1] + notas[i][2]) /3;  
        }
        
        for(int x=0; x<4;x++){
            System.out.println("Nome: " + nomes[x]);
            for(int y=0; y<4; y++){
                System.out.print(notas[x][y] + " ");
            }
            System.out.println("");
        }
        
    }
    
    
}
