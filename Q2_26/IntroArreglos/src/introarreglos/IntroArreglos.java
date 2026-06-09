/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introarreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class IntroArreglos {

    /**
     * Desarrollar un algoritmo que permita registrar
     * la cantidad de agua (mm) que está cayendo sobre la 
     * capital en un lapso de una semana. El proposito 
     * es determimar, el día que mas llueve, el dia que menos
     * llueve y el promedio de agua que cae sobre la ciudad 
     * a lo largo de la semana.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Forma #1 Declaracion de Arreglos
        int[] arreglos1;//Declaracion
        arreglos1 = new int[5]; // Creacion de Tamanio 5
        
        //Forma #2 Declaracion y Creacion de Arreglo
        double[] arreglos2 = new double[10];//Tamanio 10
        
        //Forma #3 Declaracion e Inicializacion
        char[] arreglo3 = {'1','2','3'};//Tamanio 3
        
        //Forma #4 Declaracion, Creacion e Inicializacion
        boolean[] arreglo4 = new boolean[]{true,false,true,false};//Tamanio 4
        
        Random rand = new Random();
        final int DIM = 7;//Dimension
        final int MAX = 300;
        final int MIN = 0;
        int[] cantidadAgua = new int[DIM];//Cantidad de agua en mm
        int cantidadAguaMAX = MIN;
        int cantidadAguaMIN = MAX;
        int acumuladorAgua = 0;
        double promedioAgua = 0;
        
        //Inicializar el arreglo
        for (int i = 0; i < DIM; i++) {
            cantidadAgua[i]=0;
        }//Fin de Ciclo For
        
        //Ingresar los datos de lluvia en mm
        for (int i = 0; i < DIM; i++) {
            cantidadAgua[i] = rand.nextInt(MIN,MAX);
            acumuladorAgua += cantidadAgua[i];
        }//Fin de Ciclo FOR
        
        //Mostrar Datos del Arreglo
        for (int i = 0; i < DIM; i++) {
            //System.out.printf("Indice: %d%n",i);
            //System.out.printf("Posicion: %d%n",i+1);
            System.out.printf("Dato: %d%n",cantidadAgua[i]);
            System.out.println("----------------------");
        }//Fin de Ciclo For
        
        //Comparacion de Datos
        for (int i = 0; i < DIM; i++) {
            //Valor Min
            if(cantidadAguaMIN>cantidadAgua[i]){
                cantidadAguaMIN = cantidadAgua[i];
            }
            
            //Valor Max
            if(cantidadAguaMAX<cantidadAgua[i]){
                cantidadAguaMAX = cantidadAgua[i];
            }
        }//Fin de Ciclo For de Comparacion de Datos
        
        promedioAgua = (double)acumuladorAgua / DIM;
        
        System.out.println("VALORES MAXIMO Y MINIMO");
        System.out.printf("MIN: %d\t MAX:%d%n",cantidadAguaMIN,cantidadAguaMAX);
        System.out.printf("Promedio: %.2f",promedioAgua);
    }//Fin de Main
    
}//Fin de Class
