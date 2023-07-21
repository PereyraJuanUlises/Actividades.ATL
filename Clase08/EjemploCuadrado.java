package Clase08;

import java.util.Scanner;

public class EjemploCuadrado {
    public static void main(String[] args) {
        //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
        getAreaCuadrado();
    }
    private static void getAreaCuadrado(){
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("ingrese la medida del lado del cuadrado");
        int medidaLado = ingresoDato.nextInt();
        int area = medidaLado*medidaLado;
        System.out.println("el area es de : "+area);
    }
}
