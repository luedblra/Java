package poo;
import paquetepruebas.Class3;

public class Class2 {
    public static void main(String[] args) {
        Class1 cobj1 =new Class1();// Instancia de una clase mismo paquete
        
        Class3 cobj3 =new Class3(); // instancia de clase3 paquete paquetepruebas, que extiende la clase 2. herencia de paquete POO
        System.out.println(cobj3.MisumaClase1());
        System.out.println(cobj3.method());
    }
}
