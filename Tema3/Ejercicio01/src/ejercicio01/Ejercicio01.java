/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa en JAVA en el que el usuario introduzca un número y el programa responda si es negativo o positivo*/
        int numero;//Declaro la variable número.
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca un número.");
        numero=entrada.nextInt();
        
        if (numero<0){ //El resultado es negativo.
            System.out.println("El número introducido es negativo.");
        }
        else if(numero==0){ //El resultado es 0.
            System.out.println("El número introducido es neutro.");
        }
        else if (numero>0){ //El resultado es positivo.
            System.out.println("El número introducido es positivo.");
        }
    }
    
}
