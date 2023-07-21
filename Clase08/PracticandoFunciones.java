package Clase08;

public class PracticandoFunciones {
    public static void main(String[] args) {
        calcularPrecioFinal("Pantalon",100,20);
    }
    public static void calcularPrecioFinal(String nombre , double precio , double descuento){
       double precioFinal = precio - (precio*descuento)/100;
        System.out.println("el producto "+ nombre + " tiene un precio de $"+precioFinal);
    }
}
