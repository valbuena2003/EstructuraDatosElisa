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
public class guia3ejercicio10 {

    /**
     * 10.	Generar un arreglo de 20 posiciones llenar dinámicamente y contar la cantidad de números pares e impares.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int []numeros =new int[20];
          int  pares=0;
                 int impares=0;
        Random Random = new Random();
        
        // llanr el arrglo con valores aleatorios
        for( int i=0;i< numeros.length;i++){
        numeros[i] = Random.nextInt(100)+1;
        }
        
        // mostrar arreglo
        System.out.println("arrehlo genrado");
        for( int num:numeros){
            System.out.println(num+"");
            
        }
        System.out.println("");
             
        // contar pares e impares
        
        for(int num:numeros){
            if (num%2==0){
                pares++;
            }
            else{
                impares++;
            }
        }
        //mostrar resultados
        System.out.println("cantida numeros pares"+pares);
        System.out.println("cantidad de numeros impares"+ impares);
    }
}
    

