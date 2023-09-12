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
    //Classe que armazena as informações do livro
    //Atributos do livro
    public String isbn;
    public String titulo;
    public String autor;
    public String genero;
    public int status;
    
    //Construtor da classe
    public Livro(){
        status = 0;
    }
    
    //Método para cadastro de dados um livro
    public void cadastro(String cod, String t, String a, String g, int s){
        isbn = cod;
        titulo = t;
        autor = a;
        genero = g;
        status = s;
    }
    
    //Método para exibir as informações
    public void mostrar(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("Status: " + status);
    }
    
    //Método para empréstimo do livro
    public void emprestimo(){
        if(status == 1)
            System.out.println("Livro indisponível!");
        else{
            status = 1;
            System.out.println("Livro emprestado com sucesso!");
        }
    }
    
    //Método para devolução
    public void devolucao(){
        status = 0;
        System.out.println("Livro devolvido com sucesso!");
    }
}
