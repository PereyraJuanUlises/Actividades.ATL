package Clase05;

import java.util.Scanner;

public class CalculadoraPerros {
    public static void main(String[] args) {
        Scanner ingreseDatos= new Scanner(System.in);
        System.out.println("Ingrese la  edad de su perro");
        Integer edad = ingreseDatos.nextInt();
        Integer edadPerro = edad*7;
        System.out.println("La edad en años perros es de : "+ edadPerro);
    }
}
