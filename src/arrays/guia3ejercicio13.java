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
public class guia3ejercicio13 {

    /**
     * 13.	Generar la siguiente matriz:

00
* 10 11
* 20 21 22
* 30 31 32 33    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        //pedir tamaño
        System.out.println(" ingrese el numero de filas");
        int filas =scanner.nextInt();
        
        // generar matriz
        
        for( int i=0;i<filas;i++){
            int valor=(i+1)*10;
            
            for(int j=0;j<=i;j++){
                System.out.print(valor+j+"");
            }
            System.out.println("");
        }
        
        
    }
    
}
