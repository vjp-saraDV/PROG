/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un algoritmo en JAVA que, utilizando un bucle while, imprima los
        *números impares que existen entre el número 11 y el número 133.*/
        int i, j; //Declaro la variable itineración "i" y "j".
        j=0; /*Declaro la variable "j", la cual voy a usar para contar la
        *cantidad de números impares entre 11 y 133.*/
        
        
        System.out.println("Los números impares existentes entre el número 11"
                + "y el 133: "); /*Si se pone antes del bucle solo
                *sale el mensaje 1 vez).*/
        
        
        for (i=11; i<133; i++) {
            if (i%2==0){ //Si es par, el resto de i/2 siempre será 0.
                j++; /*Cada vez que "i" sea impar, se inrementará la variable
                *"j".*/
                System.out.print(i + "-");
            }
        }
        
        
        System.out.println("\n La cantidad de números pares impresos han sido: " + j);
    }
    
}
