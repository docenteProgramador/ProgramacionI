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
        double dinero = 0;
        
        
        System.out.println("Agencia de Viajes de Progra I");
        System.out.println("La excelencia de la eleccion..esta en sus manos");
        System.out.println("Nosotros solo propiciamos la vuelta al mundo.!!!");
        
        System.out.println("Con cuanto dinero dispones para poder viajar?");
        dinero=sc.nextDouble();
        
        System.out.println("1. Antigua Guatemala ($400)");
        System.out.println("2. Cartagena ($800)");
        System.out.println("3. Tokyo ($1600)");
        System.out.println("4. Milan ($1200)");
        System.out.print("Seleccione su Destino: ");
        selCiudad = sc.nextInt();
        
        switch(selCiudad){
            case 1:
                if(dinero>400){
                    System.out.println("Visitando Guatemala");
                    System.out.println("una ciudad colonial como");
                    System.out.println("Antigua Guatemala!");
                }else{
                    System.out.println("No alcanza el dinero!!");
                }
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
                
            default:
                System.out.println("Destino no encontrado");
                System.out.println("Ingreso incorrecto");
                System.out.println("Lea ombe!!!");
                break;
        }//Fin de Switch
        
        
        System.out.println("Ahora....busquemos una aventura por hacer");
        System.out.println("Con o sin ganas, pero viviendo la vida!");
        System.out.println("A. Paracaidismo");
        System.out.println("B. Caminar por la Tigra");
        System.out.println("C. Montania Rusa - Six Flags");
        System.out.println("D. Buceo con Tanque");
        System.out.println("E. Canopy");
        System.out.println("F. Subir un Volcan");
        System.out.print("Dime tu aventura por hacer: ");
        selAventura = sc.next().toUpperCase().charAt(0);//Mayuscula la escritura
        //selAventura = sc.next().toLowerCase().charAt(0);//Minuscula la escritura
        switch(selAventura){

            case 'A':
                System.out.println("Nos tiramos de un avion!!");
                break;

            case 'B':
                System.out.println("Cuidado se pierden en el bosque!!");
                break;

            case 'C':
                System.out.println("Grritemos hasta quedarnos afonicos!!");
                break;

            case 'D':
                System.out.println("Admiremos los secretos del oceano!!");
                break;

            case 'E':
                System.out.println("No se te ocurra quitar el seguro");
                break;
                
            case 'F':
                System.out.println("Tierra y Ceniza Volcanica entre los zapatos");
                break;
                
            default:
                System.out.println("Esa opcion, no existe");         
        }//Find de Switch
        

        
    }//Fin Main
    
}//Fin de Class
