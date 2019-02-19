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
        
        //---------------------------------------------------------------------
        
        Empleado[] empleados=new Empleado[4];
                
        empleados[0]=new Empleado("luis", 85000, 1994, 03, 17);
        empleados[1]=new Empleado("Marie", 90000, 1995, 11, 18);
        empleados[2]=new Empleado("gaby", 100000, 1981, 04, 23);
        empleados[3]=new Empleado("Sebastian D");
        
        for(Empleado elemento:empleados){
            elemento.aumentaSueldo(15);
            System.out.println("Nombre: "+elemento.DameNombre()+", Sueldo: "+
                    elemento.DameSueldo()+". Fecha: "+elemento.DameFecha());
        }
        

    }
}

class Empleado{
    
    public Empleado(String nom, double sue, int anos, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar dateGreG = new GregorianCalendar(anos,mes-1,dia);
        altaContrato = dateGreG.getTime();
    }
    
    public Empleado(String nom){
        this(nom,15000,2019,01,23);
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