
package com.mycompany.tarea2;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Tarea2 {
    //Variables globales
    static int[] numeroCamiseta = new int [2]; 
    static int[] edad = new int[2]; 
    static double[] altura = new double[2];
    static char[] genero = new char[2];
    static boolean registro = true;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    //REGISTRO DE JUGADORES PARA UN PARTIDO DE FUTBOL MIXTO 5X5
        for (int i = 0; i < 2; i++) {
            System.out.println("=== Jugador "+ (i+1) +" ===");
        leerDatos(i);
        validarDatos(i);
        mostrarRegistro(i); 
        }
        estadisticas();
    }
    
    public static void leerDatos(int posicion){
        /*
        Se encarga de leer datos
        Ingresados por el usuario    
        */
     System.out.print("Ingrese el numero de camiseta: ");
        numeroCamiseta[posicion] = sc.nextInt();
        
        System.out.print("Ingrese la edad: ");
        edad[posicion] = sc.nextInt();
        
        System.out.print("Ingrese la altura (m): ");
        altura[posicion] = sc.nextDouble();
        
        System.out.print("Ingrese el genero H(hombre)/M(mujer): ");
        genero[posicion] = sc.next().charAt(0);
    }
    
    public static void validarDatos(int posicion){
         /*
        valida que el número de camiseta, la edad,
        la estatura y el género cumplan con las reglas
        */
         registro = true;
            if (numeroCamiseta[posicion] <1 || numeroCamiseta[posicion] >99) {
          registro = false;  
        }
        if (edad[posicion] <18 || edad[posicion] >60) {
            registro = false;
        }
         if (altura[posicion] <=0) {
            registro = false;
        }
          if (genero[posicion] != 'H' && genero[posicion] != 'M') {
            registro = false;
        }
          
    }
    
    public static void mostrarRegistro(int posicion){
        /*
        Muestra el resultado del registro dependiendo 
        de los datos ingresados por el usuario
        */
    if (registro == true) {
              System.out.println("===== Registro Exitoso =====");
              System.out.println(" ");
        }else{
              System.out.println("===== Datos no validos =====");
              System.out.println(" ");
          }
    }
    
    public static void estadisticas(){
        /*
        Compara las edades para saber que edad es la mayor y la menor
        ademas suma todas las edades del equipo y las promedia
        */
    int mayor = edad[0];
    int menor = edad[0];
    int suma = edad[0];
    double promedio;
    
        for (int i = 1; i < 2; i++) {
            suma += edad[i];//suma total de edades
            
            if (edad[i]>mayor) {//Para encontrar el mayor
                mayor = edad[i];
            }
            
            if (edad[i]<menor) { //Para encontrar el menor
                menor = edad[i];
            }
        }
        promedio = suma/5.0;
    
        System.out.println("El jugador con mayor edad tiene: "+mayor);
        System.out.println("El jugador con menor edad tiene: "+menor);
        System.out.println("El promedio de las edades es: "+promedio);
        System.out.println("");

    }
}
