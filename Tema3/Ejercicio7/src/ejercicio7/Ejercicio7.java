/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realiza un programa en JAVA en el que tenga cabida, sin modificar,
        *el siguiente trozo de código:*/
        
        int diasemana;
        boolean laborable;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un día de la semana (1-7):");
        diasemana=entrada.nextInt();
        
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable=true;
                break;
            case 6:
            case 7:
                laborable=false;
                break;
        System.out.println("El día " + diasemana + " es laborable.");
        }
    }
    
}
