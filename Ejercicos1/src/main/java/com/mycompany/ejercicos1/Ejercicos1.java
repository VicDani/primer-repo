/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicos1;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Ejercicos1 {

    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1= entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2= entrada.nextInt();
        int suma = num1+num2;
         System.out.println("La suma de los numeros ingresados es:"+suma);
    }
}
