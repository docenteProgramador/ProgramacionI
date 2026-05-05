/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificaciones;

import java.util.Scanner;

/**
 *  1. Estructuras de Secuencia
 *  2. Estructuras de Seleccion
 *      a. Simples  ->if
 *      b. Dobles   ->if/else
 *      c. Multiples
 *      d. Anidadas
 * 3. Estructura de Repeticion
 */
public class Calificaciones {

    /**
     * Desarrollar un algoritmo que permita ingresar tres notas (0 - 100) donde 
     * en cada uno se dirá si este aprobo (Nota tiene que estar arriba de 70)
     * determinar el promedio de clase indicando si se promueve o no para la siguiente
     * asignatura.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio = 0.0;
        String mensaje = "John Doe"; 
        
        
        System.out.println("Bienvenido al Sistemas de Promedios de Programacion");
        System.out.print("Dime cuanto fue tu 1ra nota: ");
        nota1 = scan.nextInt();
        
        //EStructura de Seleccion Simple
        /*
            <   -> Menor
            >   -> Mayor
            <=  -> Menor o Igual
            >=  -> Mayor o Igual
            !=  -> Distinto/Diferente
            ==  -> Igual
        */
        if(nota1 >=70){
            //Bloque VERDADERO ->Aprobado
            System.out.println("Aprobado");
            System.out.println("Tu 1ra nota..muy bien");
            System.out.println("Sigue asi");
        }//Fin del IF
        
        System.out.print("Dime cuanto fue tu 2da nota: ");
        nota2 = scan.nextInt();
        if(nota2 >=70){
            //Bloque VEERDADERO ->Aprobado
            System.out.println("Aprobado");
        }
        
        System.out.print("Dime cuanto fue tu 3ra nota: ");
        nota3 = scan.nextInt();
        if(nota3 >=70){
            //Bloque VERDADERO ->Aprobado
            System.out.println("Aprobado");
        }
        
        promedio = (double)(nota1+nota2+nota3)/3;
        
        System.out.printf("Tu promedio es de : %.2f",promedio);
        if(promedio>=70){
            mensaje = "Has aprobado la asignatura de Progra";
        
        }//Fin del IF
        else{
            mensaje = "Mejor suerte a la proxima!!";
        }
        System.out.printf("\nEstado: %s",mensaje);
        
        
    }//Fin de Main
    
}//Fin de Class
