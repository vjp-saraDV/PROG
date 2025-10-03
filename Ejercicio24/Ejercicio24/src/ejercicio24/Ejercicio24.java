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
        float prog;
        float lmsgi;
        float bd;
        float ed;
        float si;
        float ingles;
        float ipe;
        float media;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Por favor, introduzca la nota de Programacion: ");
        prog=entrada.nextFloat();
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        lmsgi=entrada.nextFloat();
        System.out.println("Introduzca la nota de Bases de Datos: ");
        bd=entrada.nextFloat();
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        ed=entrada.nextFloat();
        System.out.println("Introduzca la nota de Sistemas Informaticos: ");
        si=entrada.nextFloat();
        System.out.println("Introduzca la nota de Ingles Profesional: ");
        ingles=entrada.nextFloat();
        System.out.println("Por ultimo, introduzca la nota de Itinerario Personal para la Empleabilidad: ");
        ipe=entrada.nextFloat();
        media=(prog+lmsgi+bd+ed+si+ingles+ipe)/7;
        System.out.println("Su nota media del curso es de: " + media);
    }
    
}
