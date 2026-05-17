/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votaciones;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Votaciones {

    /**
     * Desarrollar un algoritmo que simule la cabina de votacion
     * de una eleccion Estudiantil (4 participantes). Este ira contabilizando uno a uno
     * los votos que vaya recibiendo cada participante. Este deberá mostrar
     * en estadistica el porcentaje de cada participante y el total de votos obtenidos.
     * Se tiene que declarar un ganador al final de la votacion. No se sabe cuantos
     * estudiantes van a votar el día de las elecciones.
     * 
     * 1. Creacion de contador para cada participante
     * 2. Mostrar los diferentes participantes
     * 3. Capacidad de eleccion para cada participante.
     * 4. Contabilizar el voto segun el participante
     * 5. Repetir proceso hasta que no hayan mas votantes
     * 6. Mostrar resultados de votacion total
     * 7. Mostrar resultados estadisticos
     * 8. Declaracion de Ganador
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contPartiA = 0;
        int contPartiB = 0;
        int contPartiC = 0;
        int contPartiD = 0;
        int contPartiE = 0;
        int seleccionVoto = 0;
        int conteoVotos = 0;
        boolean validacionVoto = true;
        String respuesta ="John Doe";
       
        while(!respuesta.equals("cierre")){
            do{
            System.out.println("Centro de Votaciones");
            System.out.println("Eleccion Estudiantial 2026");
            System.out.println("1. Guillermo Ortiz");
            System.out.println("2. Freylin Vasquez");
            System.out.println("3. Zarem Turcios");
            System.out.println("4. Saul Licona");
            System.out.println("5. Kevin Vallecillo");
            System.out.print("Por quien votas:");
            seleccionVoto = scan.nextInt();
        
            //Validacion de Voto
            //Operadores Booleanos (AND, OR , NOT)
            //AND -> && -> Y    => Todos tiene que ser verdadero
            //OR  -> || -> O    => Al menos uno tiene que ser verdadero
            //NOT -> !  -> Inversa/negacion -> Lo opuesto a valor
            
            //Ejemplo > Ingreso #6 ->Resultado del IF -> FALSO
            //Ejemplo > Ingreso #-5 ->Resultado del IF -> FALSO
            //Ejemplo > Ingreso #3 ->Resultado del IF -> VERDADERO
            if(seleccionVoto>=1 && seleccionVoto<=5){
                System.out.println("Voto Valido");
                conteoVotos++;
                System.out.printf("Numero de Voto: %d",conteoVotos);
                validacionVoto = true;
                System.out.println("");
            }
            else{
                System.out.println("Solo se puede del 1 al 5");
                System.out.println("Validar que ingreso bien el dato.");
                validacionVoto = false;
            }

            //}while(!(seleccionVoto>=1 && seleccionVoto<=5));
            }while(!validacionVoto);

            switch(seleccionVoto){
                case 1:
                    System.out.println("Guillermo Ortiz Seleccionado");
                    contPartiA++;
                    break;
                case 2:
                    System.out.println("Freylin Vasquez Seleccionado");
                    contPartiB++;
                    break;
                case 3:
                    System.out.println("Zarem Turcios Seleccionado");
                    contPartiC++;
                    break;
                case 4:
                    System.out.println("Saul Licona Seleccionado");
                    contPartiD++;
                    break;
                case 5:
                    System.out.println("Kevin Vallecillo Seleccionado");
                    contPartiE++;
                    break;
                default:
                    System.out.println("Error del Sistema - Valor no contemplado");
                    break;
            }//Fin de Switch

            System.out.print("Se cierran las votaciones?(Cierre) ");
            respuesta = scan.next().toLowerCase();
        }//Fin de While
        System.out.println("-------------------------");
        System.out.printf("Guillermo total de Votos: %d %n",contPartiA);
        System.out.printf("Freylin total de Votos: %d %n",contPartiB);
        System.out.printf("Zarem total de Votos: %d %n",contPartiC);
        System.out.printf("Saul total de Votos: %d %n",contPartiD);
        System.out.printf("Kevin total de Votos: %d %n",contPartiE);
        
        System.out.println("-------------------------");
        System.out.printf("Guillermo: %.2f %% %n",(double)contPartiA/conteoVotos*100);
        System.out.printf("Freylin: %.2f %% %n",(double)contPartiB/conteoVotos*100);
        System.out.printf("Zarem: %.2f %% %n",(double)contPartiC/conteoVotos*100);
        System.out.printf("Saul: %.2f %% %n",(double)contPartiD/conteoVotos*100);
        System.out.printf("Kevin: %.2f %% %n",(double)contPartiE/conteoVotos*100);

    }//Fin de Main
    
}// Fin de Class
