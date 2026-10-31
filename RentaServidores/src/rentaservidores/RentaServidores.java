/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentaservidores;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class RentaServidores {

    /**
     * Renta de Servidores Web (Mezcla de switch e if/else con booleanos)
        Una empresa de hosting renta servidores. El costo base por día es de $10.0. 
        * Se le pide al usuario la cantidad de días y el tipo de plan 
        * (“A” Básico, “B” Pro, “C” Empresarial). Usando un switch para 
        * añadir un costo extra diario: 
            •	Plan Básico se suma $0, 
            •	Plan Pro se suma $5, 
            •	Plan Empresarial se suma $15.
        Después de calcular el subtotal, usar una estructura de selección simple 
        para aplicar una promoción: 
            •	Si el cliente renta el servidor por más de 15 días y 
             el plan es 'B'o 'C', 
            se le aplica un 15% de descuento al total. 
            
        Se tiene que mostrar el total a pagar, la cantidad de días de renta y 
        * el plan seleccionado.
     */
    
    /*
        Datos Entrada
        1. Cantidad de Dias que se renta el servidor
        2. Que tipo de Plan se contrata
    
        Procesamiento / Decisiones / Calculos
        1. Determinar el tipo de plan
        2. *Validar el tipo de entrada de acuerdo plan*
        3. Calcular el costo de renta del servidor
                precio * dias Alquilados
        4. Calcular el costo total de pago
        5. Calcular el descuento segun criterios
        
    */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        double precio = 10.0;
        int cantDia = 0;
        char tipoPlan = '@';
        double recargo = 0;
        double subTotal = 0;
        double cosTotal = 0;

        System.out.println("Bienvenido al sistema");
        System.out.println("Ingrese la cantidad de dias que rentara");
        cantDia = sc.nextInt();

        System.out.println("Que tipo de plan rentara?");
        System.out.println("A. Plan Basico + O$");
        System.out.println("B. Plan Pro + 5$");
        System.out.println("C. Plan Empresarial + 15$");
        tipoPlan = sc.next().toUpperCase().charAt(0);

        switch (tipoPlan) {
            case 'A':
                recargo = 0;
                subTotal = cantDia * precio;
                System.out.println("El Subtotal es: " + subTotal);

                break;
            case 'B':

                recargo = 5;
                subTotal = cantDia * (precio + recargo);
                System.out.println("El Subtotal es: " + subTotal);
                break;
            case 'C':
                recargo = 15;
                subTotal = cantDia * (precio + recargo);
                System.out.println("El Subtotal es: " + subTotal);
                break;

        }

    }
}