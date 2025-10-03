/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author Sara Delgado Velad
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1=0.5F; /*Recordatorio: Que aparezca un símbolo de adveretencia no quiere decir que
        *esté mal, solo avisa que la variable aún no está en uso.*/
        long numero2=1788234199; /*El número era más largo que el máximo de long, además long no permite
        *letras ni decimales, solo números enteros.*/
        float resultado;
        resultado=numero1*numero2;
        System.out.println("El resultado de multiplicar "+ numero1 + " y "+ numero2 + "es igual a "+ resultado);
        /*El error es que entre la variable y el texto siempre tiene que haber un "+", tanto antes como después
        *de la variable (si hay texto).*/
        
    }
    
}
