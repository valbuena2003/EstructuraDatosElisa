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
public class guia3ejercicio1 {

    /**
     * Escribe un programa que lea un numero e imprime un triangulo de numeros de la forma siguiente, si el numero leido es 4 imprimira
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero= leer.nextInt();
   
        for (int i = 1; i <= numero;i++ ){ //controla numero d efilas
            for (int s = 1; s <= numero -i;s++ ){  //controla los numeros por fila
                System.out.print("");// imprime numero d efila
        }
             for (int j=1; j<=i;j++){
                 System.out.print(i+"");
             }
        
        //MOSTRAR ARREGLO
        
       
            System.out.println("");
    }
    }
    
}
