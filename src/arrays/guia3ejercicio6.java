/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author ELISABETH
 */
public class guia3ejercicio6 {

    /**
     * 6.	Realizar un programa en java que genere una matriz 5x6 y se rellene dinámicamente con los números impares partiendo desde 1 y se imprima
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas=5;
        int columnas=6;
    int[][] matriz=new int [filas][columnas];
     int numero =1;
      
        for (int i=0;i<filas;i++ ){
          for (int j=0;j<columnas;j++ ){
              matriz[i][j]=numero;
            numero+=2;
        }
      }
        
        //MOSTRAR ARREGLO
        
        System.out.println(" arreglo de numeros impares");
        for (int i= 0;i<filas;i++){
          for (int j=0;j<columnas;j++ ){
            System.out.print (matriz[i] [j]+"");
            
    }
            System.out.println("");
        }
        }
    }

        
