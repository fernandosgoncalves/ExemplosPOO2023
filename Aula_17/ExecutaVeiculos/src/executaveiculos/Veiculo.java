/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaveiculos;

/**
 *
 * @author professor
 */
public class Veiculo {
    private String cor;
    private String placa;
    private String marca;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String cor, String placa, String marca, int ano) {
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Cor=" + cor + ", Placa=" + placa + ", Marca=" + marca + ", Ano=" + ano;
    }

}
