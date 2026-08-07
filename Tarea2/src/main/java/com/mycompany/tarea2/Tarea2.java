
package com.mycompany.tarea2;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Tarea2 {
//REGISTRO DE JUGADORES PARA UN PARTIDO DE FUTBOL MIXTO
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    int numeroCamiseta = 0;
    int edad = 0; 
    double altura = 0.0;
    char genero = ' ';
    boolean registro = true;
    
        System.out.print("Ingrese el numero de camiseta: ");
        numeroCamiseta = sc.nextInt();
        
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        
        System.out.print("Ingrese la altura (m): ");
        altura = sc.nextDouble();
        
        System.out.print("Ingrese el genero H(hombre)/M(mujer): ");
        genero = sc.next().charAt(0);
        
        //VALIDACIONES
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
          if (registro == true) {
              System.out.println("=====Registro Exitoso=====");
        }else{
              System.out.println("=====Datos no validos=====");
          }
      

    //FIN MAIN      
    }
}
