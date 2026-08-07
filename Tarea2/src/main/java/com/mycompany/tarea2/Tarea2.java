
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
    
        System.out.println("Ingrese el número de camiseta");
        numeroCamiseta = sc.nextInt();
        
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        
        System.out.println("Ingrese la altura (m)");
        altura = sc.nextDouble();
        
        System.out.println("Ingrese el género H(hombre)/M(mujer)");
        genero = sc.next().charAt(0);
        
        //VALIDACIONES
        if (edad >= 18 && edad <= 60) {
            registro = true;
            System.out.println("Edad válida");
        }else{
            registro = false;
            System.out.println("Edad no válida");
        }
        
        if (genero == 'H' || genero == 'M') {
            System.out.println("Genero válido");
        }else{
            System.out.println("Género no valido");
        }
                
    }
}
