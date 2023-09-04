/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExemploException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 0;
        int y = 10;
        
        try {
            x = y/x;
        
            FileReader f = new FileReader("C:\\teste.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
            Logger.getLogger(ExemploException.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, e.toString());
        } finally{
            JOptionPane.showMessageDialog(null, "Exceção não tratada!");
        }
        
        try{
            System.out.println("Informe um valor:");
            x= ler.nextInt();
            
            System.out.println("Informe um valor:");
            y= ler.nextInt();
        }catch (Exception e){
            System.out.println("Valor inválido: " + e.toString());
        }
        
    }
    
}
