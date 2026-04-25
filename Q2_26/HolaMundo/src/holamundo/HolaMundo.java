/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;


/**
 *@author oscar
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Comentarios de una sola linea
        
        /*
            Comentarios en Bloque
            donde tenemos
            mas de una linea
            de comentario
        */
        System.out.println("Hola Ing..como esta? ");//Imprimir en pantalla (consola)
        System.out.println("Yo muy bien");
        System.out.print("Tu que tal");
        System.out.print("Como te llamas?");
        System.out.println("Oscar Andrade es mi nombre");
        
        //Declaraion de Variables
        
        int numero;//Representar un Entero
        
        float numeroDecimal2;//Numero Decimal
        double numeroDecimal;//Numero Decimal
        
        boolean estado;//Verdadero(1) / Falso(0)
        
        char inicial;//Digito, letra, caracter Especial (@,#,!..etc)
        String palabra;//palabras o frases concatenadas
        
        //Asignando Valor a las Variables
        //usamos un signo igual "="
        numero = 10;
        /*
         Java distingue en entre mayusculas y minusculas
            int Numero = 10;
            int NuMeRo = 10;
        */
    
        numeroDecimal = 15.4678;
        estado = true;
        inicial = 'q';
        palabra = "hola";
        
        System.out.printf("Saludo inicial %s",palabra);
        System.out.println("");
        System.out.printf("%s Saludo Inicial",palabra);
        System.out.println("");
        System.out.printf("Saludo, %s, palabra",palabra);
        System.out.println("");  
        System.out.println("---------------------------");
        
        System.out.println("Saludo inicial "+palabra);
        System.out.println(palabra+" Saludo inicial");
        System.out.println("Saludo, "+palabra+",inicial ");
        
        System.out.printf("Valor monetario: %f",numeroDecimal);
        System.out.println("");
        System.out.printf("Valor monetario: %.2f",numeroDecimal);
        System.out.println("");
        System.out.printf("Valor monetario: %.4f",numeroDecimal);
        System.out.println("");
        
        System.out.printf("Para iniciales %c",inicial);
        System.out.println("");
        System.out.printf("Para iniciales %C",inicial);
        System.out.println("");
        System.out.println("");
        
        System.out.printf("Numeros Enteros: %d",numero); 
        //alt + 92 => \
        System.out.println("\nEsto es \n una muestra de\n caracteres de escape");
        System.out.println("Luego tenemos \t este otro \t caracter de escape");
        System.out.println("Y si quieres \"ALGO\" especial usa \" ");
        System.out.println("");
        //Declaracion e Inicializacion de Variable
        int edad = 100;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cuantos anios tienes?");
        edad = scan.nextInt();
        System.out.printf("%nLa edad que ingresaste es de : %d",edad);
        
        String nombre = "John";
        String apellido ="Doe";
        String frase ="No se quien es John Doe";
        
        System.out.print("\nDame un nombre ");
        nombre = scan.next();
        
        scan.nextLine();//Limpieza de buffer
        System.out.print("Dame dos apellidos ");
        apellido = scan.nextLine();
        
        System.out.print("Una Frase JoHN: ");
        frase = scan.next();
        
        System.out.printf("%n %s  %s dijo %s",nombre,apellido,frase);
   
    }//Fin de la Funcion Main
    
}//Fin de Class HolaMundo
