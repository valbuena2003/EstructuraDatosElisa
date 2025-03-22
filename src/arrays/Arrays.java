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
public class Arrays {

    /**
     * arreglo de 5 poiciones que va ordenar las variables ascendentemente
     *
     * @param args
     */
    public static void main(String[] args) 
        
        {
        // TODO code application logic here
        int arr[]= new int [5];
        Scanner leer=new Scanner(System.in);
        for(int i=0; i<arr.length;i++)
        {
        
           System.out.println("introduza un numero:");
            arr[i]=leer.nextInt();
        }
        
        System.out.println("los numeros en orden ascendente:");
        int  mayor=4;
        while(mayor >=0)
        {
     System.out.println("|"+arr[mayor]+"|\n");
      mayor--;
        }
        }
}

   
    
        
    
        