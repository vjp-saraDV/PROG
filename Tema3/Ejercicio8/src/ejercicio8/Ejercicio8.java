/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realiza un programa que dado un importe en euros nos indique número óptimo de billetes de
        *50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y de 1 euro. En caso de que
        *NO haya billetes/monedas de algún tipo NO se mostrarán.*/
        
        int dinero, billete50, billete20, billete10, billete5, moneda2, moneda1;//Declaro las variables anteriores.
        int aux1, aux2, aux3, aux4, aux5;//Declaro las variables auxiliares previas.
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, indique una cantidad de dinero (número entero):");
        dinero=entrada.nextInt();
        
        
        billete50=dinero/50;
        aux1=dinero%50;//Almaceno la operación en aux1 para no alargar las operaciones.
        billete20=aux1/20;
        aux2=aux1%20;
        billete10=aux2/10;
        aux3=aux2%10;
        billete5=aux3/5;
        aux4=aux3%5;
        moneda2=aux4/2;
        aux5=aux4%2;
        moneda1=aux5/1;
        
        
        System.out.println(dinero + "Euros se descomponen en: ");
        if (billete50!=0) {
            System.out.println("Billetes de 50: " + billete50);  
        }
        if (billete20!=0) {
            System.out.println("Billetes de 20: " + billete20);  
        }
        if (billete10!=0) {
            System.out.println("Billetes de 10: " + billete10);   
        }
        if (billete5!=0) {
            System.out.println("Billetes de 5: " + billete5);  
        }
        if (moneda2!=0) {
            System.out.println("Monedas de 2: " + moneda2);
        }
        if (moneda1!=0) {
            System.out.println("Monedas de 1: " + moneda1);
        }
    }
    
}
