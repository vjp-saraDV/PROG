/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa en JAVA en donde el usuario introduzca la nota de un alumno (número entero entre 0 y 10)
        *y se escriba su calificación según el valor de la nota ingresada:*/
        int nota;//Declaro la variable nota.
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota del alumno. Debe ser un número entero entre o igual que 0 y 10.");
        nota=entrada.nextInt();
        
        if (nota>=0 && 4>=nota){ //La operación es tipo boolean por eso hay que usar &&, AND.
            System.out.println("La nota es: suspenso.");
        }
        else if (nota>=5 && 6>=nota){ //La operación es tipo boolean por eso hay que usar &&, AND.
            System.out.println("La nota es: bien.");
        }
        else if (nota>=7 && 8>=nota){ //La operación es tipo boolean por eso hay que usar &&, AND.
            System.out.println("La nota es: notable.");
        }
        else if (nota>=9 && 10>=nota){ //La operación es tipo boolean por eso hay que usar &&, AND.
            System.out.println("La nota es: sobresaliente.");
        }
    }
    
}
