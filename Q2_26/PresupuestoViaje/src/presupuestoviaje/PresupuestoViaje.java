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
        int dias = 0;
        double costoVuelo = 0.0;
        double presupuestoDiario = 0;
        double costoEstancia = 0;
        double subTotal = 0;
        double impuestoReservacion = 0.0;
        double totalFinal = 0.0;
        
        //1ra Tarea: Mensaje de Bienvenida
        System.out.println("--------------------------------------------------");
        System.out.println("Hola\tEstas frente la aplicacion \tAventura Express");
        System.out.println("--------------------------------------------------");

        //2da Tarea:Captura del Destino
        System.out.print("\nDime el destino de viaje: ");
        pais = input.next();
        
        //3ra Tarea: Duración del Viaje
        System.out.printf("Cuanto tiempo estaras en %s: ",pais);
        dias = input.nextInt();
        
        //4ta Tarea: Captura de Costo del Vuelio
        System.out.printf("Cuanto quieres pagar por el vuelo a %s: ",pais);
        costoVuelo = input.nextDouble();
        
        //5ta Tarea: Calculo de Costo
        /*Cálculo de Estancia Calcula el costo total de la 
        * estancia multiplicando los días por el gasto diario. 
        * Guarda el resultado en una nueva variable decimal 
        * llamada costoEstancia.
        */
        System.out.println("Cuanto de viatico diario tienes?");
        presupuestoDiario = input.nextDouble();
        
        costoEstancia = presupuestoDiario * dias;
        
        //Tarea 6: Subtotal del Viaje
        //Calcula la suma del costoEstancia y el precio del vuelo.
        subTotal = costoEstancia + costoVuelo;
        
        //Tarea 8: Calculo de la Reservacion
        impuestoReservacion = subTotal * 0.05;
        
        //Tarea 9: Calculo Final
        totalFinal = subTotal + impuestoReservacion;
        
        //Tarea 10: Voucher/Impresion de Resultados
        System.out.println("\n");
        System.out.println("Resumen de Boleto de Compra");
        System.out.println("---------------------------");
        System.out.printf("%-20s %-8s %10s %n",       "Destino:",pais, "Origen: Honduras");
        System.out.printf("%-20s %-8d %10s %n",       "Dias de Viaje: ",dias,"VACA");
        System.out.printf("%-20s %-8.2f %n",     "Costo de Estancia: ",costoEstancia);
        System.out.printf("%-20s %-8.2f",        "Costo de Vuelo: ",costoVuelo);
        System.out.println("\n------------------------------");
        System.out.printf("%-20s %-8.2f",     "TOTAL A PAGAR: ",totalFinal);
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//Fin de Main
    
}//Fin de Class
