import java.util.Scanner;

public class Circulo extends Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double cargarDatos() {
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("ingrese el radio en cm :");
        double radio = ingresoDatos.nextDouble();
        return radio;
    }

    public double calcularArea(double radio){
        double pi =Math.PI;
        double area = pi*(radio*radio);
        return area;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
