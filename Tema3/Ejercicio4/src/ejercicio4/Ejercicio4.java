/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un algoritmo en JAVA que pida tres
        *números e imprima por pantalla el menor de ellos.*/
        
        int n1, n2, n3;
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero:");
        n1=entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero:");
        n2=entrada.nextInt();
        
        System.out.println("Por último, introduzca un tercer numero:");
        n3=entrada.nextInt();
        
        
        if (n1<n2 && n1<n3) {
            System.out.println("El número menor de los introducidos es el " + n1);
            //Condición: n1 es el menor de todos.
        }
        
        if (n2<n1 && n2<n3) {
            System.out.println("El número menor de los introducidos es el " + n2);
            //Condición: n2 es el menor de todos.
        }
        
        if (n3<n1 && n3<n2) {
            System.out.println("El número menor de los introducidos es el " + n3);
            //Condición: n3 es el menor de todos.
        }
    }
    
}
