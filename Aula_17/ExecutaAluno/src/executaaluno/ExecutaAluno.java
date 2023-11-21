/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaaluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author professor
 */
public class ExecutaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Aluno> turma = new ArrayList<Aluno>();
        
        Aluno aluno = new Aluno("Pedro", 33, (float)7.5, (float)8.4, (float)4.3);
        
        turma.add(aluno);
        
        aluno = new Aluno("Joana", 25, 6.5f, 8f, 7.3f);
        
        turma.add(aluno);
        
        aluno = new Aluno("Luiz", 20, 7.5f, 6.74f, 9.43f);
        
        turma.add(aluno);
        
        aluno = new Aluno("Francisco", 21, 5.5f, 4.8f, 6.3f);
        
        turma.add(aluno);
        
        aluno = new Aluno("Karen", 30, 6.75f, 7.49f, 9f);
        
        turma.add(aluno);
        
        System.out.println("Alunos cadastrados: " + turma.size());
        System.out.println("Aluno com maior média: " + buscaMaiorMedia(turma).toString());
        System.out.println("Aluno com menor média: " + buscaMenorMedia(turma).toString());
        System.out.println("Quantidade de aprovados: " + calculaAprovados(turma));
        System.out.println("Media da turma: " + calculaMediaTurma(turma));
        mostraTurma(turma);
        
        
    }
    
    public static Aluno buscaMaiorMedia(List<Aluno> alunos){
        Aluno aluno = null;
        for(Aluno al : alunos){
            if(aluno == null)
                aluno = al;
            else{
                if(al.calculaMediaAluno() > aluno.calculaMediaAluno())
                    aluno = al;
            }
        }
        return aluno;
    }
    
    public static Aluno buscaMenorMedia(List<Aluno> alunos){
        Aluno aluno = null;
        for(Aluno al : alunos){
            if(aluno == null)
                aluno = al;
            else{
                if(al.calculaMediaAluno() < aluno.calculaMediaAluno())
                    aluno = al;
            }
        }
        return aluno;
    }
    
    public static float calculaMediaTurma(List<Aluno> alunos){
        float media = 0;
        for(Aluno al : alunos){
            media += al.calculaMediaAluno();
        }
        
        return media/alunos.size();
    }
    
    public static int calculaAprovados(List<Aluno> alunos){
        int aprovados = 0;
        for(Aluno al : alunos){
            aprovados += al.alunoAprovado();
        }
        return aprovados;
    }
    
    public static void mostraTurma(List<Aluno> alunos){
        for(Aluno al : alunos){
            System.out.println(al.toString());
        }
    }
}
