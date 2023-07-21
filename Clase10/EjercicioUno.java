package Clase10;

import Clase10.Clases.Persona;

import java.time.LocalDate;
import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("juantes");
        persona1.setDni(888);
        persona1.setFechaNacimiento(LocalDate.now());
        persona1.setEdad(22);
        Scanner ingresaDato = new Scanner(System.in);
        System.out.println(persona1.mostrarPersonas());
        //System.out.println(persona1.esMayor();
        if( persona1.esMayor()){
            System.out.println("es mayor");
        }else {
            System.out.println("es menor");
        }
    }
}
