/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticacomvetores;

/**
 *
 * @author professor
 */
public class ListaNumeros {
    private int[] par;
    private int[] impar;
    private int posPar;
    private int posImpar;
    
    public ListaNumeros(){
        par = new int[10];
        impar = new int[10];
        posImpar = 0;
        posPar = 0;
    }
    
    public void insereNumero(int x){
        if(x%2 == 0){
            par[posPar] = x;
            posPar++;
        }else{
            impar[posImpar] = x;
            posImpar++;
        }
    }
    
    public void mostraListas(){
        System.out.println("-- Pares --");
        for(int i=0; i<posPar; i++){
            System.out.print(par[i]+" ");
        }
        
        System.out.println("");
        
        System.out.println("-- Impar --");
        for(int i=0; i<posImpar; i++){
            System.out.print(impar[i]+" ");
        }
    }
    
    
}
