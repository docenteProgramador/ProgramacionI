/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciontoken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class GeneracionToken {

    /**
     * @param args the command line arguments
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
        

    }//Fin Main
    
}//Fin Class
