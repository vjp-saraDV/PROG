/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Implementa un algoritmo en JAVA que le pida
        *al usuario un número por teclado. Posteriormente, el
        *programa le dirá al usuario si el número introducido es par
        *o impar*/
       
        int numero;
        int par=0;
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero:");
        numero=entrada.nextInt();
        
        
        if (numero%2==par) { //No se asigna un valor, se calcula, por eso 2 "=".
            System.out.println("El número es par.");
        }
        
       
        if (numero%2!=par) {
            System.out.println("El número es impar.");
        }
    }
    
}
