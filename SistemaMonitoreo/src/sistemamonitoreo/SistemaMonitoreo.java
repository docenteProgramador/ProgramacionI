/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

/**
 *
 *   
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
        1. Comprender el Problema que se esta abordando
            a. Que datos de Entrada necesito?
            b. Transformacion / Calculos Necesarios
            c. Que resultados se presentan?

        2. Visualizacion/Diseño de la Solucion
            a. Diagrama Flujo
            b. Pseudocodigo

        3. Programacion Incremental
            a. Listando las Tareas a Cumplir
                i. Declaracion de Variables
                ii. Estructuras de Seleccion
                iii. Ciclos de Repeticion
                iv. Validaciones de Datos
            b. Validacion

        4. Prueba de Escritorio
            a. Casos
            b. Escenarios
            c. Resultados/Patrones Definidos
    
    */

public class SistemaMonitoreo {

    /**
     * Comprension Problema
     * 1. Entradas: 
     *      Nombre de Usuario
     *      Numero de Lecturas
     *      Ingreso de Temperatura (RANDOM)
     * 2. Calculos/Transformacion
     *      Formula Celsius - Farenheit
     *      Definicion de Sobrecalentamiento
     *      Validacion Lecturas (0 > lectura menor 50)
     *      Contabilizar el numero calentamiento
     *      Promediar el monitoreo
     *      -Validacion Temperatura

     * 3. Salida
     *      Resumen Estadistico
     *      Alerta de SobreCalentamiento
     * 
     * Lista de Tareas
     * 1. Capturar el Nombre del Usuario
     *        a. Definicion de Libreria/Instancia SCANNER
     *        b. Declaracion de Variable para el usuario
     * 2. Captura de Numero de Lecturas
     *        a. Declaracion de Variable para numero de lectura
     * 3. Generacion de Temperatura
     *      a. Definicion de Libreria RANDOM
     *      b. Declaracion de Variable
     *      c. Mostrar el numero Random Generando Temporalmente
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }//Fin Main
    
}//Fin de Class
