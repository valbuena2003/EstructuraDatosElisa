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
public class Ejercicio5 {

    /**
     * //crearun arreglo unidimensional de tamaño 100 y llenarlo con los numero impares apartir del numero 17
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array");
        int tamaño= leer.nextInt();
        int[] pares=new int[100];
        int numero  =17;
        for (int i=0;i<tamaño;i++ ){
            pares[i] = numero;
            numero+=2;
        }
    
        
        //MOSTRAR ARREGLO
        
        System.out.println(" arreglo de numeros pares");
        for (int num:pares){
            System.out.print(num +"");
    }
    }
    
}
