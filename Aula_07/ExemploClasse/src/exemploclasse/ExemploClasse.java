/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasse;

/**
 *
 * @author professor
 */
public class ExemploClasse {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância de classe
        Televisor t = new Televisor();
        
        t.aumentarVolume();
        t.aumentarVolume();
        t.aumentarVolume();
        t.diminuirVolume();
        t.trocarCanal(10);
        t.mostrar();

    }
    
        public static class Televisor{
        public int volume;
        public int canal;
        
        public Televisor(){
            volume = 13;
        }
        
        public void aumentarVolume(){
            volume++;
        }
        
        public void diminuirVolume(){
            volume--;
        }
        
        public void trocarCanal(int c){
            canal = c;
        }
        
        public void mostrar(){
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);
        }
    }
}
