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
public class pooII extends pooI{
 
        private int capacidad_carga;
    private int plazas_extras;
    
    public pooII(int plazas_extras, int capacidad_carga){
        
        super(); // llama al constructor de la clase padre pooI
        this.capacidad_carga = capacidad_carga;
        this.plazas_extras   = plazas_extras;
        
    }
    
    public String dimeDatospoolII(){
        return "La capacidad de carga es: "+capacidad_carga+", y las plazas son: "+plazas_extras;
    }
    
    
}
