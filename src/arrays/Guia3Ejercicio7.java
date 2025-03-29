/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * 7.	Realizar una matriz 5x5, inicializarla en 1 y luego imprimir en la diagonal trasversa el número 0.
 */
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[][] matriz=new int [5][5];
         for ( int i=0;i<5;i++){
             for (int j=0;j<5;j++){
                if (i+j==4) matriz[i][j]=0;
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
