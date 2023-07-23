package amigoInvisible;

import java.util.Scanner;

public class AmigoInvisibleEjercicio {
    public static void main(String[] args) {
        jugarAmigoSecreto();
    }

    private static void jugarAmigoSecreto() {
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("cuantas personas van a jugar: ");
        int cantidadPersonas = ingresoDatos.nextInt();
        String [] listaPersonas = new String[cantidadPersonas];
        ingresarNombreJugadores(ingresoDatos, cantidadPersonas, listaPersonas);
        String [] elegido = new String[cantidadPersonas];
        listaElegidos(cantidadPersonas, listaPersonas, elegido);
        mostrandoResultados(ingresoDatos, cantidadPersonas, listaPersonas, elegido);
    }

    private static void mostrandoResultados(Scanner ingresoDatos, int cantidadPersonas, String[] listaPersonas, String[] elegido) {
        for(int i = 0; i < cantidadPersonas; i++){
            String nombre = listaPersonas[i];
            String nombreElegido = elegido[i];
            System.out.println("que " + nombre  + " se acerque a la computadora y presione cualquier tecla para continuar");
            ingresoDatos.next();
            System.out.println("le tienes que hacer un regalo a "+ nombreElegido + " toca cualquier letra para continuar ");
            ingresoDatos.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    private static void listaElegidos(int cantidadPersonas, String[] listaPersonas, String[] elegido) {
        for(int j = 0; j< cantidadPersonas; j++){
            int indiceListaPersona = j+1;
            if(indiceListaPersona>= cantidadPersonas){
                indiceListaPersona = 0;
            }
            elegido[j]= listaPersonas[indiceListaPersona];
        }
    }

    private static void ingresarNombreJugadores(Scanner ingresoDatos, int cantidadPersonas, String[] listaPersonas) {
        for(int i = 0; i< cantidadPersonas; i++){
            System.out.println("ingrese el nombre de las persona a jugar: ");
            String nombrePersona = ingresoDatos.next();
            listaPersonas[i]= nombrePersona;
        }
    }
}
