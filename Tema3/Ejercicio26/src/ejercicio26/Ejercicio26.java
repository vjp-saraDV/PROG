/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseña un programa en JAVA que te diga la suma total de los números
        *impares existentes entre el 111 y el 222.*/
        
        int i, suma;//Declaro las variables i y suma.
        i=111;
        suma=0;//Suma tiene 0 como valor inicial.
        
        
        for (i=111; i<222; i++){
            if (i%2!=0) {
                suma=i+suma;//Suma va guardando la suma de cada i.
                
            }
        }
        
        
        System.out.println("La suma de los números impares entre el 17 y el 139 son: " + suma);
    }
    
}
