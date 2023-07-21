package Clase06;

import java.util.Scanner;

public class LlamarPersona {
    public static void main(String[] args) {
        Scanner ingreseDatos = new Scanner(System.in);
        System.out.println("ingrese el numero de telefono al que usted quiere llamar (SIN ESPACIOS)");
        String numero = ingreseDatos.nextLine();
        System.out.println("para llamar a la persona que usted puso el numero toque click en el siguiente enlace: https://api.whatsapp.com/send?phone="+numero);
    }
}
