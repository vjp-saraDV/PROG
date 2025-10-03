/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int segundos1;//Declaro la variable segundos1, cuyo valor debe ser introducido por el usuario.
        int dias;
        int horas;
        int minutos;
        int segundos2;
        int aux;//Declaro la variable aux para guardar los segundos restantes de los días.
        int resto1;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Por favor, introduzca un número de segundos:");
       segundos1=entrada.nextInt();
       dias=(segundos1/3600)/24;
       aux=segundos1-(dias*3600*24);//Necesito la variable auxiliar para calcular las horas, minutos y segundos.
       horas=(aux/3600);
       resto1=aux%3600;//Uso "resto1" para que las operaciones sean más cortas.
       minutos=resto1/60;
       segundos2=resto1%60;
       
        System.out.println(segundos1 + " segundos hacen un total de: " + dias + " dias, " + horas + "horas, " + minutos + " minutos y " + segundos2 + " segundos.");
    }
    
}
