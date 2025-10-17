/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un algoritmo en JAVA que, utilizando un bucle do…while, imprima
        *los números pares que existen entre el número 11 y el número 133.*/
        
        int i=11; //Declaro la variable itineración "i".
        
        
        System.out.println("Los números pares existentes entre el número 11"
                + "y el 133 son: "); /*Si se pone antes del bucle solo
                *sale el mensaje 1 vez).*/
        
        
        do{
           i++;
           if (i%2==0){
           System.out.print(i + "-");
           }
        }
           while(i<=133);
           { //Si es par, el resto de i/2 siempre será 0.
        }
    }
    
}
