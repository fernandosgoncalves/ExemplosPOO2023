/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;

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
        
        Scanner lerMain = new Scanner(System.in);
        Scanner lerStringMain = new Scanner(System.in);
        
        int opcao = 0, aux, auxAno ;
        String auxTitulo, auxAutor;
        
        while(opcao != 6){
            opcao = menu();
            
            switch(opcao){
                case 1: 
                    //Cadastro
                    System.out.println("Informe o livro que deseja cadastrar (1-2):");
                    aux = lerMain.nextInt();
                    
                    System.out.println("Informe o titulo:");
                    auxTitulo = lerStringMain.nextLine();
                    
                    System.out.println("Informe o autor:");
                    auxAutor = lerStringMain.nextLine();
                    
                    System.out.println("Informe o ano:");
                    auxAno = lerMain.nextInt();
                    
                    if(aux == 1)
                        livro1 = new Livro(auxTitulo, auxAutor, auxAno);
                    else
                        livro2 = new Livro(auxTitulo, auxAutor, auxAno);
                    
                    System.out.println("Livro cadastrado com sucesso!");
                break;
                case 2:
                    //Consulta
                    System.out.println("Informe o livro que deseja consultar (1-2):");
                    aux = lerMain.nextInt();
                    
                    if(aux == 1)
                        livro1.consultar();
                    else
                        livro2.consultar();
                break;
                case 3:
                    //Emprestimo
                    System.out.println("Qual livro deseja fazer emprestimo:");
                    aux = lerMain.nextInt();
                    
                    if(aux == 1){
                        aux = livro1.emprestimo();
                    }else{
                        aux = livro2.emprestimo();
                    }
                    
                    switch(aux){
                        case 1:
                            System.out.println("Emprestimo realizado com sucesso!");
                        break;
                        case 0:
                            System.out.println("Livro indisponível!");
                        break;
                        case -1:
                            System.out.println("Livro já emprestado!");
                        break;
                    };
                break;
                case 4:
                    //Devolução
                    System.out.println("Informe o livro que deseja devolver:");
                    aux = lerMain.nextInt();
                    
                    if(aux == 1)
                        aux = livro1.devolucao();
                    else
                        aux = livro2.devolucao();
                    
                    if(aux == 0){
                        //Livro indisponivel
                        System.out.println("Livro indisponível!");
                    }else if(aux == 1){
                        //Devolução realizada com sucesso
                        System.out.println("Livro devolvido com sucesso!");
                    }else{
                        //Livro já disponível
                        System.out.println("Livro já estava disponível!");
                    }
                break;
                case 5:
                    //Troca Status
                    System.out.println("Informe o livro que deseja indisponibilizar:");
                    aux = lerMain.nextInt();
                    
                    if(aux == 1)
                        livro1.trocarStatus();
                    else
                        livro2.trocarStatus();
                break;
            };
        }
    }
    
    public static int menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        
        System.out.println("  -- Menu -- ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Empréstimo");
        System.out.println("4 - Devolução");
        System.out.println("5 - Trocar Status");
        System.out.println("6 - Sair");
        System.out.println("Informe uma opção:");
        opcao = ler.nextInt();
        
        return opcao;
    }
    
}
