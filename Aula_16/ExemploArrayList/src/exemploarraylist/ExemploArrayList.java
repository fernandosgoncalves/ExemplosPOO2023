/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author professor
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Collection<Integer> teste = new ArrayList();
        List<Integer> lista2 = new ArrayList();
        List<String> alunos = new ArrayList();
        
        lista2.add(10);
        lista2.add(12);
        lista2.add(-3);
        lista2.add(10);
        lista2.add(12);
        lista2.add(-3);
        
        System.out.println("Lista: "+lista2);
        
        System.out.println(lista2.size());
        
        lista2.remove(3);
        //teste.removeAll(teste);
        
        System.out.println("Lista: "+lista2);
        
        
        alunos.add("João");
        alunos.add("Manuela");
        alunos.add("Pedro");
        alunos.add("Maria");
        alunos.add("Luana");
        alunos.add("Mateus");
        
        System.out.println("Lista Nomes: " + alunos);
        
        alunos.remove(2);
        
        System.out.println("Lista Nomes: " + alunos);
        
        alunos.remove("Mateus");
        
        System.out.println("Lista Nomes: " + alunos);
        
        alunos.set(3, "Aurélio");
        
        System.out.println("Lista Nomes: " + alunos);
        
    }
    
}
