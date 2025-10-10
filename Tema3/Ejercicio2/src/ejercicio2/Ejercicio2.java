/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realiza un programa en el que le solicites al usuario 2 números y, si el primer número
        *introducido es mayor que 10, se multipliquen, y en caso contrario que se sumen. Muestra
        al usuario la operación realizada y el resultado.*/
        
        int n1, n2; //Declaro las variables para el numero 1 y 2.
        int suma, producto; //Declaro las variables para los resultados de la suma y el producto.
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero:");
        n1=entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero:");
        n2=entrada.nextInt();
        
        
        if (n1>=10) {
            //Añado el igual para que no quede el 10 sin respuesta.
            producto=n1*n2;
            System.out.println("La operación que se realizó es el producto de " + n1 + " y " + n2 + " y el resultado es " + producto);
        }
        
        else {
            suma=n1+n2;
            System.out.println("La operación que se realizó es la suma de " + n1 + " y " + n2 + " y el resultado es " + suma);
        }
    }
    
}
