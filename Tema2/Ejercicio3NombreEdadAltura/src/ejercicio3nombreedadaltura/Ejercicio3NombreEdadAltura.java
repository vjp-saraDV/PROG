/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3nombreedadaltura;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio3NombreEdadAltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte edad=22; //byte es el tipo de dato entero más eficiente en este caso.
        float altura=1.65F; //float es el tipo de dato decimal más eficiente en este caso.
        System.out.println("Sara Delgado Velad.");
        System.out.println(edad + " anos."); //No se puede usar la ñ, por eso pone anos.
        System.out.println(altura + "cm."); //He añadido la unidad de medida.
    }
    
}
