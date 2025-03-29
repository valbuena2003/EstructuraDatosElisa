/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ELISABETH
 */
public class guia3ejercicio15 {

    /**
     * 15.	Leer dos matrices de dimensiones NxN y realizar la suma de las dos matrices, imprimir las 2 matrices y la resultante
     */
    public static void main(String[] args) {
        // Solicitar el tamaño de la matriz
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz (N > 0):"));

        // Validar que el tamaño sea mayor que 0
        if (tamaño <= 0) {
            JOptionPane.showMessageDialog(null, "❌ Error: El tamaño debe ser mayor que 0.");
            return; // Salir del programa
        }

        // Declarar matrices
        int[][] matriz1 = new int[tamaño][tamaño];
        int[][] matriz2 = new int[tamaño][tamaño];
        int[][] sumaMatriz = new int[tamaño][tamaño];

        Random rand = new Random(); // Para llenar con valores aleatorios

        // Llenar las matrices con valores aleatorios entre 1 y 9
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz1[i][j] = rand.nextInt(9) + 1;
                matriz2[i][j] = rand.nextInt(9) + 1;
                sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimir matrices
        System.out.println("\n🔹 Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("\n🔹 Matriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("\n🔹 Suma de las matrices:");
        imprimirMatriz(sumaMatriz);
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}        
        
    
   
