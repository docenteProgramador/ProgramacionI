/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Monitoreo {

    /**
     * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
     */
    /*
        1. Comprender el Problema
            a. ¿Que datos de entrada necesito?
            b. Transformaciones / Calculos Necesarios
            c. ¿Que resultados requiero? Que se va a mostrar?
    
        2. Diseñar una Posible Solucion
            a. Diagrama de Flujo
            b. Pseudocodigo
        
        3. Traducir de Manera Incremental el Desarrollo
            a. Listar las Tareas 
                i. Declaracion de Variables
                ii. Tomas de Decision
                iii. Ciclos de Repeticion
                iv. Formulas
            b. Probando que Funcione
            c. Validaciones
        
        4. Pruebas de Escritorio
            a. Casos
            b. Escenarios
            c. Patrones
    
        5. Quality Assurance (Testeo)
    */
    
    /*
        Entrada
    1. Captura de cuantas Lecturas/Mediciones (SCANNER)
        a. Validar que se capturo
        
    2. Registrar de Temperatura (RANDOM)
        a. Validar que se registro
        b. Se requieren varias temperaturas (WHILE)
    
    3. Captura de nombre del operador (SCANNER)
        a. Validar que se capturo
    
        Transformaciones/Calculos
    1. Validacion de Lecturas > 0 y <=50 (DO...WHILE)
    2. Convertir Celsius a Farenheit -> F = (C * 9/5) + 32
    3. Limite de Sobrecalentamiento (SELECCION DOBLE...if/else)
    4. Calcular el Resumen Estadistico 
    
        Salida
    1. Promedio, Temp Max y Temp Min, Moda
    2. Mostrar alerta
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        // Declaracion de Variables
        int lecturas = 0;
        int temp = 0;
        int tempF = 0;
        int numMedicion = 0;
        String operador = "John Doe";
        
        System.out.print("Nombre del Operador: ");
        operador = input.next().toUpperCase();
        //System.out.printf("Validacion: %s",operador);
        System.out.println("");
        
        //System.out.printf("Validacion: %d",lecturas);
        do{
            System.out.print("Numero de Lecturas:");
            lecturas = input.nextInt();
            //if(lecturas<0 || lecturas >50){
            if(!(lecturas>0 && lecturas <=50)){
                System.out.println("Valor NO Valido");
                System.out.println("Tiene que estar entre 0 y 50");
            }
        //}while(lecturas<0 || lecturas >50);
        }while(!(lecturas>0 && lecturas <=50));
        
        System.out.println("");
        while(numMedicion<lecturas){
            temp = rd.nextInt(1000, 3000);
            System.out.printf("Num Med: %d \tTemp C: %d\n",numMedicion+1, temp);
            
            tempF = (temp * 9/5)+32;
            System.out.printf("Temp en Farenheit: %d\n",tempF);
            numMedicion++;
        }//Fin de While
        
    }//Fin de Main
    
}//Fin de Class
