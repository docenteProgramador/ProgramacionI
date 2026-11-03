/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacion;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Validacion {

    /**
     * 
        Ciclos de Repeticion
        1. While   -> Ciclo "Infinito" y Finito     
        2. Do...while  -> Ciclo "Infinito" y Finito     
        3. For     -> Finito
    
        Elementos de un Ciclo
        1. Valor Inicial ->Punto de Partida
        2. Condicion 
            Se ejecuta mientras se mantenga TRUE/VERDADERO
            Se detiene el ciclo cuando se vuelve FALSE/FALSO la condicion
        3. Modificador  ->La alteracion de la Valor Inicial para que la condicion
                          sea falso
    */
     
    public static void main(String[] args) {
        /*
        int contadorWHILE = 10;
        int contadorDOWHILE = 10;
        
        System.out.println("Visualizacion de Ciclo WHILE");
        while(contadorWHILE<3){
            System.out.printf("# Ciclo: %d\n",contadorWHILE);
            contadorWHILE++;
        }//Fin de While
        
        System.out.println("\n-------------------------\n");
        
        System.out.println("Visualizacion de Ciclo DO WHILE");
        
        do{
            System.out.printf("# Ciclo: %d\n",contadorDOWHILE);
            contadorDOWHILE++;
        }while(contadorDOWHILE<3);//Fin de Ciclo Do While
        */
        /*
            Desarrollar un ejercicio que permita contabilizar
            las horas de vuelo que tiene un piloto para poder
            acreditarse en el manejo del Boeing 747. 
            
            Este tiene 8 oportunidades para poder acumular los 200 horas requeridas.
            Cada vuelo, tiene un máximo de 20 horas de duración.
        
            Mostrar el algoritmo que muestre el numero de horas que se han ido
            acumulando a lo largo de cada intento.
        */
        Scanner sc = new Scanner(System.in);
        int horaVuelo =0;//Se registra la cantidad de horas que se hizo en el vuelo.
        int totalHorasAcum = 0;//Total de Horas que se acumulan
        int numeroIntento = 0;//Contabilizacion de intentos de vuelo.
        final int MAX_HORAS = 20;//Numero horas maximo por vuelo
        final int MAX_INTENTOS = 8;//Numero maximo de intentos x certificacion
        final String NOMBRE = "JOHN DOE";
        final double PI = 3.1416;
        
        
        System.out.println("------------------------------------------------------");
        System.out.println("Bienvenido al Programa de Certificacion");
        System.out.println("de vuelos del BOEING 747 de la Clase de Programacion");
        System.out.println("-----------------------------------------------------");
        
        while(numeroIntento< MAX_INTENTOS){
            System.out.println("\nBitacora de Registro de Horas de Vuelo");
            System.out.printf("Vuelo #%d \n",numeroIntento+1);
            System.out.print("Horas en el Aire:");
            horaVuelo = sc.nextInt();
            
            do{
                
                if(horaVuelo>MAX_HORAS || horaVuelo<=0){
                    System.out.println("No se permite esa cantidad de horas");
                    System.out.println("El numero minimo de horas es: 1");
                    System.out.printf("El numero maximo de horas es: %d\n",MAX_HORAS);
                    System.out.println("Ingrese nuevamente las horas");
                    System.out.print("Horas de Vuelo: ");
                    horaVuelo = sc.nextInt();
                }
                
            }while(horaVuelo>MAX_HORAS || horaVuelo<=0);
            totalHorasAcum += horaVuelo;
            
            numeroIntento++;
        }//Fin de Ciclo While
        
        System.out.println("\n-----------------");
        System.out.printf("Total de Horas acumuladas de vuelo: %d",totalHorasAcum);
        
        if(totalHorasAcum>100){
            System.out.println("Se puede certificar...ha cumplido los requisitos");
        }
        
        
    }//Fin Main
    
}//Fin Class
