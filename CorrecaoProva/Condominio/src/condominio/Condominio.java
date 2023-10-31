/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author professor
 */
public class Condominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elevador ev = new Elevador();
        
        System.out.println("Teste");
        ev.Inicializa(8, 10);
        
        ev.Sobe();
        ev.Entra();
        ev.Entra();
        ev.Entra();
        ev.Entra();
        
        ev.Sobe(2);
        ev.Mostrar();
        
        ev.Desce();
        ev.Sai(2);
        
        ev.Sai(7);
        
        ev.Mostrar();
    }
    
}
