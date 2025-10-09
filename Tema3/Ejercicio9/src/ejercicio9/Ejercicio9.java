/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa en JAVA en el que el usuario introduzca cuatro números enteros y luego el programa los muestre
        *por pantalla ordenados de forma creciente.(de menor a mayor)*/
        int n1, n2, n3, n4;//Declaro las variables número 1, 2, 3 y 4.
        int aux;//Declaro la variable auxiliar. Solo se necesita una porque una vez que se asigne un valor a otra variable se puede reutilizar la auxiliar.

        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, indique un número.");
        n1=entrada.nextInt();
        
        System.out.println("Por favor, indique otro número.");
        n2=entrada.nextInt();
        
        System.out.println("Por favor, indique otro número.");
        n3=entrada.nextInt();
        
        System.out.println("Por favor, indique otro número.");
        n4=entrada.nextInt();
        
        
        if (n1>n2) {
            aux=n1;
            n1=n2;
            n2=aux;
        }
        if (n1>n3) {
            aux=n1;
            n1=n3;
            n3=aux;
        }
        if (n1>n4) {
            aux=n1;
            n1=n4;
            n4=aux;
        }
        
        
        if (n2>n3) {
            aux=n2;
            n2=n3;
            n3=aux;
        }
        if (n2>n4) {
            aux=n2;
            n2=n4;
            n4=aux;
        }
        

        if (n3>n4) {
            aux=n3;
            n3=n4;
            n4=aux;
        }
        /*Solo se necesita comparar n1 con n2, n3 y n4; n2 con n3 y n4; y n3 con n4.
        *Esto es porque n2 se ha comparado con n1 en el primer apartado, n3 con n2 en el segundo y n4 con n3 en el tercero, etc.*/
        
    System.out.println("El orden de los números es " + n1 + ", " + n2 + ", " + n3 + " y " + n4);
    }
    
}
