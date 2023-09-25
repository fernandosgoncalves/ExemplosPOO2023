/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioprodutos;

/**
 *
 * @author professor
 */
public class Produto {
    private String descricao;
    private String unidade;
    private float saldo;
    private float vlrUnitario;
    private float subtotal;
    
    public Produto(){
    }
    
    public Produto(String descricao, String unidade, float saldo, float valorUnitario){
        this.descricao = descricao;
        this.unidade = unidade;
        this.saldo = saldo;
        this.vlrUnitario = valorUnitario;
        this.subtotal = 0;
    }
    
    public void mostrar(){
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Unidade: " + this.unidade);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Valor Unitário: " + this.vlrUnitario);
        System.out.println("Subtotal: " + this.subtotal);
    }
    
    public float atualizaSubtotal(){
        this.subtotal = this.saldo * this.vlrUnitario;
        return this.subtotal;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
}
