/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * 9.	Generar una matriz 4x4 y llenarla de ceros la trasversa principal colocar 1.


 */
public class guia3ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[][] matriz=new int [4][4];
         for ( int i=0;i<4;i++){
             for (int j=0;j<4;j++){
                 if (i==j) matriz[i][j]=1;
                 else matriz[i][j]=0;
                 
             }
             
         }
         for(int i=0;i<4;i++){
             for (int j=0; j<4;j++){
                 System.out.print(matriz [i][j]+ "");
             }
    
             System.out.println("");
}        
    }
    
}
