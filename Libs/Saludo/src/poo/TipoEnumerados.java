/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.*;
/**
 *
 * @author Luis-Asus
 */
public class TipoEnumerados {
    
    enum Talla {
        PEQUEÑO("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        private Talla(String abreviacion){
            this.abreviacion=abreviacion;
        }
        
        public String dameAbreviatura(){
            return abreviacion;
        }
        private String abreviacion;
    }
    
    
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_data = entrada.next().toUpperCase();
        
        Talla la_talla=Enum.valueOf(Talla.class, entrada_data);
        System.out.println("Talla="+la_talla);
        System.out.println("Abreviatura="+la_talla.dameAbreviatura());
    }
    
}
