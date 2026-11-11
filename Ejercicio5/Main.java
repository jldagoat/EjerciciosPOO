package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro ("Toyota", 2023,4);
        Moto moto1 = new Moto("Yamaha", 2024, 150);

        carro1.mostrarInformacion();
        moto1.mostrarInformacion();
    } 
}
class Vehiculo {
    String marca;
    int modelo;

    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}class Carro extends Vehiculo {
    int numeroPuertas;

    public Carro(String marca, int modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    void mostrarInformacion() {
        System.out.println("CARRO");
        super.mostrarInformacion();
        System.out.println("Puertas: " + numeroPuertas);
    }
}
class Moto extends Vehiculo {
    int cilindraje;

    public Moto(String marca, int modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }
    @Override
    void mostrarInformacion() {
        System.out.println("MOTO");
        super.mostrarInformacion();
        System.out.println("Cilindraje: " + cilindraje+"cc");
    }
}