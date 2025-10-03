/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero1;
      int numero2;
      int numero3;
      int suma;
      int producto;
      
       Scanner entrada=new Scanner (System.in);
       System.out.println("Por favor, introduzca el primer numero (3 cifras): ");//Aclaro, por si acaso, el número de cifras.
       numero1=entrada.nextInt();
       System.out.println("Por favor, introduzca el segundo numero (3 cifras): ");//Aclaro, por si acaso, el número de cifras.
       numero2=entrada.nextInt();
       System.out.println("Por favor, introduzca el tercer numero (3 cifras): ");//Aclaro, por si acaso, el número de cifras.
       numero3=entrada.nextInt();
       
       suma=numero1+numero2+numero3;
       System.out.println("La suma de los numeros introducidos es: " + suma);
       producto=numero1*numero2*numero3;//No hace falta usar paréntesis porque el orden no altera el producto.
       System.out.println("El producto de los numeros introducidos es: " + producto);
    }
    
}
