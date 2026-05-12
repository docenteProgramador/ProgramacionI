/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *  1. Estructuras de Secuencia
 *      Declaracion de Variables
 *      Orden de Instrucciones
 *      Salida y Lectura de Datos
 *  2. Estructuras de Seleccion
 *      Simple, Doble, Multiple, Anidado
 * 
 * 3. Estructuras de Repeticion (Finito o "Infinito")
 *      a. While (Contador, Centinela)
 *      b. Do While (Contador, Centinela)
 *      d. For (Contador)
 * 
 * Partes de una Estructura de Repeticion
 * 1. Valor Inicial
 * 2. Condicion a Evaluar
 * 3. Modificador de los valores inciales
 * 4. Instrucciones que se repiten
 */
public class Temperatura {

    /**
     * Desarrollar un algoritmo en la que me permita hacer la conversion
     * de temperatura ingresada en grados farenheit para saber su valor
     * en grados Celsius. 
     * 
     * De esta manera se puede llevar un control general de las temperaturas
     * registradas a lo largo de la semana y obtener
     * el promedio general de temperatura.
     * 
     * Tareas:
     * 1. Capturar temperatura Farenheit
     * 2. Convertir temperatura Farenheit a Celsius
     * 3. Comprobar o mostrar resultado
     * 4. Registrar 7 temperaturas
     * 5. Calcular el promedio
     * 6. Mostrar el promedio general
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double tempFaren = 0;
        double tempCels = 0;
        
        
        
        
        
        int dia = 1;//Valor Inicial
        //Condicion
        while(dia <= 7){
            //Instrucciones que se repiten
            System.out.println("Dia: "+dia);
            
            System.out.println("Calculadora de Conversiones");
            System.out.print("Dime la lectura del termometro Farenheit: ");
            tempFaren = input.nextDouble();
        
            //(32 °F − 32) × 5/9 = 0 °C
            tempCels = (5.0/9.0) * (tempFaren - 32);
        
            System.out.println("Valores de Temperatura");
            System.out.printf("Temp Farenheit %.2f",tempFaren);
            System.out.printf("\nTemp Celsius %.2f",tempCels);
            
            //Modificador
            dia++; //Sumando de uno en uno -> dia = dia + 1
            
        }//Fin de While
        
        
        
    }//Fin de Main
    
}//Fin de Class
