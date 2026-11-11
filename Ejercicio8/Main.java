public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Estudiante estudiante1 = new Estudiante("Jorge", 18);

        Prestamo prestamo1 = new Prestamo(estudiante1, libro1);

        prestamo1.mostrarPrestamo();
    }
}
class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
class Prestamo {
    Estudiante estudiante;
    Libro libro;
    
    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
    }
    void mostrarPrestamo() {
        System.out.println("=== PRESTAMO DE BIBLIOTECA ===");
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("Edad: " + estudiante.edad);
        System.out.println("Libro: " + libro.titulo);
        System.out.println("Autor: " + libro.autor);
        System.out.println("Prestamo realizado correctamente.");
    }
}