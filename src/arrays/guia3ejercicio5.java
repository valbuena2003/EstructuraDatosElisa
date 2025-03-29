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
public class guia3ejercicio5 {

    /**
     * 5.	Realizar un programa en java que genere un arreglo de 15 posiciones y se rellene de forma dinámica 
     * (no deben ser asignados los valores sino utilizar un bucle para llenar el arreglo) 
     * con los números empezando desde 1, luego imprimir
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int[][] matriz=new int [15][15];
        int[] pares=new int[15];
        int numero  =1;
        for (int i=0;i<15;i++ ){
            pares[i] = numero;
            numero+=1;
        }
    
        
        //MOSTRAR ARREGLO
        
        System.out.print(" arreglo de numeros ");
        for (int num:pares){
            System.out.print(num +"");
    }
    }
    
}
