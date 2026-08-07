
package com.mycompany.tarea2;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Tarea2 {
    //Variables globales
    static int numeroCamiseta = 0; 
    static int edad = 0; 
    static double altura = 0.0;
    static char genero = ' ';
    static boolean registro = true;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    //REGISTRO DE JUGADORES PARA UN PARTIDO DE FUTBOL MIXTO
        leerDatos();
        validarDatos();
        mostrarRegistro();
    }
    
    public static void leerDatos(){
        /*
        Se encarga de leer datos
        Ingresados por el ususario    
        */
     System.out.print("Ingrese el numero de camiseta: ");
        numeroCamiseta = sc.nextInt();
        
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        
        System.out.print("Ingrese la altura (m): ");
        altura = sc.nextDouble();
        
        System.out.print("Ingrese el genero H(hombre)/M(mujer): ");
        genero = sc.next().charAt(0);
    }
    public static void validarDatos(){
         /*
        valida que el número de camiseta, la edad,
        la estatura y el género cumplan con las reglas
        */
         registro = true;
            if (numeroCamiseta <1 || numeroCamiseta >99) {
          registro = false;  
        }
        if (edad <18 || edad >60) {
            registro = false;
        }
         if (altura <=0) {
            registro = false;
        }
          if (genero != 'H' && genero != 'M') {
            registro = false;
        }
          
    }
    
    public static void mostrarRegistro(){
        /*
        Muestra el resultado del registro dependiendo 
        de los datos ingresados por el usuario
        */
    if (registro == true) {
              System.out.println("===== Registro Exitoso =====");
        }else{
              System.out.println("===== Datos no validos =====");
          }
    }
}
