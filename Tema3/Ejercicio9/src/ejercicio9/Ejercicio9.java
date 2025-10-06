/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;
/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa en JAVA en el que el usuario introduzca cuatro números enteros y luego el programa los muestre
        *por pantalla ordenados de forma creciente.(de menor a mayor)*/
        int n1, n2, n3, n4;//Declaro las variables número 1, 2, 3 y 4.
        int aux1, aux2, aux3;//Declaro las variables auxiliares 1, 2 ,3 y 4.

        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, indique un número.");
        n1=entrada.nextInt();
        System.out.println("Por favor, indique otro número.");
        n2=entrada.nextInt();
        System.out.println("Por favor, indique otro número.");
        n3=entrada.nextInt();
        System.out.println("Por favor, indique otro número.");
        n4=entrada.nextInt();
        
        if (n1<n2){
            n1=n1;
        }
        else if(n1>n2){
            aux1=n1;
            n1=n2;
        }
        else if(n1>n3){
            aux1=n1;
            n1=n3;
        }
        else if(n1>n4){
                aux1=n1;
                n1=n4;
        }
                
        
       if(n2<n1){
           aux2=n2;
           n2=n1;
        }
       else if(n2>n1){
           n2=n2;
       }
       else if(n2>n3){
           aux2=n2;
           n2=n3;
        }
       else if(n2>n4){
           aux2=n2;
           n2=n4;
        }
       
       if(n3<n2){
           aux3=n3;
           n3=n3;
        }
       else if(n3>n2){
           n3=n3;
       }
       else if(n3>n4){
           aux2=n3;
           n3=n4;
        }
       else if(n3>n1){
           aux3=n3;
           n3=n1;
       }
       
       if(n4<n3){
           aux4=n4;
           n3=n3;
        }
       else if(n4>n3){
           n3=n3;
       }
       else if(n4>n1){
           aux2=n3;
           n3=n4;
        }
       else if(n4>n2){
           aux3=n3;
           n3=n1;
        }
    }
    
}
