/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ELISABETH
 */
public class guia3ejericio8 {

    /**
     * 8.	Generar un arreglo unidimensional de 15 posiciones que se llene con valores 
     * aleatorios y contar la cantidad de positivos, negativos y ceros del arreglo.


     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] matriz=new int [15];
        
        int positivos = 0;
        int negativos= 0;
       int  ceros= 0;
       int numero =0;
               // llenar el arreglo con valores aleartorios 
    
        for (int i=0;i<15;i++ ){
            matriz[i]= numero;
            numero +=1;
                    
      if(matriz[i]> 0){
          positivos++;
          
      }
      else if (matriz[i]<0){
          negativos++;
          
      }
      else{
          ceros++;
      }
          
      }
        
    
        
        //MOSTRAR ARREGLO
        
        System.out.println(" arreglo de numeros");
        for (int num:matriz){
            System.out.print(num +"");
    }
        System.out.println("cantidad positivos"+positivos);
        System.out.println("cantidad de negativos"+negativos);
        System.out.println("cantidad ceros"+ceros);
    }
    
}
