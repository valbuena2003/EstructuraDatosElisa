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
public class guia3ejercicio16 {

    /**
     * 16.	Generar una matriz NxN, llenar aleatoriamente con números
     * solo que sean pares y determinar el número mayor de la matriz y el menor.


     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []numeros =new int[20];
          int  pares=0;
                 
        Random Rand = new Random();
        
        // llanr el arrglo con valores aleatorios
        for( int i=0;i< numeros.length;i++){
        numeros[i] = Rand.nextInt(100)+1;
        }
        
        // mostrar arreglo
        System.out.print("arrehlo genrado");
        for( int num:numeros){
            System.out.println(num+"");
            
        }
        System.out.println("");
             
        // contar pares e impares
        
        for(int num:numeros){
            if (num%2==0){
                pares++;
            
            }
        
     

    }
        System.out.print(""+pares);
    }        
    
    }
    

