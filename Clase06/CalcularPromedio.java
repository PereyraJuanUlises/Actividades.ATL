package Clase06;

import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);
        int acumulador=0;
        for(int i = 0 ; i<3;i++){
            System.out.println("ingrese un numero");
            int numero = ingresoDatos.nextInt();
            acumulador=acumulador+numero;
        }
        float promedio =(float) acumulador/3;
        System.out.println("el promedio es de : "+promedio);
    }
}
