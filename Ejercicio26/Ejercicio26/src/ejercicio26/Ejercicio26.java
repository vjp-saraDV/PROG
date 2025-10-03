/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int x;
        int y;
        int z;
        int w;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduzca un numero de 4 cifras.");
        numero=entrada.nextInt();
        x=numero/1000;//Como int no acepta decimales, se puede obtener la "x" fácilmente.
        y=(numero-(x*1000))/100;//Como todavía faltan cifras por calcular repito la misma operación anterior pero restando la "x" y dividiéndolo entre 100.
        z=(numero-(x*1000)-(y*100))/10;//Igual que el anterior, pero le resto "x" e "y" y divido entre 10.
        w=numero-(x*1000)-(y*100)-(z*10);//Como ya tengo el resto de variables calculadas, puedo usarlas para calcular la última.
        
        System.out.println("La primera cifra es " + x);
        System.out.println("La segunda cifra es " + y);
        System.out.println("La tercera cifra es " + z);
        System.out.println("La cuarta cifra es " + w);
    }
    
}
