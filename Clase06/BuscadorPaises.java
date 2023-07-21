package Clase06;

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {
        Scanner ingreseDatos = new Scanner(System.in);
        System.out.println("Ingrese un paìs que usted quiera");
        String pais = ingreseDatos.nextLine();
        System.out.println("La buicacion de su pais en google maps esta en el siguiente link: https://www.google.com/maps/search/"+pais);
    }
}
