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
        //int seleccionMenu = 0;//
        int totalDinero = 0;
        double ISV = 0.0;
        double costoPlato =0;
        int propina = 0;
        int costoViaje = 0;
        double totalPago = 0;
        
                
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
        seleccionMenu = input.nextLine().toUpperCase().charAt(0);
        //seleccionMenu = input.nextInt();
        
        System.out.print("Cuanto dinero andas para comprar? ");
        totalDinero = input.nextInt();
        System.out.println("\n");
        //Char o int
        //Las opciones del switch
        switch(seleccionMenu){
        
            case 'A':
            case 'a':
                System.out.println("Excelente Eleccion");
                System.out.println("Comida del Mar abunda aqui!!");
                costoPlato = 450;
                costoViaje = 50;
                
                break;
                
            case 'B':
                System.out.println("Hamburguesas son la especialidad");
                System.out.println("de la Casa");
                costoPlato = 320;
                costoViaje = 30;
                
                break;
                
            case 'C':
                System.out.println("Comida por Excelencia para");
                System.out.println("Calmar el Hambre--- Pollo!!!");
                costoPlato = 130;
                costoViaje = 15;
                break;
                
            case 'D':
                System.out.println("Comida Tipica del Buen Hondurenio");
                System.out.println("Baleadas");
                costoPlato = 80;
                costoViaje = 0;
                break;
                
            case 'E':
                System.out.println("Ohhh...andas fino hoy!!");
                System.out.println("Claro que tenemos Sushi!!");
                costoPlato = 600;
                costoViaje = 300;
                break;
                
            default:
                System.out.println("Mijo...lea, esa opcion no existe!!!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
        }//Fin del Switch
        
        ISV = (costoPlato + costoViaje) *0.15;
        System.out.print("Cuanto daras de propina ($$$$): ");
        propina = input.nextInt();
        totalPago = costoPlato + costoViaje + propina + ISV;
        System.out.printf("Total a Pagar: %.2f",totalPago);

    }//Fin de Main
    
}//Fin de Class
