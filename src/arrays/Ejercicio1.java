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
public class Ejercicio1 {

    /**
     *crear un arreglo con N cantidad de notas sacar el promedio
     */
    public static void main(String[] args) {
        // pedir al usuario la cantidad de notas
        
        float suma=0;
        float nota=0;
        float promedio=0;
        short cantNotas = Short.parseShort
                (JOptionPane.showInputDialog("cantidad de notas"));
        //declaracion de una rreglo unidimensional
        float notas []=new float[cantNotas];
        //3. recorrer el arreglo y hacer la operación
        for (int i=0;i<cantNotas;i++){
        //llenar el arreglo de notas -colocar condicion para que el arreglo de notas sea 0-5
        nota = Float.parseFloat
                (JOptionPane.showInputDialog("dame la nota"));
        notas [i]=nota;
        }
        //recorrer el arreglo para sumar los valores
        for(float n:notas){
            suma +=n;
        }
        //sacar promedio
        
        promedio=suma/cantNotas;
        System.out.println("el promedio de notas es:"+ promedio);
        JOptionPane.showInputDialog(null," el promedio de notas" + promedio);
        
                
    
    }
    
}
