/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenciaviajes;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class AgenciaViajes {

    /**
     * 1. Estructuras de Secuencia
     *      a. Variables y los tipos
     *      b. Impresion en Pantalla
     *      c. Operaciones Aritmeticas
     * 2. Estructuras de Seleccion
     *      a. Simple (if)
     *      b. Dobles (if...else)
     *      c. Multiples (switch)
     *      d. Anidadas     (mix...if/else dentro otro if/else,
     *                      o el uso de switch con if/else)
     * 
     * if/else -> un rango de valores
     *            elementos igualitarios o distincion
     * 
     * switch ->  casos de igualdad, todos las opciones son iguales en valor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int selCiudad = 0;
        char selAventura = '@';
        
        System.out.println("Agencia de Viajes de Progra I");
        System.out.println("La excelencia de la eleccion..esta en sus manos");
        System.out.println("Nosotros solo propiciamos la vuelta al mundo.!!!");
        System.out.println("1. Antigua Guatemala");
        System.out.println("2. Cartagena");
        System.out.println("3. Tokyo");
        System.out.println("4. Milan");
        System.out.print("Seleccione su Destino: ");
        selCiudad = sc.nextInt();
        
        switch(selCiudad){
            case 1:
                System.out.println("Visitando Guatemala");
                System.out.println("una ciudad colonial como");
                System.out.println("Antigua Guatemala!");
                break;
                
            case 2:
                System.out.println("Las mejores playas de ");
                System.out.println("Colombia...!!");
                System.out.println("Bienvenido a Cartagena!");
                break;
                
            case 3:
                System.out.println("No es como la pelicula");
                System.out.println("pero si igual de espectacular");
                System.out.println("Tokyo, Japon");
                break;
                
            case 4:
                System.out.println("La ciudad de la moda");
                System.out.println("Mucha aristocracia de por medio");
                System.out.println("Milan, Italia");
                break;
        }//Fin de Switch
    }//Fin Main
    
}//Fin de Class
