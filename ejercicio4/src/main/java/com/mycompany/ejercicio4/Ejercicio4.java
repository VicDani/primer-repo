/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       
        Scanner resultado = new Scanner (System.in);
        
        System.out.println("Ingrese la calor: ");
        int c = resultado.nextInt();
        
        int f = 32 + (9*c/5);
        System.out.println("Los calor ingresada en Centidrados y pasada a Farenheit es: "+f);
    }
}
