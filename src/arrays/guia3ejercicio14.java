/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ELISABETH
 */
public class guia3ejercicio14 {

    /**
     * 14.	Diseñar un programa que permita generar una matriz de NxN y 
     * se llene dinámica se imprima por pantalla la matriz.  
     * El usuario debe indicar las dimensiones. Las dimensiones no deben ser 0 o menor a cero.
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         short tamaño=Short.parseShort
                (JOptionPane.showInputDialog("dame el tamaño d ela matriz"));
        
        
        if (tamaño<=0){
            JOptionPane.showInputDialog("ERROR EN EL TAMAÑO");
            return;
            
                    
        }
        
          int[][] matriz=new int[tamaño][tamaño];
          Random random=new Random();
          // LLENAR CON VALORES ALEATORIOS
          
         for ( int i=0;i<tamaño;i++){
             for (int j=0;j<tamaño;j++){
                 matriz[i][j]=random.nextInt(9)+10;
            
                 
             }
         }
             
         System.out.println("matriz generada");
         for(int i=0;i<=tamaño;i++){
            for(int j=0;j< tamaño;j++){
       
                 System.out.print(matriz [i][j]+ "");
             }
    
             System.out.println("");
    }
    
    }
}
