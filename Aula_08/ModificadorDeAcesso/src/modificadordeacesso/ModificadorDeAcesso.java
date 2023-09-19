/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadordeacesso;

import numero.Numeros;

/**
 *
 * @author professor
 */
public class ModificadorDeAcesso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros n = new Numeros();
        
        n.valor = 10;
        n.atualizaValor(20);
        n.setArea(30);
        
        n.mostrar();
        
    }
    
}
