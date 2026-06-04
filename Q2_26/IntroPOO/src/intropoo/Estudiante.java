/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intropoo;

/**
 *
 * @author oscar
 */
public class Estudiante {
    
    //Variables Globales
    private String nombre;
    private String apellido;
    private int nota1;
    private int nota2;
    private int nota3;
    private double promedio;
    
    //Constructor
    public Estudiante(){
        this.nombre = "John";
        this.apellido = "Doe";
        this.nota1 = 100;
        this.nota2 = 100;
        this.nota3 = 100;
        this.promedio = 0;
    }//Fin de Constructor
    
    public Estudiante(String _nom, String _ape){
        this.nombre = _nom;
        this.apellido = _ape;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }//Fin de Constructor
    
    //Metodo - Funcion
    public void ImprimirDatosIniciales(){
        System.out.printf("Nombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
        System.out.printf("Nota 1: %d%n",nota1);
        System.out.printf("Nota 2: %d%n",nota2);
        System.out.printf("Nota 3: %d%n",nota3);
    }//Fin de Funcion
    
    //Encapsulamiento
    public void SetNombre(String _nom){
        this.nombre = _nom.toLowerCase();
    }//Fin de Set Nombre
    
    public String GetNombre(){
        return this.nombre;
    }//Fin de Get Nombre
    
    public void SetNotas(int n1, int n2, int n3){
        if(n1 >=0 && n1<=100){
            this.nota1 = n1;
        }
        else{
            this.nota1 = 0;
        }
        
        if(n2 >=0 && n2<=100){
            this.nota2 = n2;
        }
        else{
            this.nota2 = 0;
        }
        
        if(n3 >=0 && n3<=100){
            this.nota3 = n3;
        }
        else{
            this.nota3 = 0;
        }

    }//Fin SetNotas
    
    private void CalcularNotas(){
        this.promedio = (nota1 + nota2+nota3)/3;
    }//Fin de Promedio
    
    public double GetPromedio(){
        CalcularNotas();
        return this.promedio;
    }//Fin de Get Promedio
    
    
}//Fin de Class Estudiante
