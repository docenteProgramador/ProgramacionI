/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodeclase;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class EstadodeClase {

    /**
     * 1. Conocer las estructura de seleccion 
     *      a. Toma de Decision Simple
     *      b. Toma de Decision Doble
     *      c. Decisiones numericos y caracteres/cadenas
     */
    
    /*
        Se necesita desarrollar un algoritmo que determine si un bote
    de agua de 500 mL 
        a. esta arriba de la mitad. (Dato Numerico)
        b. contiene agua o no       (Dato de Caracter)
        c. Es amigable con el ambiente (Dato de Cadena)
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Conociendo la Estructura
        /*
            1. Palabra Clave "if" y/o "else"
            2. El grupo de instrucciones se encierra entre { }
            3. No se usa ";" para los bloques.
            4. La condicion es una comparacion bajo cualquiera de los siguientes 
                elementos:
                a. <       menor
                b. >        mayor
                c. <=       menor o igual
                D. >=       MAYOR O IGUAL
                e. ==       igual (uso de 2 signos iguales)
                i. !=       Distinto (signos pegados)
        */
        int cantidadAgua = 0;
        
        System.out.println("El bote es de 500 mL");
        System.out.print("Cuanto liquido dices que contiene? ");
        cantidadAgua = input.nextInt();
        
        if(cantidadAgua >= 250){
            //Condicion es VERDADERO
            System.out.println("Si, tiene mas de mitad");
            System.out.println("Te lo puedes beber!!!");
            System.out.println("No nos quedamos sin nada..hay suficiente");
        }
    }//Fin de Main
    
}//Fin de Class
