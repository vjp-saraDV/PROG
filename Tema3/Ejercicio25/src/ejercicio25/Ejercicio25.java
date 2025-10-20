/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*/*Escribe un programa en JAVA que te diga la suma total de los números
        *pares existentes entre el número 17 y el número 139.*/
        
        
        int i, suma;//Declaro las variables enteras i y suma.
        i=17;
        suma=0;//Suma tiene 0 como valor inicial.
        
        
        for (i=17; i<139; i++){
            if (i%2==0) {
                suma=i+suma;//Suma va guardando la suma de cada i.
                
            }
        }
        
        
         System.out.println("La suma de los números pares entre el 17 y el 139 son: " + suma);
    }
    
}
