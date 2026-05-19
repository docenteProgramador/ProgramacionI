/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioedades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Quiero que ingresen 5 edades y los clasifiquen segun 
 * el rango de edad
 * 0 - 10 -> Nin@
 * 11 - 17 ->Adolescente
 * 18 -> Joven Adulto
 * 
 * Mostrar el promedio general de edades y la cantidad de edades para cada categoria
 * 
 */
public class PromedioEdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rd= new Random();
        
        final int TOTALPERSONAS = 100;
        int edadIngresada = 0;
        int ninio = 0;
        int adolescente =0;
        int joven =0;
        double promedio = 0.0;
        int acumuladorEdades = 0;
        String mensaje = "John Doe";
        
        //personas += 5 -> personas = personas + 5
        for (int personas = 1; personas <= TOTALPERSONAS; personas++) {
            //System.out.printf("Iteracion %d",personas);
            //System.out.println("");
            System.out.print("Dime tu edad: ");
            //edadIngresada = input.nextInt(); //Ingreso Manual
            
            edadIngresada = rd.nextInt(1,100); //Ingreso Dinamico
            System.out.printf("%d) %d %n",personas,edadIngresada);
            
//Operadores Booleanos
            //AND   -> Y   -> &&
            //OR    -> O   -> ||
            //NOT   -> NO  -> !
            /*
            if(edadIngresada <=0 || edadIngresada>=100){
                System.out.println("Valor de Edad no valido");
                System.out.println("Vuelva a ingresarlo");
                personas--;
            }//Fin de IF
            else
            {
                //variable = (condición) ? valor_si_verdadero : valor_si_falso;
                    //Mal empleado las operaciones Ternarias
                 //mensaje = (edadIngresada >= 1) ? "Ninio" : "Otra cosa";
                 //mensaje = (edadIngresada >= 11) ? "Adolescente" : "Otra cosa";
                 //mensaje = (edadIngresada >= 18) ? "Joven" : "Otra cosa";
                 //System.out.println(""+mensaje);
            }
            */
            
            if(!(edadIngresada>=1 && edadIngresada<100)){
                System.out.println("Valor de Edad no valido");
                System.out.println("Vuelva a ingresarlo");
                personas--;
            }//Fin de IF
            else{
                
                acumuladorEdades += edadIngresada;
                
                if(edadIngresada >= 18)
                {
                    System.out.println("Joven");
                    joven++;
                }
                else if(edadIngresada >=11){
                    adolescente++;
                    System.out.println("Adolescente");
                }
                else{
                    ninio++;
                    System.out.println("Ninio");
                }
            }//Fin del ELSE
            
        }//Fin de Ciclo For
        
        promedio = acumuladorEdades / TOTALPERSONAS;
        
        System.out.println("--------------------");
        System.out.printf("Promedio General: %.2f %n",promedio);
        System.out.printf("# Ninios: %d %n",ninio);
        System.out.printf("# Adolescentes: %d %n",adolescente);
        System.out.printf("# Joven: %d %n",joven);
        System.out.println("---------------------");
    }//Fin de Main
    
}//Fin de Class
