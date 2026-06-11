/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadronotaestudiantes;

import java.time.temporal.Temporal;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class CuadroNotaEstudiantes {

    /**
     * Desarrollar un algoritmo que simule la boleta de calificaciones
     * de un estudiante que esta cursando PT/ING en CEUTEC
     * Mostrando el nombre, las notas acumuladas y parciales, nota final
     * Y promedio de periodo.
     * 
     * Boleta de Oscar Andrade
     *                  Acum    Examen  Total   Promedio
     * Programacion I   40      50      90
     * Disenio Web      30      40      70
     * Admin I          50      50      100
     * Espaniol         30      30      60
     * 
     * Promedio: 90
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        final int FILA = 3;
        final int COLU = 3;
        int[][] notasAsignaturas = new int [FILA][COLU]; //Arreglo Bidimensional
        String[] nombreAsignaturas = new String[FILA]; //Arreglo Unidimensional
        String nombreEstudiante = "John Doe";
        double promedioPeriodo = 0;
        
        //Inicializar
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLU; j++) {
                notasAsignaturas[i][j]= 0;
            }//Fin For COL
        }//Fin For FILA
        
        nombreEstudiante = tratamientoNombre(scan);
        nombreAsignaturas = tratamientoNombreAsignaturas(scan, FILA);
    }//Fin de Main
    
    /**
     * Funcion que captura el nombre del estudiante y hace 
     * el tratamiento de lo que considera necesario para poder guardarlo
     * en la BD del sistema.
     * 
     * @param  input Parametro de libreria Scanner
     * @return devuelve el nombre ya tratado.
    */
    public static String tratamientoNombre(Scanner input){
        String datoTemporal = "John";
        System.out.println("Cual es tu nombre? ");
        datoTemporal = input.nextLine().toLowerCase();
        return datoTemporal; 
    }//Fin de Funcion tratamientoNombre
    
    public static String[] tratamientoNombreAsignaturas(Scanner input, int DIM){
        String[] temporal = new String[DIM];
        for (int i = 0; i < DIM; i++) {
            temporal[i] = input.next().toUpperCase();
        }
        return temporal;
    }
}// Fin de Class
