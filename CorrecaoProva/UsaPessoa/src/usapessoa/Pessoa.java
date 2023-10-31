/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapessoa;

import java.util.Calendar;

/**
 *
 * @author professor
 */
public class Pessoa {
    private String nome;
    private int anoNascimento;
    private char sexo;
    private float salario;
    
    public Pessoa(){
    }

    public Pessoa(String nome, int anoNascimento, char sexo, float salario) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public int calculaIdade(){
        int idade = 2023 - anoNascimento;
        //Calendar.getInstance().get(Calendar.YEAR);
        
        return idade;
    }
    
    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ano Nascimento: " + anoNascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Idade: " + calculaIdade());
    }
 
}
