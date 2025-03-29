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
public class Ejercicio6 {

    /**
     * Crear un arreglo bidimendioanl cuadrado y formar la figura x en la matriz
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         short tamaño=Short.parseShort
                (JOptionPane.showInputDialog("dame el tamaño d ela matriz"));
        int[][] matriz=new int[tamaño][tamaño];
         for ( int i=0;i<tamaño;i++){
             for (int j=0;j<tamaño;j++){
                 if (i==j||i+j==tamaño-1) matriz[i][j]=0;

                 else matriz[i][j]=i+j;
                 
             }
             
         }
         for(int i=0;i<tamaño;i++){
             for (int j=0; j<tamaño;j++){
                 System.out.print(matriz [i][j]+ "");
             }
    
             System.out.println("");
}        
    }
    
}
