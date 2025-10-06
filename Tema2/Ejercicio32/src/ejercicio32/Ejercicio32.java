/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**Necesito importar el paquete util, y en concreto la herramienta Scanner para poder introducir un valor.
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero;
        int billete50;
        int billete20;
        int billete10;
        int billete5;
        int moneda2;
        int moneda1;
        int resto1;//Declaro la variable resto1 para facilitar el cálculo de billete20.
        int resto2;//Declaro la variable resto1 para facilitar el cálculo de billete10.
        int resto3;//Declaro la variable resto1 para facilitar el cálculo de billete5.
        int resto4;//Declaro la variable resto1 para facilitar el cálculo de moneda2.
        int resto5;//Declaro la variable resto1 para facilitar el cálculo de moneda1.
        
        Scanner entrada=new Scanner (System.in);//Primero hay que indicar que quiero añadir un valor.
        System.out.println("Por favor, indique una cantidad de dinero:");//Después tengo que indicar cual es la variable a la que daré el valor.
        dinero=entrada.nextInt();//Por último, esto da la opción de dar el valor al programa.
        billete50=dinero/50;
        resto1=dinero%50;
        billete20=resto1/20;
        resto2=resto1%20;
        billete10=resto2/10;
        resto3=resto2&10;
        billete5=resto3/5;
        resto4=resto3%5;
        moneda2=resto4/2;
        resto5=resto4&2;
        moneda1=resto5/1;
        System.out.println(dinero + " euros se descomponen en: " + billete50 + " billetes de cincuenta, " + billete20 + " billetes de 20, " + billete10 + " billetes de 10, " + billete5 + "billetes de 5, " + moneda2 +" monedas de 2 y " + moneda1 + " monedas de 1.");
    }
    
}
