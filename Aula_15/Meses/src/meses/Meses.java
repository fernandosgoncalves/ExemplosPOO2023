/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

/**
 *
 * @author professor
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", 
            "Dezembro"};
        int valor = (int) (Math.random()*11);
        
        System.out.println(meses[valor]);
    }
}
