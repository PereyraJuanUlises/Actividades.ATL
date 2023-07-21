package Clase09;

import java.util.Scanner;

public class NombreCompletos {
    public static void main(String[] args) {
        //crea un programa que tenga un arreglo con nombres de personas completo.
        //2) ademas debe permitir realizar una busqueda por el nombre de la persona
        String [] nombresCompletos=new String[2];
        for(int i = 0 ; i<nombresCompletos.length;i++){
            System.out.println("ingrese nombre");
            Scanner ingreseNombre = new Scanner(System.in);
            String nombre = ingreseNombre.nextLine();
            nombresCompletos[i]= nombre;
        }
        for(String elementos : nombresCompletos){
            System.out.println(elementos);
        }

    }
}
