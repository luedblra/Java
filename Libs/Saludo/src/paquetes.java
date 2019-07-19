
import java.util.*;

public class paquetes {
    public static void main(String[] args) {
        
        Scanner dato =new Scanner(System.in);
        
        System.out.println("Introduce Edad");
        int edad = dato.nextInt();
        
        if(edad >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");
        
    }
}
