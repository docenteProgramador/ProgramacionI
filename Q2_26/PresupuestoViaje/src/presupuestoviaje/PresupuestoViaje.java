/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presupuestoviaje;
import java.util.Scanner;

/**
 * @author oscar
 * 
 * 1. Estructura de Secuencia
 * 2. Estructuras de Seleccion
 * 3. Estructuras de Repeticion
 * 
 * Objetivo
 *  Comprender la secuencia de los algoritmos.
 * 
 * El orden/posicion de las instrucciones se ejeucta de manera
 * secuencial.
 * 
 *  Estructura de Seleccion
 * 1. Etapa de Ingreso de Datos
 * 2. Etapa de Procesamiento de Datos
 * 3. Etapa de Muestra de Resultados/Informacion
 */
public class PresupuestoViaje {

    /**
     * Imagina que trabajas para una agencia de viajes llamada 
     * Aventura Express. Tu jefe te ha pedido crear un programa 
     * sencillo que ayude a los clientes a tener un presupuesto 
     * rápido de su próximo viaje. 
     * 
     * El programa debe recoger datos básicos, realizar algunos 
     * cálculos matemáticos simples y mostrar el resultado de 
     * forma organizada y elegante en la consola.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pais = "Honduras";

        //1ra Tarea: Mensaje de Bienvenida
        System.out.println("--------------------------------------------------");
        System.out.println("Hola\tEstas frente la aplicacion \tAventura Express");
        System.out.println("--------------------------------------------------");

        //2da Tarea:Captura del Destino
        System.out.print("\nDime el destino de viaje: ");
        pais = input.next();
        
        //3ra Tarea: Duración del Viaje
    }//Fin de Main
    
}//Fin de Class
