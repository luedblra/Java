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
    private boolean asientos_cuero;
    
    public pooI(){  //Construtor
        ruedas  = 4;
        motor   = 600;
        peso    = 500;
        ancho   = 2;
        largo   = 3.5;
    }
    
    public String numero_ruedas(){  //Getter
        return "El numero de ruedas es: "+ruedas;
    }
    
    public String dime_largo(){ //Getter
        return "El largo es: "+largo;
    }
     public void cambia_largo(double largo){ //Setter
        this.largo = largo;
    }
     
    public void configura_asiento(String asientos_cuero){ //Setter
        if(asientos_cuero == "si"){
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }
    
    public String tipo_asientos(){
        String data = "";
        if(asientos_cuero){
            data ="Los asientos de este auto, son de cuero";
        } else {
            data ="Los asientos de este auto, No son de cuero";
        }
        return data;
    }
    
    public String[] data_completa(){
        String[] data=new String[6];
        String asientos="";
        int pesoTolal;
        if(asientos_cuero){
            asientos = "cuero";
            pesoTolal = peso + 40;
        } else {
            asientos = "serie";
            pesoTolal = peso + 20;
        }
        
            data[0] = "Peso Total "+pesoTolal;
            data[1] = "motor "+ motor;
            data[2] = "Largo "+largo;
            data[3] = "Ancho "+ancho;
            data[4] = "Ruedas "+ruedas;
            data[5] = "Asientos de "+asientos;
            
        return data;
    }
    
}
