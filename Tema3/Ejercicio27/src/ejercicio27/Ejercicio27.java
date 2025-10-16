/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseña un programa en JAVA que pida al usuario dos números por
        *teclado. Posteriormente el programa mostrará un menú que le permitirá
        *al usuario:
        *1.- Sumar los números.
        *2.- Restar los números.
        *3.- Multiplicar los números.
        *4.- Dividir los números.
        *5.- Salir del programa.
        *Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú
        *volverá a aparecer pidiendo nuevamente que le introduzcas una opción.
        *Nota 2: Controla el caso de división entre 0 mediante la captura
        *de excepciones.*/
        int a,b,menu,c;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, indique un número.");
        a=entrada.nextInt();
        
        System.out.println("Por favor, indique otro número.");
        b=entrada.nextInt();
        
        
        System.out.println("Introduzca 1 para sumar los dos números introducidos.");
        System.out.println("Introduzca 2 para restar los dos números introducidos.");
        System.out.println("Introduzca 3 para multiplicar los dos números introducidos.");
        System.out.println("Introduzca 4 para dividir los dos números introducidos.");
        System.out.println("Introduzca 5 para salir del programa.");
        try{
            menu=entrada.nextInt;
        }
        menu=entrada.nextInt;
        if
    }
    
}
