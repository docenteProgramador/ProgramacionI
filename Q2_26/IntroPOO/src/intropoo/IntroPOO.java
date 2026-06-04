/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intropoo;

/**
 *
 * @author oscar
 * Ingresar el nombre de un estudiante y apellido de forma
 * que pueda "imprimir" una boleta de calificaciones de los tres parciales
 * y el promedio obtenido, donde al final se le indica si este ha aprobado o 
 * no la materia.
 */
public class IntroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante Oscar = new Estudiante();
        Estudiante Diego = new Estudiante("Edgardo","Palencia");
        
        Oscar.ImprimirDatosIniciales();
        System.out.println("----------------");
        Diego.ImprimirDatosIniciales();
        System.out.println("\n");
        
        //Oscar.nombre = "Oscar";
        Oscar.SetNombre("OsCaRRRR");
        Diego.SetNombre("DIIIIEEEEEGGGOOOOO");
        //Oscar.apellido = "Andrade";
        
        Diego.ImprimirDatosIniciales();
        System.out.println("\n");
        Oscar.ImprimirDatosIniciales();
        System.out.println("----------------");
        
        Oscar.SetNotas(100, 80, 50);
        Diego.SetNotas(-50, 100, 100);
        
        Diego.ImprimirDatosIniciales();
        System.out.println("\n");
        Oscar.ImprimirDatosIniciales();
        System.out.println("----------------");
        
    }//Fin de Main
    
}//Fin Class
