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
public class Revista {
    //Classe para armazenar os dados da revista
    //Atributos da revista
    public String codigo;
    public String titulo;
    public String mes;
    public int status;
    
    //Construtor vazio
    public Revista(){
        
    }
    
    //Construtor com inicialização dos dados 
    public Revista(String c, String t, String mes, int s){
        codigo = c;
        titulo = t;
        this.mes = mes;
        status = s;
    }
    
    //Método para mostrar as informações
    public void mostrar(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Mês: " + mes);
        System.out.println("Status: " + status);
    }
    
    //Método para emprestimo da revista
    public void emprestar(){
        status = 1;
    }
    
    //Método para devolução
    public void devolver(){
        status = 0;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
