/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa que imprima los números impares que existen entre los
        *números 20 y el 160. Además, al final, nos dirá cuantos impares ha
        *imprimido en total por pantalla.*/
        
        int i, j; //Declaro la variable itineración "i".
        j=0; /*Declaro la variable "j", la cual voy a usar para contar la
        *cantidad de números impares entre 20 y 160.*/
        
        
        System.out.println("Los números impares existentes entre el número 20"
                + "y el 160 son: "); /*Si se pone antes del bucle solo
                *sale el mensaje 1 vez).*/
        
        
        for (i=20; i<160; i++) {
            if (i%2!=0){ //Si es impar, el resto de i/2 nunca será 0.
                j++; /*Cada vez que "i" sea impar, se inrementará la variable
                *"j".*/
                
                /*Cambio: System.out.println("Los números impares existentes
                *entre el número 20 y el 160 son: " + i);*/
                
                System.out.print(i + "-");
            }
        }
        
        
        System.out.println("\n La cantidad de números impares impresos han sido: " + j);
    }
    
}
