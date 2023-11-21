/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaformas;

/**
 *
 * @author professor
 */
public class FormaGeometrica {
    private int tipo; //0 - Quadrado 1 - Retangulo 2- Triangulo 3 - Circulo
    private int numLados;
    private int raio;
    private int[] lados;
    
    public FormaGeometrica(int tipo){
        this.tipo = tipo;
        this.lados = new int[2];
    }
    
    public void getTipo(){
        switch(this.tipo){
            case 0:
                //Quadrado
                System.out.println("É um quadrado");
                System.out.println("Número de lados 1");
            break;
            case 1:
                //Retangulo
                System.out.println("É um retângulo");
                System.out.println("Número de lados 2");
            break;
            case 2:
                //Triangulo
                System.out.println("É um triângulo");
            break;
            case 3:
                //Circulo
                System.out.println("É um círculo");
            break;
        }
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public int getRaio() {
        return raio;
    }

    public int[] getLados() {
        return lados;
    }

    public void setLados(int[] lados) {
        this.lados = lados;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public float getArea(){
        switch(this.tipo){
            case 0:
                //Quadrado
                return (this.lados[0]*this.lados[0]);
            //break;
            case 1:
                //Retangulo
                return this.lados[0]*this.lados[1];
            case 2:
                //Triangulo
                return (this.lados[0]*this.lados[1])/2;
            case 3:
                //Circulo
                return (float)(Math.PI * Math.pow(this.raio, 2));
        }
        return 0;
    }
}
