package Clase08;

import java.util.Scanner;

public class EjemploUno {
    public static void main(String[] args) {
    //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos. Luego mostrar mayor y menor
        int [] numeros = new int[5];
        ingresoNumeros(numeros);
        mostrarNumeros(numeros);
        mostrarMayorNumero(numeros);
        mostrarMenorNumero(numeros);
        mostrarPromedio(numeros);
    }
    //------------------------------------FUNCIONES--------------------------------------------
    private static void ingresoNumeros(int [] numeros){
        Scanner ingresoDeNumeros = new Scanner(System.in);
        for (int i = 0 ; i<numeros.length ; i++){
            System.out.println("ingrese el numero que quiera");
            int num = ingresoDeNumeros.nextInt();
            numeros[i]=num;
        }
    }
    private static void mostrarNumeros(int [] numeros){
        System.out.println("los numeros ingresados son");
        for (int elementos : numeros){
            System.out.println(elementos);
        }
    }
    private static void mostrarMayorNumero(int [] numeros){
        int mayorNumero= numeros[0];
        for(int i = 0 ; i<numeros.length ; i++){
            if(numeros[i]>mayorNumero){
                mayorNumero=numeros[i];
            }
        }
        System.out.println("el numero mayor es el: "+mayorNumero);
    }
    private static void mostrarMenorNumero(int [] numeros){
        int menorNumero=numeros[1];
        for (int j = 0 ; j<numeros.length;j++){
            if(numeros[j]<menorNumero){
                menorNumero=numeros[j];
            }
        }
        System.out.println("el menor numero es el: "+menorNumero);
    }
    private static void mostrarPromedio(int [] numeros){
        int acumulador = 0;
        for(int num : numeros){
            acumulador+=num;
        }
        System.out.println("el promedio es de: "+((float)acumulador/numeros.length));
    }
}
