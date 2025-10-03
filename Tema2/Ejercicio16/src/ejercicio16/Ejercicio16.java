/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero=130;
        int billeteCincuenta=dinero/50;
        int billeteDiez=((dinero%50)/10);//Se necesita el resto de la operación de billeteCincuenta.
        System.out.println(dinero + " euros hacen un total de: " +  billeteCincuenta + " billetes de 50 euros y " + billeteDiez + " billetes de 10 euros.");
    }
    
}
