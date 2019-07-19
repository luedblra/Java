/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis-linux
 */
public class Saludo {
    public static void main(String[] args) {
        double valor;
        System.out.println("Hola Luis");
        valor = Math.sqrt(9);
        System.out.println("Hola tu valor es "+valor);
        String dato         = "Este es un ejemplo de java";
        String datoone      = "Luis123";
        String datotwo      = "luis123";
        String nombre       = "programacion";
        String datoinicial  = dato.substring(0,21);
        String datoFilnal   = dato.substring(22,26);
        
        System.out.println("Hola. "+dato);
        System.out.println("Hola. "+datoinicial+" "+nombre+" "+datoFilnal);
        System.out.println("sin case es "+ datoone.equals(datotwo));
        System.out.println("con case es "+datoone.equalsIgnoreCase(datotwo));
    }
}
