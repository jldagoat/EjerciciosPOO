package Ejercicio7;

public class Main {
    public static void main (String[] args) {

        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.mostrarArea();
        figura2.mostrarArea();
    }
}
abstract class Figura {
    abstract double calcularArea();

    void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}
class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
class Rectangulo extends Figura {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}