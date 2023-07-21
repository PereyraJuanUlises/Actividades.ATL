package Clase06;

import java.util.Scanner;

public class PropiaHistoria {
    public static void main(String[] args) {
        Scanner ingresoDatos=new Scanner(System.in);
        int primerEleccion;
        int segundaEleccion;
        System.out.println("vas a crear tu propia historia tener en cuenta que solo se pueden usar 1 y 2");
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        do{
            primerEleccion=ingresoDatos.nextInt();
        }while (primerEleccion<1 || primerEleccion>2);
        if(primerEleccion == 2){
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n1) Entras por la puerta de la izquierda \n2) Optas por la puerta de la derecha\n");
        }else{
            System.out.println("el susurro queres que deje de sonar? \n1) si \n2)no");
        }
        do{
            segundaEleccion=ingresoDatos.nextInt();
        }while (segundaEleccion<1 || segundaEleccion>2);
        if(primerEleccion == 2 && segundaEleccion == 1){
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!\n");
        }
        if (primerEleccion == 2 && segundaEleccion == 2){
            System.out.println("el cuento termina aca");
        }
        if (primerEleccion == 1 && segundaEleccion == 1) {
            System.out.println("se termino todo el ruido");
        }
        if (primerEleccion == 1 && segundaEleccion == 2){
            System.out.println("el ruido seguire eternamente");
        }
    }
}