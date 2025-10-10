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
        
        int diasemana;//Declaro la variable entera diasemana.
        boolean laborable=false;//Hay que darle un valor inicial aunque cambie luego, si no la variable está vacía.
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un día de la semana (1-7):");
        diasemana=entrada.nextInt();
        
        
        //El switch no puede cambiar.
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
        }
        
        
        //El valor de laborable se ha vuelto a calcular en switch.
        if (laborable==true) {
            System.out.println("El día " + diasemana + " es laborable.");
        }
        
        else {
            System.out.println("El día " + diasemana + " no es laborable.");
        }
    }
    
}
