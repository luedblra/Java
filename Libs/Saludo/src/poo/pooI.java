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
public class pooI {
    
    private int ruedas,motor,peso,ancho;
    private double largo;
    
    public pooI(){
        ruedas  = 4;
        motor   = 600;
        peso    = 500;
        ancho   = 2;
        largo   = 3.5;
    }
    
    public String numero_ruedas(){
        return "El numero de ruedas es: "+ruedas;
    }
    
    public String dime_largo(){
        return "El largo es: "+largo;
    }
     public void cambia_largo(double valor){
        largo = valor;
    }
    
}
