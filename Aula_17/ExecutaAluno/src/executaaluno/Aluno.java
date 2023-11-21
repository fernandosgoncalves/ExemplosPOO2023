/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaaluno;

/**
 *
 * @author professor
 */
public class Aluno {
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;
    private float nota3;

    public Aluno() {
    }

    public Aluno(String nome, int idade, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", idade=" + idade + ", nota1=" + nota1 + ", nota2=" + 
                nota2 + ", nota3=" + nota3 + ", Media= " + calculaMediaAluno();
    }
    
    public void setNotas(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public float calculaMediaAluno(){
        return (nota1 + nota2 + nota3) / 3;
    }
 
    public int alunoAprovado(){
        if(calculaMediaAluno() > 6)
            return 1;
        else 
            return 0;
    }
}
