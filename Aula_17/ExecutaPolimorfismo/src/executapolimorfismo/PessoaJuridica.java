/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executapolimorfismo;

/**
 *
 * @author professor
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeSocio;

    public PessoaJuridica(String cnpj, String nomeSocio, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeSocio = nomeSocio;
    }

    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaJuridica{" + "cnpj=" + cnpj + ", nomeSocio=" + nomeSocio + '}';
    }
    
    
    
    
    
    
}
