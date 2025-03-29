/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author ELISABETH
 */
public class guia3ejercicio3 {

    /**
     * @param args the command line arguments
     */
    //3.	Realizar un programa que genere una matriz 4x4, inicializarla en 0 e imprimirla
    
    public static void main(String[] args) {
        // TODO code application logic here
         int[][] matriz=new int [4][4];
        for (int i=0; i<4;i++){ //para las filas
            for (int j=0;j<4;j++){ // para las columnas
                matriz[i][j]=0;
                
            }
        }
        System.out.println("matriz 4x4 inicilizada en 0");
        for (int i=0;i<4;i++){    // i para las filas
            for (int j=0;j<4;j++){   //j para las columnas
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }
    }
    
}
