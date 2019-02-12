/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis-dev
 */

import javax.swing.*;
public class ArrayII {
    public static void main(String[] args) {
        
        int i; 
        
        i = Integer.parseInt(JOptionPane.showInputDialog("cantidad de campos"));
        
        String lugar[]=new String[i];
        
        for(int j=0;j<i;j++){
            lugar[j] = JOptionPane.showInputDialog("Lugar?");
        }
        
        for(String nombre:lugar){
            System.out.println("Lugar: "+nombre);
        }
        
        
    }
}
