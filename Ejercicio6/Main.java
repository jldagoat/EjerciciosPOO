package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        Animal animal3 = new Vaca();

        animal1.hacerSonido();
        animal2.hacerSonido();
        animal3.hacerSonido();
    }
}
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: Guau guau!");
    }
}
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla: Miau miau!");
    }
}
class Vaca extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("La vaca muge: Muuu!");
    }
}