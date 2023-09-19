/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class PraticaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome, sexo;
        float peso, altura;
        
        nome = JOptionPane.showInputDialog("Informe o nome:");
        sexo = JOptionPane.showInputDialog("Informe o sexo (F/M):");
        peso = Float.valueOf(JOptionPane.showInputDialog("Informe o peso:"));
        altura = Float.valueOf(JOptionPane.showInputDialog("Informe a altura:"));
        
        Aluno aluno1 = new Aluno(nome, sexo, peso, altura);
        
        nome = JOptionPane.showInputDialog("Informe o nome:");
        sexo = JOptionPane.showInputDialog("Informe o sexo (F/M):");
        peso = Float.valueOf(JOptionPane.showInputDialog("Informe o peso:"));
        altura = Float.valueOf(JOptionPane.showInputDialog("Informe a altura:"));
        
        Aluno aluno2 = new Aluno(nome, sexo, peso, altura);
        
        aluno1.calculaImc(85, (float) 1.70);
        aluno2.calculaImc(74, (float) 1.65);
        
        //aluno1.nome = "Fernando";
        aluno1.setNome("Fernando");
        
        System.out.println("Aluno 1: \n");
        aluno1.mostrar();
        System.out.println("Aluno 2: \n");
        aluno2.mostrar();
        
    }
    
}
