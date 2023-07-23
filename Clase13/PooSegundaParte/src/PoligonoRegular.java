import java.util.Scanner;

public abstract class PoligonoRegular extends Figura{
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos(){
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("ingewsa la altura en cm");
        altura = ingresoDatos.nextInt();
        System.out.println("ingerse la base en cm");
        base = ingresoDatos.nextInt();
    }
}
