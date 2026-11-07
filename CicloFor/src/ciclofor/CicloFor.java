/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class CicloFor {

    /**
     *  
        Ciclos de Repeticion
        1. While   -> Ciclo "Infinito" y Finito     
        2. Do...while  -> Ciclo "Infinito" y Finito     
        3. For     -> Finito
    
        Elementos de un Ciclo
        1. Valor Inicial ->Punto de Partida
        2. Condicion 
            Se ejecuta mientras se mantenga TRUE/VERDADERO
            Se detiene el ciclo cuando se vuelve FALSE/FALSO la condicion
        3. Modificador  ->La alteracion de la Valor Inicial para que la condicion
                          sea falso
     */
    public static void main(String[] args) {
        
      //Conteo de Dos en Dos ASC
        for(int i = 0; i<=20 ; i +=2){
            System.out.printf("Valor de i: %d\n",i);
        }//Fin Ciclo For
        System.out.println("---------------");
      //Conteo DESCEDENTE Uno a Uno
        for (int i = 10; i > 0; i--) {
            System.out.printf("Valor de i: %d\n",i);
        }
        System.out.println("----------------------");
      /*
        Conteo ASC Donde el usuario dice tres cosas:
        1. Donde inicia
        2. Donde Termina
        3. El tamanio del salto/paso
       */
      Scanner scan = new Scanner(System.in);
      int inicio=0;
      
      int fin = 0;
      int saltos =0;
      
        System.out.print("Donde inicia?");
        inicio = scan.nextInt();
        
        System.out.print("Donde Termina?");
        fin = scan.nextInt();
        
        System.out.print("Tamanio de Salto?");
        saltos = scan.nextInt();
        
        for (int i = inicio; i <= fin; i +=saltos) {
            System.out.printf("Valor de i: %d\n",i);
        }
        System.out.println("--------------------");
        /*
            1   2   3   4   5   6   7   8   9   10
            11  12  13  14  15  16  17  18  19  20
            21  22  23  24  25  26  27  28  29  30
        ....................
        */
        
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%d\t",i);
            if(i%10 == 0){
                System.out.println("");
            }
            
        }
        System.out.println("--------------");
        /*
            #
            # #
            # # #
            # # # #
            # # # # #
        */
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" # ");
            }
            System.out.println("");
        }//Fin Ciclo For I
        
    }//Fin de Main
    
}//Fin Class
