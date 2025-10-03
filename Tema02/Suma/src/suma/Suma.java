/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;

/**
 *
 * @author Sara Delgado Velad
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1=30; //Si sale una señal de advertencia solo es para avisarme que hay una variable declarada que aún no está en uso
        int numero2;
        int resultado;
        numero2=60; /*La variable numero2 solo puede tener el valor de "true" o "false" por ser de tipo boolean.
*Ese era el error, pero como se quiere usar el numero2 para operar una suma, hay que cambiar de boolean a int.
        resultado=numero1+numero2.*/
        resultado=numero1+numero2;
        System.out.println("El resultado de la suma es: "+ resultado);
        
    }
    
}
