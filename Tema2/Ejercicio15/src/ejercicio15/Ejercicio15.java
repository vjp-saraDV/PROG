/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Sara Delgado Velad
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo=10000;
        int horas;
        int minutos;
        int segundos;
        horas=tiempo/3600;
        int resto=tiempo%3600;
        minutos=(resto/60);//Necesito calcular los minutos a través del resto de las horas.
        segundos=(resto%60);//Necesito calcular los segundos a través del resto de los minutos.
        System.out.println("10000 segundos hacen un total de " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
