package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author luis-linux
 */
public class Uso_persona {
 
    public static void main(String[] args) {
        Persona[] personas=new Persona[2];
        
        personas[0]= new Empleado2("Luis", 100000, 2015, 12, 11);
        personas[1]= new Alumno("Marie", "Administración");
        
        for(Persona elemento:personas){
            System.out.println(elemento.dameNombre()+" "+elemento.dameDescripcion());
        }
        
    }
    
}

abstract class Persona{
    
    private String nombre;
    
    public Persona(String nom){
        nombre=nom;
    }
    
    public String dameNombre(){
        return nombre;
    }
    
    public abstract String dameDescripcion();
    
}

class Empleado2 extends Persona{
    
    public Empleado2(String nom, double sue, int anos, int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar dateGreG = new GregorianCalendar(anos,mes-1,dia);
        altaContrato = dateGreG.getTime();
        IdSiguiente++;
        Id=IdSiguiente;
        
    }
    
    public String dameDescripcion(){
        
        return "Este empleado tiene ID: "+Id+", con un sueldo de: "+ sueldo;
    }
    
    public String dameIdSiguiente(){
        return "El proximo Id sera: "+IdSiguiente;
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
    
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente ;
    private int Id;
}


class Alumno extends Persona{
    
    private String carrera;
    
    public Alumno(String nom, String car){
        super(nom);
        carrera=car;
    }
    
       public String dameDescripcion(){
        
        return "Este Alumno está en la carrera: "+carrera;
    }
    
}