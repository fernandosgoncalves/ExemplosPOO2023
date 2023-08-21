/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploaula2108;

/**
 *
 * @author professor
 */
public class ExemploAula2108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.1412345;
        int valor = 10;
            
        System.out.println(PI);
        System.out.println(valor);
        
        //PI = 5.5;
        valor = 35;
        
        System.out.println(valor);
        
        //Exemplos Operados
        int a1, b1, c1, f1;
        
        b1 = 7;
        a1 = 5;
        
        c1 = a1 + b1;
        
        System.out.println(c1);
        
        c1 = (a1+b1)/2;
        
        if(c1 >= 6){
            System.out.println("Aluno Aprovado!");
        }
        
        if(c1 < 6){
            System.out.println("Aluno Reprovado!");
        }
        
        f1 = 77;
        
        if(c1 >= 6 && f1 > 75){
            System.out.println("Aluno Aprovado!");
        }else{
            System.out.println("Aluno Reprovado Frequência!");
        }
        
        //Atividade Conversão de Tipo
        String a = "10", b = "8.45", c = "5";
        float x = (float) 3.3, z = (float)14.4;
        int d = 3, e = 18;
        
        float aa, bb;
        int cc;
        
        float r1 = 0, r2 = 0, r3 = 0; 
        
        aa = Float.parseFloat(a);
        bb = Float.valueOf(b);
        cc = Integer.parseInt(c);
        
        r1 = (aa*z)/e;
        r2 = bb + d - x;
        r3 = d*cc-aa;
        
        System.out.println("R1: " + r1 + "\nR2:" + r2);
        System.out.println("R3: " + r3);
        
        
        
        
    }
    
}
