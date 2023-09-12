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
        //Criando os objetos da classe Livro
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        
        //Criando um objeto da classe revista
        Revista r1 = new Revista("abc123", "Quatro Rodas", "Janeiro", 0);
        
        //Declaração de variáveis auxiliares
        String codigo, titulo, mes;
        int status;
        
        //Informando dados para a classe livro
        livro1.cadastro("123assa", "Don Casmurro", "Joaquim alves", "Ficção", 0);
        //Invocando o método empréstimo
        livro1.emprestimo();
        //Invocando método que exibe as informações
        livro1.mostrar();
        //Invocando o método devolução
        livro1.devolucao();
        
        System.out.println("");
        System.out.println("Revista");
        
        //Entrada de dados para a segunda revista
        codigo = "123asda";
        titulo = "Exame";
        mes = "Dezembro";
        status = 1;
        
        //Instanciando a segunda revista, informando dados no construtor
        Revista r2 = new Revista(codigo, titulo, mes, status);
        
        //Invocando métodos da classe revista
        r1.mostrar();
        r2.devolver();
        r2.mostrar();
        
        r2.setTitulo("Época");
        
        r1.setTitulo("Caras");
        
        r1.mostrar();
        r2.mostrar();
    }
    
}
