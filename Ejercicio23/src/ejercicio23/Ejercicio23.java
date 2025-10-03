/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precio;//El precio solo tiene 2 decimales.
        int cantidad;
        float total;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio=entrada.nextFloat();
        System.out.println("¿Cuantas unidades quiere llevarse?: ");//No sale la primera interrogación, pero la dejo porque si no queda raro.
        cantidad=entrada.nextInt();
        total=precio*cantidad;
        System.out.println("El precio total de su compra es de: " + total + " euros.");
    }
    
}
