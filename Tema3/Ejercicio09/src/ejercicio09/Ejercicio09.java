/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa en JAVA en el que el usuario introduzca cuatro
        *números enteros y luego el programa los muestre por pantalla ordenados de forma creciente.(de menor a mayor)
        *• Muestra por pantalla el resultado de la siguiente forma:
        *Por favor, introduzca el primer numero: 8
        *Ahora, introduzca un segundo numero: 5
        *Introduzca el tercer numero: 9
        *Por último, introduzca un cuarto numero: 1
        *El orden de los números introducidos es el 1 - 5 - 8 - 9.*/
        
        
        int n1, n2, n3, n4, aux;//Declaro las variables n1, n2, n3, y aux.
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número");
        n1=entrada.nextInt();
        System.out.println("Introduce un segundo número");
        n2=entrada.nextInt();
        System.out.println("Introduce un tercer número");
        n3=entrada.nextInt();
        System.out.println("Introduce un cuarto número");
        n4=entrada.nextInt();
        
        
        if (n1>n2){//Si n1 es mayor, n2 tiene que ir antes.
            aux=n1;
            n1=n2;
            n2=aux;
        }
        if (n1>n3) {//Si n1 es mayor, n3 tiene que ir antes.
            aux=n1;
            n1=n3;
            n3=aux;
        }
        if (n1>n4) {//Si n1 es mayor, n4 tiene que ir antes.
            aux=n1;
            n1=n4;
            n4=aux;
        }
        if (n2>n3) {//Si n2 es mayor, n3 tiene que ir antes.
            aux=n2;
            n2=n3;
            n3=aux;
        }
        if (n2>n4) {//Si n2 es mayor, n4 tiene que ir antes.
            aux=n2;
            n2=n4;
            n4=aux;
        }
        if (n3>n4) {//Si n3 es mayor, n4 tiene que ir antes.
            aux=n3;
            n3=n4;
            n4=aux;
        }
        
        
        System.out.println("El orden de los números introducidos es: " + n1 + ", " + n2 + ", " + n3 + " y " + n4);
    }
    
}
