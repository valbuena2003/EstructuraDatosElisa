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
public class Ejercicicio4 {

    // crear un arreglo unidimensional entero de tamaño n y se debe llenra con numeros impares
  
    public static void main(String[] args) {
        // TODO cod{e application logic here

       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array");
        int cantidad= leer.nextInt();
        int[] impares=new int[cantidad];
        int numero =1;
        for (int i=0;i<cantidad;i++ ){
            impares[i]=numero;
            numero+=2;
        }
        
        //MOSTRAR ARREGLO
        
        System.out.println(" arreglo de numeros impares");
        for (int num:impares){
            System.out.print(num +"");
        }
    }
        }
       
