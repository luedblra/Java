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
public class usoofpooI {
    
    public static void main(String[] args) {
         
        pooI objpooi =new pooI();
        
        System.out.println(objpooi.numero_ruedas());
        
         System.out.println("Antes modificar, "+objpooi.dime_largo());
        
        objpooi.cambia_largo(4);
        
        System.out.println("Despues de modificar, "+objpooi.dime_largo());
    }
}
