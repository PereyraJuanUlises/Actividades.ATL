package Clase05;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        // ejercicio de calculadora de descuento
        Scanner ingreseDatos = new Scanner(System.in);
        System.out.println("");
        System.out.println("ingrese el precio original del producto");
        double precio = ingreseDatos.nextDouble();
        System.out.println("ingrese el porcentaje del descuento");
        double descuento=ingreseDatos.nextDouble();
        double precioFInal=precio - (precio*descuento/100);
        System.out.println("el precio final despues del descuento es de : "+precioFInal);
    }
}
