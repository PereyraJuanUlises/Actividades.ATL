package Clase05;

import java.util.Scanner;

public class ConversorMillasAKm {
    public static void main(String[] args) {
        //conversor de millas a km
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("ingrese una distancia en millas: ");
        Double millas = ingresoDatos.nextDouble();
        Double kilometros= millas*1.60934;
        System.out.println("la cantidad de millas que ingreso fue de: "+millas + " que serian "+kilometros +" kilometros");
    }
}
