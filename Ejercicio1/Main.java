public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Jorge";
        persona1.edad = 17;

        persona1.presentarse();
    }
}
class Persona {
    String nombre;
    int edad;

    void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
