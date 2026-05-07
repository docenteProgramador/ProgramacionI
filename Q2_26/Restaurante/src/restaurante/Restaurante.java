/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.Scanner;

/**
 *  1. Estructuras de Secuencia
 *  2. Estructuras de Seleccion
 *      a. Simples  ->if
 *      b. Dobles   ->if/else
 *      c. Multiples -> switch
 *      d. Anidadas
 * 3. Estructura de Repeticion
 */
public class Restaurante {

    /**
     * Desarrollar un algoritmo en la que se pueda
     * atraves de una aplicacion WEB/DESKTOP/MOBIL encargar
     * comida. 
     * Se tiene cierta cantidad de dinero en la billetera electronica,
     * determinar el valor del ISV, Propina, Viaje y Total a pagar.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char seleccionMenu = '@';//' -> alt + 39
        
        System.out.println("SEAN BIENVENIDOS AL DELIVERY");
        System.out.println("        DE PROGRA I         ");
        System.out.println("----------------------------");
        
        System.out.println("Nuestro Menu es el siguiente");
        
        System.out.println("A. Mariscos");
        System.out.println("B. Hamburguesas");
        System.out.println("C. Pollo");
        System.out.println("D. Baleadas");
        System.out.println("E. Sushi");
        System.out.print("Dime tu Seleccion: ");
        //El # dentro del parentisis
        //indica la posicion a leer de la palabra/frase capturada.
        seleccionMenu = input.nextLine().charAt(0);
        
    }//Fin de Main
    
}//Fin de Class
