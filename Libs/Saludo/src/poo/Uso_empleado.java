/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_empleado {
    public static void main(String[] args) {
        Empleado objeEmpleado = new Empleado("luis",5000000,2019,03,28);
        System.out.println("Sueldo Anterior: "+  objeEmpleado.DameSueldo());
        objeEmpleado.aumentaSueldo(10.12);
        System.out.println("Sueldo Anterior: "+  objeEmpleado.DameSueldo());
        System.out.println("Fecha: "+  objeEmpleado.DameFecha());
    }
}

class Empleado{
    
    public Empleado(String nom, double sue, int anos, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar dateGreG = new GregorianCalendar(anos,mes,dia);
        altaContrato = dateGreG.getTime();
    }
    
    public String DameNombre(){ //Getter
        return nombre;
    }
    
    public double DameSueldo(){ //Getter
        return sueldo;
    }
    
    public Date DameFecha(){ //Getter
        return altaContrato;
    }
    
    public void aumentaSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}