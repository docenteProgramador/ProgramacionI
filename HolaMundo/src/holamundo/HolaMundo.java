/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author oscar andrade
 */
public class HolaMundo {

    // Comentario de una sola linea
    // Esto tambien debe de ser un  comentario
    /*
        Pleca Asterisco -> Para abrir bloque
        Asterisco Pleca -> Para cerrar bloque
        Todo lo que esta entre ello, se toma como
        comentario.
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sensible a Mayusculas - Minusculas
        /*
            Objetivo
        1. Imprimir en la pantalla
            a. Diferentes formas para poder imprimir en pantalla
            b. Caracteres de escape
        2. Captura de Datos por parte del usuario.
        */
        
        System.out.println("Hola...como estas!!");
        System.out.println("Este es mi primer programa");
        System.out.println("Yujuuu...estoy con Java");
        
        System.out.print("Oscar Andrade");
        System.out.print("Soy el profe de Progra");
        System.out.print("Mucho gusto");
        
        System.out.println("");
        
        System.out.printf("Esto es la clase de %S \n","Programacion");
        //System.out.println("");  alt+92 ->\
        
        System.out.printf("Esto es %S la clase de\n","Programacion");
        //System.out.println("");
        
        System.out.printf("%S Esto es la clase de\n","Programacion");
        //System.out.println("");
        
        System.out.printf("Hola \n Como \n estas\n en la clase %s\n?","Programacion");
        System.out.printf("Hola \t Como \t estas\t en la clase %s\t?","Programacion");
        
        //Variables
        int tiempo; //Tipo Entero
        double promedio; //Tipo Decimal
        String nombre;//Tipo Cadena
        char inicial; //Tipo Caracter -> letra, digitoNumerico, simbolo Especial
        boolean estado;//Tipo Booleano ->true(verdadero) / false (falso)
        
        tiempo = 3;
        nombre = "Oscar";
        inicial = 'A';
        
        System.out.printf("Tu nombre es: %s \n",nombre);
        System.out.printf("%d veces a la semana recibes la clase\n",tiempo);
        System.out.printf("Te llamare %c inicial",inicial);
        
        
    }//Fin de la funcion MAIN
    
}//Fin de la Clase Hola Mundo
