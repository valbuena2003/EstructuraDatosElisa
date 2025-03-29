/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ELISABETH
 */
public class Ejercicio7 {

    /**
     * crear un arreglo bidimensional y llenar con caracteres el tamaño de la matriz es dado por el usuario
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       short tamaño=Short.parseShort
                (JOptionPane.showInputDialog("dame el tamaño d ela matriz"));
        char [][] matriz=new char[tamaño][tamaño];
        char caracter ='$';
   
         for ( int i=0;i<tamaño;i++){
             for (int j=0;j<tamaño;j++){
                matriz [i][j] = caracter;
                 
                 
             }
             
         }
         for(int i=0;i<tamaño;i++){
             for (int j=0; j<tamaño;j++){
                 System.out.print(matriz [i][j]+ "");
             }
    
             System.out.println("");
}        
        }
}
    

