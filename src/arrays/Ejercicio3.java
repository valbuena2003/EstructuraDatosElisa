/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author ELISABETH
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bidimencional
        // declaracion de reglas 
        int[][] matriz=new int [5][5];
        for (int i=0; i<5;i++){ //para las filas
            for (int j=0;j<5;j++){ // para las columnas
                matriz[i][j]=i+1;
                
            }
        }
        for (int i=0;i<5;i++){    // i para las filas
            for (int j=0;j<5;j++){   //j para las columnas
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }
    }
    
}
