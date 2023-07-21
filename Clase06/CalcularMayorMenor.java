package Clase06;

import java.util.Scanner;

public class CalcularMayorMenor {
    public static void main(String[] args) {
        Scanner ingresaDatos = new Scanner(System.in);
        int numeroMenor = 0;
        int numeroMayor= 0;
        for (int i = 0 ; i<3;i++){
            System.out.println("ingrese un numero en la posicion : "+(i+1));
            int numeroTemporal = ingresaDatos.nextInt();
            if(i==0){
                numeroMenor=numeroTemporal;
                numeroMayor=numeroTemporal;
            } else if (numeroTemporal<numeroMenor) {
                numeroMenor=numeroTemporal;
            }
            if(numeroTemporal>numeroMayor){
                numeroMayor=numeroTemporal;
            }
        }
        System.out.println("el numero menor es el : "+numeroMenor + " el numero mayor es: "+numeroMayor);
    }
}
