/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;

/**
 *
 * @author ELISABETH
 */
public class guia3ejercicio11 {

    /**
     * 11.	Se requiere generar una matriz 4x6 y rellenarla con las edades de 24 estudiante, adicional calcular el 
     * promedio de edades; se debe imprimir la matriz con las edades y el promedio de edades
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int filas=4;
        int columnas=6;
    int[][] edades=new int [filas][columnas];
        Random Random = new Random();
        int sumaEdades=0;
        int totalEstudiantes= filas*columnas;
        
                
 // llenar matrix 
      
        for (int i=0;i<filas;i++ ){
          for (int j=0;j<columnas;j++ ){
              edades[i][j]=Random.nextInt(9)+10;
            sumaEdades+=edades[i][j];
        }
      }
        
        double promedio = (double) sumaEdades / totalEstudiantes;
        //MOSTRAR ARREGLO
        
        System.out.println(" edades de los estudiantes ");
        for (int i= 0;i<filas;i++){
          for (int j=0;j<columnas;j++ ){
            System.out.print (edades[i] [j]+"");
            
    }
            System.out.println("");
            
        }
        System.out.println("prmedio edades:"+promedio);
    }
    
}
