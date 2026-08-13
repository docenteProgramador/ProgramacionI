/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * Objetivos
 * 1. Utilizar la estructura de repeticion del ciclo FOR
 * 2. Emplear las CONSTANTES en programacion
 */
public class CicloFOR {

    /**
     * Desarrollar un algoritmo que permita calcular
     * el porcentaje de votantes (varones y mujeres)
     * que hay en una cabina. Indicar quienes fueron los
     * que mas votaron.
     * Tareas:
     * Calcular el porcentaje de varones y mujeres votantes
     * Mostrar un grafico/histograma de las votaciones
     * Mostrar resultado final de quien voto mas (varones o mujeres)
     */
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            1. Variable de Control -> Valor Inicial
            2. Condicion -> Limite
            3. Modificador de la V.C. -> Incremento/Decremento
        */
        System.out.println("Ciclo For 1");
        for( int i = 0 ; i < 10 ; i++ ){
            System.out.printf("Ciclo %d\n",i);
        }//Fin de Ciclo FOR
        
        System.out.println("Ciclo For 2");
        for (int i = 2; i < 10; i +=2) {
            // i = i + 5 ; -> i += 5
            // i = i * 3 ; -> i *=3
            // i = i - 4 ; -> i -=4
            // i = i - 1 ; ->  i--
            System.out.printf("Ciclo %d\n",i);
        }//Fin de Ciclo FOR
        
        Scanner input   =new Scanner (System.in);
        
        //int numeroVotantes = 10;
        final int NUMEROVOTANTES = 10;
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = '1';
        double porcentaje =0;
        
        
        for (int i = 0; i < NUMEROVOTANTES; i++) {
            System.out.println("Genero de Votante");
            System.out.print("V: Varon / M: Mujer\n");
            System.out.printf("Seleccion #%d: ",i+1);
            seleccion = input.next().toUpperCase().charAt(0);
            
            switch (seleccion) {
                case  'V':
                        System.out.println("Varon entrando");
                        System.out.println("a la cabina");
                        numVarones++;
                    break;
                    
                case 'M':
                        System.out.println("Mujer entrando");
                        System.out.println("a la cabina");
                        numMujeres++;
                    break;
                default:
                    System.out.println("Error de Ingreso");
            }//Fin de Seleccion Mujer/Varon usando Switch
        }//Fin de Ciclo FOR
        
        porcentaje = (double)numVarones / NUMEROVOTANTES;//CASTING
        System.out.printf("Varones: %.2f %% \n",porcentaje*100);
        
        porcentaje = (double)numMujeres / NUMEROVOTANTES;
        System.out.printf("Mujeres: %.2f %% \n",porcentaje*100);
       

    }//Fin de Main
    
}//Fin de Class
