package calculadoraVuelto;

import java.util.Scanner;

public class CalculadoraVuelto {
    public static void main(String[] args) {
        calculadoraDeCambio();
    }

    private static void calculadoraDeCambio() {
        float costoProducto,cantidadPagada;
        do{
            Scanner ingresoDatos = new Scanner(System.in);
            System.out.println("ingrese el costo del producto: ");
            costoProducto = ingresoDatos.nextFloat();

            System.out.println("ingrese la cantidad pagada: ");
            cantidadPagada = ingresoDatos.nextFloat();
            if(costoProducto<0 || cantidadPagada<0){
                System.out.println("recordar que no puede haber ni costo ni cantidad pagada NEGATIVA");
            }
        }while (costoProducto<0 || cantidadPagada<0);
        if(cantidadPagada>costoProducto){
            float cambioTotal = cantidadPagada - costoProducto;
            System.out.println("el cambio es : " + cambioTotal);
        }else {
            float cantidadFaltante = costoProducto-cantidadPagada;
            System.out.println("Me tenes que dar ¬¬: " + cantidadFaltante+ " mas");
        }
    }
}
