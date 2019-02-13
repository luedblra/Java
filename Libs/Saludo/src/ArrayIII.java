/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis-dev
 */
public class ArrayIII {
    public static void main(String[] args) {

        int matriz[][] = new int [2][2];
        
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        int res;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                res = 0;
                res = matriz[i][j] * matriz[i][j];
                System.out.println("valor "+matriz[i][j]+" * "+matriz[i][j]+" = " +res);
            }
        }
        
        
    }
}
