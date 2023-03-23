/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciccio3;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Ejerciccio3 {

    public static void main(String[] args) {
        /*
        System.out.println("Ingrese su frase: ");
        Scanner texto = new Scanner (System.in);
        String frase= texto.nextLine ();
        System.out.println("La frase ingrsado es: "+frase);
        String fraseM = toUpperCase(frase);
        String frasem = toLowerCase(frase);
        System.out.println("En mayusculas: "+fraseM);
        System.out.println("En mayusculas: "+frasem);
    }

    private static String toUpperCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static String toLowerCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

   Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int valorInicial, resultado, contador = 1;
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor de la posicion " + "(" + i + "," + j + ")");
                matriz[i][j] = leer.nextInt();
            }
        }

        valorInicial = sumaFilas(matriz, n, 0);
        System.out.println("La suma de la fila 0 es " + valorInicial);
        for (int i = 1; i < n; i++) {
            resultado = sumaFilas(matriz, n, i);
            //System.out.println("La suma de la fila " + i + " es " + resultado);
            if (resultado == valorInicial) {
                contador++;
            }
        }
   for (int j = 0; j < n; j++) {
            resultado = sumaColumnas(matriz, n, j);
            //System.out.println("La suma de la columna " + j + " es " + resultado);
            if (resultado == valorInicial) {
                contador++;
            }
        }

        resultado = sumaDiagonal(matriz, n);
        if (resultado == valorInicial) {
            contador++;
        }

        resultado = sumaDiagonalInv(matriz, n);
        if (resultado == valorInicial) {
            contador++;
        }

        if (contador == n + n + 2) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
     //System.out.println(contador);
    }

    public static int sumaFilas(int[][] _matriz, int n, int fila) {
        int valor = 0;
        for (int j = 0; j < n; j++) {
            valor += _matriz[fila][j];
        }
        return valor;
    }

    public static int sumaColumnas(int[][] _matriz, int n, int columna) {
        int valor = 0;
        for (int i = 0; i < n; i++) {
            valor += _matriz[i][columna];
        }
        return valor;
    }

    public static int sumaDiagonal(int[][] _matriz, int n) {
        int valor = 0;
        for (int i = 0; i < n; i++) {
            valor += _matriz[i][i];
        }
        return valor;
          }

    public static int sumaDiagonalInv(int[][] _matriz, int n) {
        int valor = 0, j = 0;
        for (int i = n - 1; i >= 0; i--) {
            valor += _matriz[i][j];
            j++;
        }
        return valor;
    }

        int contador = 0;
        int contador2 = 0;
        int[] vectorA = new int[5];
        int[] vectorB = new int[5];
        do {

            for (int i = 0; i < 5; i++) {
                vectorA[i] = (int) (Math.random() * 10);
                vectorB[i] = (int) (Math.random() * 10);
                if (vectorA[i] != vectorB[i]) {
                    break;

                } else {
                    contador++;
                }
            }
            if (contador == 5) {
                System.out.println("Los vectores son iguales" + "se intento " + contador2 + "veces");
            } else {

                contador2++;

            }
        } while (contador != 5);
    
      
     Scanner leer = new Scanner(System.in);

        int n;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        vector = llenar(n);
        
        mostrar(vector, n);
    }

    public static int[] llenar(int n) {
        int[] _vector = new int[n];
        for (int i = 0; i < n; i++) {
            _vector[i]=(int)(Math.random()*10);
        }
        return _vector;
    }
    
    public static void mostrar(int[] _vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(_vector[i] + " ");
        }
        System.out.println("");
     */      
        
      //ejercicio4
     // int[] vector = new int [10];
     int vector[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("ingrese el numero de alumno");
        int alumno=0;
        Scanner sc = new Scanner(System.in);
        alumno= sc.nextInt();
        for (int i = 0 ; i < 10; i++) {
            System.out.println("Ingrese la nota del tp evaluativo");
           int notaTp1= sc.nextInt();
            System.out.println("Ingrese la nota del tp2 evaluativo");
           int notaTp2= sc.nextInt();
            System.out.println("ingrese la nota del 1er integrador");
            int integrador= sc.nextInt();
            System.out.println("Ingrese la nota del 2do integrador");
            int integrador2= sc.nextInt();
            
            
        }
    }
    
           

        
            
        
    }
    
            
        }
        
        
    

    
    
}
    
    
}
