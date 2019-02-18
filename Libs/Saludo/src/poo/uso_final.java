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
public class uso_final {
    
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Jesus");
        Empleados trabajador2 = new Empleados("Judith");
        Empleados trabajador3 = new Empleados("cesar");
        Empleados trabajador4 = new Empleados("abrahan");
        
        trabajador1.cambiaseccion("Administracíon");
        
        System.out.println(trabajador1.dameDatos());
        System.out.println(trabajador2.dameDatos());
        System.out.println(trabajador3.dameDatos());
        System.out.println(trabajador4.dameDatos());
    }
}


class Empleados{

    
    private final String nombre;
    private String seccion;
    private int Id;
    public static int IdSiguiente=1;
        
    public Empleados(String nom){
        nombre=nom;
        seccion="Ingeniería";
        Id=IdSiguiente;
        IdSiguiente++;
        
    }
    
    public void cambiaseccion(String seccion){ //setter
        this.seccion=seccion;
    }
    
    public String dameDatos(){
        
        return "El nombre es:"+nombre+" y la seccion es: "+seccion+". Id: "+Id;
    }
}