/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio04 {

    public static final int CONSTANTE=2; //Declaro la constante como variable int de valor 2.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Asignatura: Sistemas informaticos."); //La asignatura es Sistemas informáticos.
        float nota1=5.56F; //Declaro la nota del primer examen como variable float de valor 5,56.
        System.out.println("La nota del primer examen es 5,56.");
        float nota2=8.75F; //Declaro la nota del segundo examen como variable float de valor 8,75.
        System.out.println("La nota del segundo examen es 8,75.");
        float resultado1;
        float resultado2;
        
        //Nota media
        resultado1 = nota1 + nota2;
        resultado2 = resultado1/CONSTANTE;
        System.out.println("La nota media de la asignatura es: " + resultado2);
        
    }
    
}
