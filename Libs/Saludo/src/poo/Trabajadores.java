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
public interface Trabajadores {
    
    public abstract double establece_bonus(double gratificacion);
    
    double bonus_base =1500; // es public static y final
}
