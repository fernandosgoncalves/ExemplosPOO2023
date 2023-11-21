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
public class ExecutaFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormaGeometrica f1 =  new FormaGeometrica(0);
        FormaGeometrica f2 =  new FormaGeometrica(1);
        FormaGeometrica f3 =  new FormaGeometrica(2);
        FormaGeometrica f4 =  new FormaGeometrica(3);
        
        int[] lados = {2,2};
        f1.setLados(lados);
        
        lados = new int[2];
        
        lados[0] = 5;
        lados[1] = 8;
        
        f2.setLados(lados);
        
        f3.setLados(lados);
        
        f4.setRaio(15);
        
        f1.getTipo();
        System.out.println(f1.getArea());
        
        f2.getTipo();
        System.out.println(f2.getArea());
        
        f3.getTipo();
        System.out.println(f3.getArea());
        
        f4.getTipo();
        System.out.println(f4.getArea());
        
    }
    
}
