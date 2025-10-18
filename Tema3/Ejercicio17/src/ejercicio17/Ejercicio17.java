/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa que calcule la raíz cuadrada del número que
        *introduzca el usuario.(Utiliza el método Math.sqrt() ).
        *Si el usuario introduce un número negativo, debemos mostrarle un
        *mensaje de error y volver a pedírselo (tantas veces como sea
        *necesario).*/
        int numero;
        double raiz;
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca un número.");
        numero=entrada.nextInt();
        
        
        do {
            System.out.println("El número introducido no es válido.");
            //No se puede hacer la raíz cuadrada de un número negativo.
            System.out.println("Por favor, introduzca un número.");
            numero=entrada.nextInt();
        }
        while(numero<0);/*Solo mostrará el mensaje mientras la variable sea
        *sea negativa.*/
        
        
        raiz=Math.sqrt(numero);
        //Comando para calcular la raíz cuadrada.
        
        
        System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
    }
    
}
