/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promediotemperatura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class PromedioTemperatura {

    /**
     * Crear un algoritmo que permita sacar el promedio de temperaturas
     * que se da a lo largo de la semana.
     * Si cada valor cae por debajo de los 21°C y arriba de los 16°C diremos
     * que esta frio.
     * Sin embargo abajo de 16 °C se dirá muy helado y 
     * por arriba de los 21°C y abajo de los 25°C
     * está fresco.
     */
    
    /*
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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double temp = 0;
        double acumuladorTEMP=0;
        double promedioTEMP = 0;
        int numDia = 0;//Contar la cantidad de temperaturas ingresadas
        
        
        while(numDia<7){
            System.out.printf("Dime la temperatura del dia %d: ",numDia+1);
            temp = sc.nextDouble();
            
            if(temp>25){
                System.out.println("Caliente");
            }else if(temp>=21 && temp<=25){
                System.out.println("Fresco");
            }
            else if(temp >=16 && temp<21){
                System.out.println("Frio");
            }else{
                System.out.println("Muy Frio  - Helado");
            }
            //System.out.printf("ANTES Acumulador es: %.2f\n",acumuladorTEMP);
            acumuladorTEMP += temp;//acumuladorTEMP = acumuladorTEMP + temp
            //System.out.printf("DESPUES Acumulador es: %.2f\n",acumuladorTEMP);
            System.out.println("---------------------------------------------");
            numDia++;//Sumatoria de Uno en Uno
        }//Fin de While
        promedioTEMP = acumuladorTEMP / 7;
        System.out.printf("Promedio de la Semana es: %.2f",promedioTEMP);
        
        
    
    
    }//Fin de Main
    
}//Fin de Class
