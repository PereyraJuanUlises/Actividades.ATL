package interesCompuesto;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        calculadoraInteresesCompuestos();
    }

    private static void calculadoraInteresesCompuestos() {
        float capital = ingresoCapital();
        float interes = ingresarInteres();
        float interesASumar = (capital*interes)/100;
        float capitalConInteres = capital + interesASumar;
        System.out.println("En un principio usted ingreso : " + capital + " de capital , y con un interes anual de : "+interes+"% , su capital luego de un año es de : "+capitalConInteres);
    }

    private static float ingresoCapital() {
        Scanner ingresoDatos = new Scanner(System.in);
        float capital;
        do{
            System.out.println("ingrese su capital inicial : ");
            capital = ingresoDatos.nextFloat();
            if(capital<0){
                System.out.println("Por favor recordar que el capital NO puede ser negativo");
            }
        }while (capital<=0);
        return capital;
    }

    private static float ingresarInteres() {
        Scanner ingresoDatos = new Scanner(System.in);
        float interes;
        do{
            System.out.println("ingrese el interes anual");
            interes = ingresoDatos.nextFloat();
            if (interes<0 || interes>100){
                System.out.println("recordar que cuando hablamos de interes tiene que estar entre 0 y 100");
            }
        }while (interes<0 || interes>100);
        return interes;
    }
}
