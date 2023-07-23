import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Figura> figuras = new ArrayList<>();
    public static void main(String[] args) {
        boolean mostrarMenu = true;
        do {
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("***menu*** \n1) crear figur\n2) mostrar la sumatoria de areas de las figuras\n0)salir");
        int respuestaPrincipal = ingresoDatos.nextInt();
        if(respuestaPrincipal == 1){
            crearFigura();
        }
        if(respuestaPrincipal == 2){
            mostrarSumatoria();
        }
        if(respuestaPrincipal == 0 ){
            mostrarMenu = false;
        }
        }while (mostrarMenu);
    }
    private  static void mostrarSumatoria(){
        double sumatoriasAreas = 0;
        for(Figura elementos : figuras){
            sumatoriasAreas+=elementos.calcularArea();
        }
        System.out.println("la sumatoria de areas de las figuras es: "+ sumatoriasAreas);
    }

    private static void crearFigura() {
        int sumatoria=0;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("que figura desea crear?\n1) Circulo\n2) Rectangulo\n3) Triangulo");
        int figuraElegida=ingresoDatos.nextInt();

        if(figuraElegida == 1){
            Circulo circulo = new Circulo();
            System.out.println("el area total es "  + circulo.calcularArea(circulo.cargarDatos()));
            figuras.add(circulo);
        }

        if(figuraElegida == 2){
           Rectangulo rectangulo = new Rectangulo();
           rectangulo.cargarDatos();
            System.out.println("el area total es "  + rectangulo.calcularArea());
            figuras.add(rectangulo);
        }
        if(figuraElegida == 3){
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("el area total es : "+ triangulo.calcularArea());
            figuras.add(triangulo);
        }
    }
}