package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jorge", 18, "Ingeniería de software");
        estudiante1.mostrarInformacion();
    }
}
class Estudiante {
    String nombre;
    int edad;
    String carrera;

    Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}