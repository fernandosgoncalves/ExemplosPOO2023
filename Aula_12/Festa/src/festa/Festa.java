/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package festa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class Festa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Visitante[] participantes = new Visitante[10];
        
        int opcao = 0, auxPos = 0;
        String auxNome, auxFone, auxCidade, auxProfissao;
        char auxSexo;
        int auxAnoNasc;
        
        while(opcao != 3){
            System.out.println("-- Menu --");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Mostrar Dados");
            System.out.println("3 - Sair");
            System.out.println("Informe uma opção:");
            opcao = ler.nextInt();
            
            switch(opcao){
                case 1:
                    //Cadastro
                    if(auxPos < 10){
                        auxNome = JOptionPane.showInputDialog("Informe o nome:");
                        auxFone = JOptionPane.showInputDialog("Informe o telefone:");
                        auxCidade = JOptionPane.showInputDialog("Informe a cidade:");
                        auxSexo = JOptionPane.showInputDialog("Informe o sexo (F/M):").
                                charAt(0);
                        auxProfissao = JOptionPane.showInputDialog("Informe a Profissao:");
                        auxAnoNasc = Integer.valueOf(JOptionPane.showInputDialog(
                                "Informe o ano de nascimento:"));
                        
                        Visitante auxV = new Visitante(auxNome, auxFone, auxCidade,
                        auxSexo, auxProfissao, auxAnoNasc);
                        
                        participantes[auxPos] = auxV;
                        auxPos++;
                    }else{
                        JOptionPane.showMessageDialog(null, "Lista Completa!");
                    }
                break;
                case 2:
                    //Mostrar dados
                    int totalVisitantes = 0, totalMasc = 0, totalFem = 0, 
                            visitantesMenores = 0, visitantesOutrasCidades = 0;
                    float percMasc, percFem;
                    
                    for(int i=0; i < auxPos; i++){
                        totalVisitantes = totalVisitantes + 1;
                        if(participantes[i].getSexo() == 'F')
                            totalFem++;
                        else
                            totalMasc++;
                        
                        if(participantes[i].getAnoNasc() > 2005)
                            visitantesMenores++;
                        
                        if(!participantes[i].getCidade().equalsIgnoreCase("NOVA VENEZA"))
                            visitantesOutrasCidades++;
                    }
                    
                    percMasc = Float.valueOf(totalMasc)/Float.valueOf(totalVisitantes) * 100;
                    percFem = ((float)totalFem/(float)totalVisitantes) * 100;
                    
                    System.out.println("Total Visitantes: " + totalVisitantes);
                    System.out.println("Total de Homens: " + totalMasc);
                    System.out.println("Percentual Homens: " + percMasc);
                    System.out.println("Total de Mulheres: " + totalFem);
                    System.out.println("Percentual Mulheres: " + percFem);
                    System.out.println("Total menores: " + visitantesMenores);
                    System.out.println("Outras cidades: " + visitantesOutrasCidades);
                    
                break;
            }
            
            
        }
        
        
        
     }
    
}
