/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que le pida una contraseña al usuario. Si la
        *escribe bien le dará la enhorabuena, pero si la escribe mal 3 veces le
        *dará un mensaje de error de acceso.*/
        String contrasenia, contraseniaRepetida;
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca una contraseña.");
        contrasenia=entrada.nextLine();
        
        
        do{
            System.out.println("Repite la contraseña.");
            contraseniaRepetida=entrada.nextLine();
        }
        while(contraseniaRepetida!=contrasenia);
    }
    
}
