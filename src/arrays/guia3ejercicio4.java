/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ELISABETH
 */
public class guia3ejercicio4 {

    /**
     * 4.	Realizar un programa que genere una matriz 5x5, inicializarla }
     * la diagonal principal en 0, el resto de posiciones deben ser *. Imprimir la matriz.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int[][] matriz=new int [5][5];
         for ( int i=0;i<5;i++){
             for (int j=0;j<5;j++){
                 if (i==j) matriz[i][j]=0;
                 else matriz[i][j]=i+j;
                 
             }
             
         }
         for(int i=0;i<5;i++){
             for (int j=0; j<5;j++){
                 System.out.print(matriz [i][j]+ "");
             }
    
             System.out.println("");
}        
    }
    
}
