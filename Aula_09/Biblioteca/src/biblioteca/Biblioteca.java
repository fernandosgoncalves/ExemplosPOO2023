/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author professor
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro domCasmurro = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("Pequeno principe", "Autor X", 2015);
        
        System.out.println("--- Inicial ---");
        domCasmurro.consultar();
        livro2.consultar();
        
        domCasmurro.trocarStatus();
        livro2.emprestimo();
        
        System.out.println("--- Antes ---");
        domCasmurro.consultar();
        livro2.consultar();
        
        livro2.devolucao();
        domCasmurro.trocarStatus('E');
        
        System.out.println("--- Depois ---");
        domCasmurro.consultar();
        livro2.consultar();
    }
    
}
