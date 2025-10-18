/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa en JAVA que que imprima todos los números múltiplos
        *de 3 que existen entre el número 1 y otro número introducido por el
        *usuario.
        *• Controla que el usuario te meta un número mayor que 0 y, sino,
        *avísale del error y vuélveselo al pedir las veces que hagan falta.
        *• Por último infórmale al usuario del total de números mostrados.*/
        
        
        int numeroUsuario, i, suma=0;//Declaro las variables.
        
        
        System.out.println("Introduzca un número mayor que 0.");
        Scanner entrada=new Scanner(System.in);
        numeroUsuario=entrada.nextInt();//El usuario introduce un número.
        
        
        do {
            System.out.println("El número introducido no es válido.");
            numeroUsuario = entrada.nextInt();
            System.out.println("Vuelva a introducir un número mayor que 0.");
        }
        
        
        while (numeroUsuario<1);
        
        
        System.out.println("Los numeros múltiplos de 3 entre " + 1 + " y " +
                numeroUsuario + " son: ");
        
        
        for (i = 1; i<numeroUsuario; i++) {
            if (i%3==0) {
                System.out.print(+i + "-");
                suma=i/3;//Da el número de múltiplos que hay.
            }
        }
        System.out.println("");
        System.out.println("El total de los múltiplos de 3 es: " + suma);
    }
    
}
