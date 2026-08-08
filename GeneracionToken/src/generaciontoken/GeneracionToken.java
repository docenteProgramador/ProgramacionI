/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciontoken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Objetivos 
 * 1. Utilizar el ciclo de repeticion DO - WHILE
 * 2. Uso de Nuevas Librerias
 *      a. Random
 * 3. Uso de Otras Funciones de String
 */
public class GeneracionToken {

    /**
     * @param args the command line arguments.
     * 
     * Desarrollar un algoritmo que me permita registrar
     * un dispositivo y generar un token para su sesion
     * de validacion mientras se esta navegando con dicho dispositivo.
     * 
     * Contexto del problema:
       Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
        
       Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
     */
    
       /*
            Registro de Nombre de Equipo
            a. Longitud de 8 caracteres
            b. Comenzar con RT o SW
        */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        
        String nombreEquipo ="John Doe";
        String token= "";
        boolean longitudCorrecto = true;
        boolean prefijoCorrecto = true;
        boolean isValido = true;
        
        int tipoCaracter = 0;
        int numeroToken = 0;
        char letraToken='a';
        
        do {
            System.out.print("Ingresa el nombre del equipo: ");
            nombreEquipo = input.nextLine().toUpperCase();

            longitudCorrecto = (nombreEquipo.length()) == 8;
            prefijoCorrecto = nombreEquipo.startsWith("RT") || nombreEquipo.startsWith("SW");

            isValido = longitudCorrecto && prefijoCorrecto;

        }while(isValido);
        
        System.out.println("Registro Correcto");
        
        while(token.length()<12){
            tipoCaracter = rd.nextInt(2);
            
            if(tipoCaracter == 0){
                numeroToken = rd.nextInt(10);
                token = token + numeroToken;
            }
            else{
                letraToken = (char)(rd.nextInt(26)+65);
                token = token + letraToken;
            }
        }//Fin de While Generando Token
        
        System.out.printf("Token Generado: %s",token);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
   
        
    }// Fin de Main
    
}//Fin de Class
