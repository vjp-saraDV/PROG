/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3, b=6, c;
        c=a/b;
        System.out.println("El valor de c es " + c);
        c=a%b;
        System.out.println("El valor de c es " + c);
        a++;
        System.out.println("El valor de a es " + a);
        ++a;
        System.out.println("El valor de a es " + a);//No sé por qué sale 5.
        c= ++a + b++;
        System.out.println("El valor de a es " + a);//No sé por qué sale 6.
        System.out.println("El valor de b es " + b);//No sé por qué sale 7.
        System.out.println("El valor de c es " + c);
        c= ++a + ++b;
        System.out.println("El valor de a es " + a);
        System.out.println("El valor de b es " + b);
        System.out.println("El valor de c es " + c);
    }
    
}
