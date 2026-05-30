/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * Calcular el Indice de Masa Corporal
 * Edad, peso, estatura
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad = 0;
        int peso = 0;
        double estatura = 0;
        double IMC = 0;
        
        edad = IngresoDatos("Edad");
        peso = IngresoDatos("Peso");
        estatura = IngresoDatos("Estatura");
        
        IMC = peso / Math.pow(estatura, 2);

        System.out.printf("Tu IMC es: %.2f",IMC);
        

    }//Fin de Main
    public static int IngresoDatos(String palabra){
        Scanner scan  = new Scanner(System.in);
        int datoTemporal = 0;
        
        do{
            System.out.printf("Ingresa tu %s:",palabra);
            datoTemporal = scan.nextInt();
            if(datoTemporal<0){
                System.out.println("Valor tiene que ser mayor a cero");
                System.out.println("ingrese nuevamente");
            }
        }while(datoTemporal<0);
        
        return datoTemporal;
    }//Fin de Funcion IngresoDatos
    
}//Fin de Class
