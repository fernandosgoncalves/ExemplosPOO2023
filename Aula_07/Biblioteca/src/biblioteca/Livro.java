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
public class Livro {
    public String isbn;
    public String titulo;
    public String autor;
    public String genero;
    public int status;
    
    public Livro(){
        status = 0;
    }
    
    public void cadastro(String cod, String t, String a, String g, int s){
        isbn = cod;
        titulo = t;
        autor = a;
        genero = g;
        status = s;
    }
    
    public void mostrar(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("Status: " + status);
    }
    
    public void emprestimo(){
        if(status == 1)
            System.out.println("Livro indisponível!");
        else{
            status = 1;
            System.out.println("Livro emprestado com sucesso!");
        }
    }
    
    public void devolucao(){
        status = 0;
        System.out.println("Livro devolvido com sucesso!");
    }
}
