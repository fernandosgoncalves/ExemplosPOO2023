/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaaluno;

import static java.lang.Math.pow;

/**
 *
 * @author professor
 */
public class Aluno {
    private String nome;
    public String sexo;
    public float altura;
    public float peso;
    public float imc;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String sexo, float peso, float altura){
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float calculaImc(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
        
        //imc = peso / (float) pow(altura,2);
        imc = peso / (altura * altura);
        
        return imc;
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome);
        if(this.sexo == "M")
            System.out.println("Sexo: Masculino");
        else
            System.out.println("Sexo: Feminino");
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: " + this.imc);
    }
}
