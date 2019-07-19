/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author luis-linux
 */
public class herenciasDepoo {
    
    public static void main(String[] args) {
        
        pooI miInstanciaPI = new pooI();
        
        miInstanciaPI.cambia_largo(3);
        String data1[] = miInstanciaPI.data_completa();
        System.out.println("Sin Herencia -----------------------");
        for(String elemento:data1){
            System.out.println(elemento);
        }
        
        pooII miInstanciaPII =new pooII(2, 30);
        
        miInstanciaPII.cambia_largo(3.7);
        miInstanciaPII.configura_asiento("si");
        
        System.out.println("Con Herencia -----------------------");
        System.out.println(miInstanciaPII.dimeDatospoolII());
        String[] data = miInstanciaPII.data_completa();
        for(String elemento:data){
            System.out.println(elemento);
        }
    }
    
}
