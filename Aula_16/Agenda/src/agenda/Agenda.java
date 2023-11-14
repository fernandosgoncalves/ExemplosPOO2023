/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Contato> agenda = new ArrayList();
        Contato aux = new Contato();
        
        aux.setNome("Fernando");
        aux.setFone("123456");
        
        agenda.add(aux);
        
        aux.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        aux.setFone(JOptionPane.showInputDialog("Informe o telefone:"));
        
        agenda.add(aux);
        
        System.out.println("Agenda: " + agenda);
        
        
        
    }
    
}
