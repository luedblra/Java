
package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {
    
    public static void main(String[] args) {
        Empleado objeEmpleado = new Empleado("luis",5000000,2019,03,28);
        System.out.println("Sueldo Anterior: "+  objeEmpleado.DameSueldo());
        objeEmpleado.aumentaSueldo(10);
        System.out.println("Sueldo Anterior: "+  objeEmpleado.DameSueldo());
        System.out.println("Fecha: "+  objeEmpleado.DameFecha());
        
        //---------------------------------------------------------------------
        
        Jefatura Jefe=new Jefatura("Antonio", 100000, 2016, 12, 12);
        Jefe.estableceIncentivo(5000);
        
        Empleado[] empleados=new Empleado[6];
                
        empleados[0]=new Empleado("luis", 85000, 1994, 03, 17);
        empleados[1]=new Empleado("Marie", 90000, 1995, 11, 18);
        empleados[2]=new Empleado("gaby", 100000, 1981, 04, 23);
        empleados[3]=new Empleado("Sebastian D");
        empleados[4]=Jefe; //polimorfismo
        empleados[5]= new Jefatura("abrahan",100000 , 2005, 01, 20);
        
        Jefatura refundicion_jefe=(Jefatura) empleados[5];
        refundicion_jefe.estableceIncentivo(6000);
        
        System.out.println(refundicion_jefe.TomarDecisiones("Dar mas dias de vacaciones a los empleados;"));
        System.out.println("El Jefe: "+refundicion_jefe.DameNombre()+", Tiene un bonus de: "+refundicion_jefe.establece_bonus(3000));
        Arrays.sort(empleados);
        
        for(Empleado elemento:empleados){
            elemento.aumentaSueldo(10);
            System.out.println("Nombre: "+elemento.DameNombre()+", Sueldo: "+
                    elemento.DameSueldo()+". Fecha: "+elemento.DameFecha());
            System.out.println("El Empleado: "+elemento.DameNombre()+", Tiene un bonus de: "+elemento.establece_bonus(2000));    

        }  
        System.out.println(Jefe.dameIdSiguiente());
        
    }
}

class Empleado implements Comparable, Trabajadores{
    
    public Empleado(String nom, double sue, int anos, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar dateGreG = new GregorianCalendar(anos,mes-1,dia);
        altaContrato = dateGreG.getTime();
        Id=IdSiguiente;
        IdSiguiente++;
    }
    
    public double establece_bonus(double gratificacion){
        
        return Trabajadores.bonus_base+gratificacion;
    }
    
    public int compareTo(Object miobje){
        
        Empleado castingEmple=(Empleado) miobje;
        
        if(this.sueldo<castingEmple.sueldo){
            return -1;
        }
        
        if(this.sueldo>castingEmple.sueldo){
            return 1;
        }
        return 0;
    }
    
    public String dameIdSiguiente(){
        return "El proximo Id sera: "+IdSiguiente;
    }
    
    public Empleado(String nom){
        this(nom,15000,2019,01,23);
    }
    
    public String DameNombre(){ //Getter
        return nombre+" Id: "+Id;
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
    private static int IdSiguiente ;
    private int Id;
}


 class Jefatura extends Empleado implements Jefes{
    
    private double incentivo;
    
    public String TomarDecisiones(String decision){
        
        return "Un mienmbro de la direccion ha tomado una decision de: "+decision;
    }
    
    public double establece_bonus(double gratificacion){
        
        double prima=2000;
        
        return Trabajadores.bonus_base+prima+gratificacion;
    }
    
    public void estableceIncentivo(double b){
        incentivo=b;
    }
    
    @Override
    public double DameSueldo(){
        double sueldoJefe = super.DameSueldo();
        return sueldoJefe+incentivo;
    }
    
    public Jefatura(String nom, double sue, int anos, int mes, int dia){
        super(nom, sue, anos, mes, dia);
    }
    
    
}
