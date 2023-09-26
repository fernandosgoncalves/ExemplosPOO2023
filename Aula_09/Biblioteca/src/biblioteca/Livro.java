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
    private String titulo;
    private String autor;
    private int ano;
    private char status;
    
    public Livro(){
    }
    
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = 2000;
        this.status = 'D';
    }
    
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.status = 'D';
    }
    
    public void consultar(){
        System.out.println("Titulo:" + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        switch(this.status){
            case 'D':
                System.out.println("Status: Disponível");
            break;
            case 'E':
                System.out.println("Status: Emprestado");
            break;
            case 'I':
                System.out.println("Status: Indisponível");
            break;
            default:
                System.out.println("Status: Não cadastrado");
            break;
        }
    }
    
    public int emprestimo(){
        if(this.status == 'D'){
            this.status = 'E';
            return 1;
        }else if(this.status == 'E'){
            return -1;
        }else {
            return 0;
        }
    }
    
    public int devolucao(){
        if(this.status == 'E'){
            this.status = 'D';
            return 1;
        }else if(this.status == 'D'){
            return -1;
        }else {
            return 0;
        }
    }
    
    public void trocarStatus(char status){
        this.status = status;
    }
    
    public void trocarStatus(){
        if(this.status == 'D')
            this.status = 'I';
        else 
           this.status = 'D';
    }
    
    public char consultarStatus(){
        return this.status;
    }
}
