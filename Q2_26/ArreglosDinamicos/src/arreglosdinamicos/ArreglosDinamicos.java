/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosdinamicos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<String> carros =new ArrayList<String>();
        boolean estadoCiclo = true;
        String captura = "";
        int dato = 0;
        
        carros.add("Lamborgini");
        carros.add("BMW");
        carros.add("Porsche");
        
        System.out.printf("Tamanio del ArrayList: %d",carros.size());
        System.out.println("\n-------------------------");
        
        for(int i = 0; i<carros.size();i++){
            System.out.printf("Carro #%d: %s %n",i+1,carros.get(i));
        }//Fin de Ciclo For
        System.out.println("-------------------------");
        
        while(estadoCiclo){
            System.out.print("Dime otro carro: ");
            captura = scan.next().toUpperCase();
            carros.add(captura);
            
            System.out.println("Desea que Cosme compre otro carro?");
            System.out.println("Si(1) o No(0)");
            System.out.print("Respuesta: ");
            dato = scan.nextInt();
            
           
           if(dato == 1){
               estadoCiclo = true;
           }
           else{
               estadoCiclo = false;
           }
        }//Fin de While
        
        ListadoCarros(carros);
        
        System.out.println("--------------------------");
        ListadoCarros(carros);
        System.out.println("--------------------------");
        System.out.println("Fase de Modificacion de Vehiculo");
        System.out.println("¿Cual quieres cambiar?");
        
        
                
    }//Fin Main
    
    public static void ListadoCarros(ArrayList<String> datos){
        System.out.printf("Tamanio del ArrayList: %d",datos.size());
        System.out.println("\n-------------------------");
        
        for(int i = 0; i<datos.size();i++){
            System.out.printf("Carro #%d: %s %n",i+1,datos.get(i));
        }//Fin de Ciclo For
        System.out.println("-------------------------");
    }
    
}//Fin Class
