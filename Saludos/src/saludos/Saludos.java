/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludos;

/**
 *
 * @author oscar
 */
public class Saludos {

    /**
     * @param args the command line arguments
     */
    
    // Doble Diagonal es una linea de comentario
    /*
        Diagonal Asterisco ABRE BLOQUE DE COMENTARIO
    
        Tdo lo que se escriba aqui
    dentro de este bloque, sera
    tomado como un comentario hasta que.....
    encuentre
        Asterisco Diagonal CIERRA BLOQUE COMENTARIO
    */
    
    public static void main(String[] args) {
               
        //Mostrar contenido en la pantalla
        System.out.println("Aqui va un 1er mensaje.");
        System.out.println("Luego una 2daaaaa linea para el mensaje.");
        System.out.println("Coloquemos dentro del mensaje un 3ro.");
        
        System.out.println("-----------------------------------------");
        System.out.println("Cual sera la diferencia entre");
        System.out.println("println y print");
        System.out.print("Probando...Probando");
        System.out.println("Aqui va println");
        System.out.print("Y aqui va print");
        System.out.println("Notas la diferencia?");
        System.out.println("--------------------------------------------");
        
        // La contra pleca \ -> Tecla ALT + 92
        System.out.printf("Probando un nuevo saludo para %s \n","Oscar");
        System.out.printf("Te saludo todas las veces  : %d",5);
        System.out.println("");
        System.out.printf("Probando un nuevo %s saludo para \n","Oscar");
        System.out.printf("Te saludo todas  %d las veces:",5);
        System.out.println("");
        System.out.printf("%s Probando un nuevo saludo para \n","Oscar");
        System.out.printf("%d Te saludo todas las veces :",5);
        
        /*
            %s  -> Es texto
            %d  -> es para numeros enteros
            %f  -> es para numeros decimales
            %b  -> es para estados booleanos
        
            println -> impresion con salto de linea
            print -> impresion
            printf -> impresion formateada
        */
        //Tipos de Variables
        // Palabras Resaltada con color...son palabras CLAVE
        int edad;   //Un espacio para numeros del tipo ENTERO
        double altura;  //Un espacio para numeros del tipo DECIMAL
        String nombre;  //Un espacio para cadenas/palabras/frases
        char genero;    //Un espacio para letras, digitos caracters especiales
        boolean estado; //Un espacio para VERDADERO(true) o FALSO(false)

        edad = 15;
        altura = 1.91;
        nombre = "John Doe";
        genero = 'm';//Tecla ALT + 39 ->Comilla Simple
        estado = true;
        
        System.out.printf("Era una vez un personaje llamado %s \n",nombre);
        System.out.print(" en la que buscaba congrasiarse \n");
        System.out.printf("con gente del genero %c",genero);
        System.out.printf("  el detalle estaba con los %f metros ",altura);
        System.out.print("media!!!\n");
        System.out.printf("Pero lo compensaba con %d anios de buena vida!!",edad);
    }//Fin de Main
    
}//Fin de Class
