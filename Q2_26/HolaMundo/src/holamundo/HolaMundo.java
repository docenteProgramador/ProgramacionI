/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

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
        inicial = '@';
        palabra = "hola";
        
        System.out.printf("Saludo inicial %s",palabra);
        System.out.println("");
        System.out.printf("%s Saludo Inicial",palabra);
        System.out.println("");
        System.out.println("Saludo, %s, palabra");
                
                
    }//Fin de la Funcion Main
    
}//Fin de Class HolaMundo
