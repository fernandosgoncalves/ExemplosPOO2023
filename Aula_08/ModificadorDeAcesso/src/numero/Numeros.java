/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author professor
 */
public class Numeros {
    private float area;
    protected float lado;
    public float valor;
    
    public Numeros(){
    }
    
    public Numeros(float area, float lado, float valor){
        this.area = area;
        this.valor = valor;
        this.lado = lado;
    }
    
    public void setArea(float valor){
        area = valor;
    }
    
    public void atualizaValor(float valor){
        lado = valor + valor;
    }
    
    public void mostrar(){
        System.out.println("Area: " + area);
        System.out.println("Lado: " + lado);
        System.out.println("Valor: " + valor);
    }
    
}
