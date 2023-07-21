package Clase05;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        //ejercicio de propina
        Scanner ingreseDatos = new Scanner(System.in);
        System.out.println("ingrese el total de la cuenta");
        double totalCuenta = ingreseDatos.nextDouble();
        System.out.println("ingrese el porcentaje de propina que desea dejar ");
        double porcentajePropina = ingreseDatos.nextDouble();
        double propinaCalculada= totalCuenta * (porcentajePropina/100);
        double totalAPagar = totalCuenta + propinaCalculada;
        System.out.println("el total que debe abonar con propina incluida es de : "+totalAPagar);
    }
}
