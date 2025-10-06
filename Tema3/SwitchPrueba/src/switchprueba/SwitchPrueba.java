/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchprueba;

/**
 *
 * @author alumno
 */
public class SwitchPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=1;
        
        switch (num) {
            case 1:
                System.out.println("Es un 1.");
            case 2:
                System.out.println("Es un 2.");
                break;//Sigue ejecutando hasta el break.
            case 3:
                System.out.println("Es un 3.");
                break;
               default:
                   System.out.println("Es default.");
                   break;
        }
    }
    
}
