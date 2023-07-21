package Clase06;

import java.util.Scanner;

public class BuscadorTweets {
    public static void main(String[] args) {
        Scanner ingreseDatos = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario de Twitter que desea ver sus publicaciones");
        String usuarioTwitter = ingreseDatos.nextLine();
        System.out.println("Haga click en el siguiente link para ver que anda sucediendo con la persona que usted eligio: https://twitter.com/search?q="+usuarioTwitter);
    }
}
