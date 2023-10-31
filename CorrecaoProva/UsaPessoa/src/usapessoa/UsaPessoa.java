/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapessoa;

/**
 *
 * @author professor
 */
public class UsaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] lista = new Pessoa[6];
        int qtdeHomens = 0, qtdeMulheres = 0, homemVelho = -1, mulherNova = -1;
        float somaSalario = 0;
                
        lista[0] = new Pessoa("João", 1990, 'M', (float)1500.50); 
        lista[1] = new Pessoa("Maria", 1994, 'F', (float)3500); 
        lista[2] = new Pessoa("Vanessa", 2000, 'F', (float)45500); 
        lista[3] = new Pessoa("Pedro", 1994, 'M', (float)2500); 
        lista[4] = new Pessoa("Manuela", 1970, 'F', (float)35000);        
        lista[5] = new Pessoa("Elis", 2005, 'F', (float)550); 
        
        for(int i=0; i<6; i++){
            System.out.println("Pessoa " + (i+1));
            lista[i].mostrar();
            if(lista[i].getSexo() == 'M'){
                qtdeHomens++;
                if(homemVelho == -1)
                    homemVelho = i;
                else{
                    if(lista[i].getAnoNascimento() < lista[homemVelho].getAnoNascimento())
                        homemVelho = i;
                }
            }else{
                qtdeMulheres++;
                if(mulherNova == -1)
                    mulherNova = i;
                else{
                    if(lista[i].getAnoNascimento() > lista[mulherNova].getAnoNascimento())
                        mulherNova = i;
                }
            }
            
            somaSalario += lista[i].getSalario();
        }
        
        System.out.println("Homens: " + qtdeHomens + " Percentual: " + ((float)qtdeHomens/6 *100));
        System.out.println("Mulheres: " + qtdeMulheres + " Percentual: " + (floatqtdeMulheres/6 * 100));
        System.out.println("Salarios: " + somaSalario + " Media Salarial: " + somaSalario/6);
        System.out.println("Homem mais velho: " + lista[homemVelho].getNome());
        System.out.println("Mulher mais nova: " + lista[mulherNova].getNome());
        
        
        for(int i=0; i<6; i++){
            System.out.println("Pessoa " + (i+1));
            lista[i].mostrar();
        }
        
        for(int i=0; i<6; i++){
            if(lista[i].getSexo() == 'M'){
                qtdeHomens++;
            }else{
                qtdeMulheres++;
            }
        }
        
        for(int i=0; i<6; i++){
            if(lista[i].getSexo() == 'M'){
                if(homemVelho == -1)
                    homemVelho = i;
                else{
                    if(lista[i].getAnoNascimento() < lista[homemVelho].getAnoNascimento())
                        homemVelho = i;
                }
            }
        }
        
        for(int i=0; i<6; i++){
            if(lista[i].getSexo() == 'F'){
                if(mulherNova == -1)
                    mulherNova = i;
                else{
                    if(lista[i].getAnoNascimento() > lista[mulherNova].getAnoNascimento())
                        mulherNova = i;
                }
            }
            
            somaSalario += lista[i].getSalario();
        }
        
    }
}
