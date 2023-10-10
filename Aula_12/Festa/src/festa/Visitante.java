/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package festa;

/**
 *
 * @author professor
 */
public class Visitante {

    //Atributos
    private String nome;
    private String fone;
    private String cidade;
    private char sexo;
    private String profissao;
    private int anoNasc;

    //Construtor da classe
    public Visitante() {
    }

    public Visitante(String nome, String fone, String cidade,
            char sexo, String profissao, int anoNasc) {
        this.nome = nome;
        this.fone = fone;
        this.cidade = cidade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.anoNasc = anoNasc;
    }

    //GETS
    public String getNome() {
        return this.nome;
    }

    public String getFone() {
        return this.fone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
}
