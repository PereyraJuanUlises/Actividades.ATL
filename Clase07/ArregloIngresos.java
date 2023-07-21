package Clase07;

import java.util.Scanner;

public class ArregloIngresos {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);
        int contador=0;
        float sumador=0;
        int [] numeros = new int[5];
        for (int i = 0 ; i <numeros.length;i++){
            System.out.println("ingrese un numero: ");
            numeros[i]=ingresoDatos.nextInt();
            sumador=sumador+numeros[i];
        }
        int numMayor = numeros[0];
        int numMenor = numeros[0];
        for(int i = 0 ; i < numeros.length;i++){
            if(numeros[i]>numMayor){
                numMayor= numeros[i];
            }
            if(numeros[i] < numMenor){
                numMenor = numeros[i];
            }
        }
        while (contador < numeros.length){
            System.out.println("posicion " +(contador+1)+ " es el numero : "+numeros[contador]);
            contador++;
        }
        System.out.println("el numero mayor es: "+numMayor +"\nEl numero menor es: "+numMenor+"\nel promedio es de: "+ ((float)sumador/numeros.length));
    }
}
