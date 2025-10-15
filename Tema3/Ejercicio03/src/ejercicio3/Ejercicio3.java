/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseña un programa en JAVA que lea tres números e
        *imprima por pantalla el mayor de ellos*/
        
        int n1, n2, n3, esMayor;
        esMayor=0; //Tiene que tener valor para iniciar la variable.
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero:");
        n1=entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero:");
        n2=entrada.nextInt();
        
        System.out.println("Por último, introduzca un tercer numero:");
        n3=entrada.nextInt();
        
        
        if (n1>n2 && n1>n3) {
            esMayor=n1;
        }
        
        if (n2>n1 && n2>n3) {
            esMayor=n2;
        }
        
        if (n3>n1 && n3>n2) {
            esMayor=n3;
            System.out.println("El número mayor de los introducidos es el " + n3);
        }
        
        System.out.println("El número mayor de los introducidos es el " + esMayor);
    }
    
}
