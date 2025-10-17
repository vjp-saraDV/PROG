/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que genere un número aleatorio (utiliza
        *Math.random() ) entre 1 y 100, que lo muestre por pantalla e indique
        *si es par o impar.*/
        
        
        double numeroAleatorio;
        numeroAleatorio=(Math.random())*100+1;
        numeroAleatorio=Math.floor(numeroAleatorio);
        int numero=(int) numeroAleatorio;
        
        
        if (numero%2==0) {
            System.out.println("El número entre 1 y 100: " + numero + " es par.");
        }
        else {
            System.out.println("El número entre 1 y 100: " + numero + " es impar.");
        }
        
    }
    
}
