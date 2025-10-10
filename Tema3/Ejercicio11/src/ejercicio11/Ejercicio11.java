/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa en JAVA que, utilizando bucles, muestre por pantalla
        *el mensaje "Hola" seis veces acompañado por un numero que se incrementa
        *cada vez.*/
        
        int i=1; //Declaro la variable iteración "i".
        
        
        do {
            System.out.println("Hola" + i++); //Va a mostrar en pantalla Holai++.
        }
        
        
        while (i>0 && i<7); //Solo mostrará el mensaje mientras "i" esté entre 0 y 7.
    }
    
}
