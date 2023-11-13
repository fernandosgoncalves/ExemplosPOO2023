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
public class PraticaComVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux;
        ListaNumeros lista = new ListaNumeros();
        
        for(int i=0; i<10; i++){
            aux = (int) (Math.random()*20);
            lista.insereNumero(aux);
        }
        
        lista.mostraListas();
    }
    
}
