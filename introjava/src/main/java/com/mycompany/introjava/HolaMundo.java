/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("ingrese tu nombre");
        
        nombre = leer.next();
        
        System.out.print("HOLA MUNDO! SOY "  + nombre + " y estoy programando en Java ");
        
        
        // TODO code application logic here
    }
    
}
