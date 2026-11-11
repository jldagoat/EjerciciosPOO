package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorge", 18, 2000000);

        empleado1.mostrarInformacion();
        empleado1.setEdad(19);

        System.out.println("Edad actualizada: " + empleado1.getEdad());
    }
}
class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
        }
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }
}