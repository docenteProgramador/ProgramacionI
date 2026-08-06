/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metereologia;

import java.util.Scanner;

/**
 *
 * Objetivo
 * 1. Conocer las diferentes tipos de ciclo repeticion
 * 2. Analizar los componentes de todo ciclo de repeticion.
 * 3. Construir un algoritmo con un ciclo de repeticion
 */
public class Metereologia {

    /**
     * Desarrollar un algoritmo que me permita simular una estacion
     * metereologica, que va registrando las temperaturas a lo largo de una semana:
     * 1. Registrar el dia en general
     * 2. Registrar en dos jornadas (dia y noche)
     * 
     * Mostrando el promedio general y un mensaje de caliente o frio para
     * cada jornada.
     */
    
    /*
        Ciclos de Repeticion
    1. While
    2. Do while
    3. For
    4. Foreach
    
    Componentes de los Ciclos de Repeticion
    1. Valor de Inicio                      -> Variable de Control
    2. Condicion                            -> Establece el limite
    3. Modifique el estado de la condicion  -> Incrementa/Decrementa el valor inicio
    
    El ciclo de repeticion se ejecuta y repite siempre y cuando
    la condicion se mantenga VERDADERO!!!!
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int temperatura = 0;
        
        int dia = 1;//Variable de Control Iniciando en 0
        int tempAcum = 0; //Acumulador
        double promedioTemp = 0;
        
        //Condicion
        while( dia <= 7){
        //Instrucciones que se repiten
            System.out.print("Ingrese la Temperatura: ");
            temperatura = sc.nextInt();
            
            tempAcum += temperatura; //tempAcum = tempAcum + temperatura
            System.out.printf("Dia %d: \tTemperatura: %d\t TempAcumulado %d",
                            dia,
                            temperatura,
                            tempAcum);
            
            
            
            System.out.println("");
            
            
            //Modificacion
            //Opcion #1
            //dia +=1; //dia = dia + 1;
            
            //Opcion #2
            dia++;//Aumento de 1 en 1 ->POST Incremento
        }//Fin de While
        
        //promedioTemp = tempAcum / 7; //Hardcoding
        dia--;//Resta una unidad
        System.out.printf("Dia Final: %d", dia);
        promedioTemp = tempAcum / dia;
        
        System.out.printf("Promedio: %.2f",promedioTemp);
        
        
        

     
        
        
    }//Fin de Main
    
}//Fin de Class
