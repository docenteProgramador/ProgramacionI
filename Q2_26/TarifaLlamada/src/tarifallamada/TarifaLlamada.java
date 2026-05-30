/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarifallamada;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class TarifaLlamada {

    /**
     * El desarrollo de un algoritmo que determine la cantidad 
     * monetaria que setiene que pagar de acuerdo al tiempo que
     * se estuvo en llamada y la zona(local, nacional, internacional)
     * 
     * Mostrar los resultados obtenidos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalMinutos = 0;
        char tipoLlamada = '@';
        double costoLlamada = 0;
        
        MensajeEntrada();
        
        System.out.println("El costo de la llamada depende de la zona y el tiempo");
        System.out.println("Llamdas locales (L) -> Lps 0.05 x min");
        System.out.println("Llamdas nacionales (N) -> Lps 0.15 x min");
        System.out.println("Llamdas internacionales (I) -> Lps 0.32 x min");
        
        System.out.print("Cuanto duro tu llamada? ");
        totalMinutos = scan.nextInt();
        System.out.println("Tipo de Llamada (L,N,I): ");
        tipoLlamada = scan.next().toUpperCase().charAt(0);
        
        costoLlamada = CalculoCostoLlamada(totalMinutos, tipoLlamada);
        
        ResultadoFactura(costoLlamada);
        
    }//Fin de Main
    
    public static void MensajeEntrada(){
        System.out.println("Estas llamando al sistema nacional");
        System.out.println("para llamadas locales, nacionales, internacionales");
        
    }//Fin de Funcion MensajeEntrada
    
    public static double CalculoCostoLlamada(int minutos, char zona){
        double totalTemporal = 0;
        
        switch(zona)
        {
            case 'L':
                totalTemporal = minutos * 0.05;
                break;
                
            case 'N':
                totalTemporal = minutos * 0.15;
                break;
            case 'I':
                totalTemporal = minutos * 0.32;
                break;
            default:
                totalTemporal = 0;
                System.out.println("Valor no calculado");
        }//Fin Switch
        
        return totalTemporal;
        
    }//Fin de Funcion CalculoCostoLlamada
    
    public static void ResultadoFactura(double costo){
        System.out.println("Esta es tu factura de llamada");
        System.out.println("El valor refleja de acuerdo a la cantidad de minutos y zona");
        System.out.println("que hablaste");
        System.out.printf("Valor: %.2f",costo);
    }
}//Fin de Class
