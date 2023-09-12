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
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        
        livro1.cadastro("123assa", "Don Casmurro", "Joaquim alves", "Ficção", 0);
        livro1.emprestimo();
        livro1.mostrar();
        livro1.devolucao();
        
    }
    
}
