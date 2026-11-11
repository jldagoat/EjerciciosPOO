package  Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.titular = "Jorge";
        cuenta1.saldo = 100000;

        cuenta1.depositar(50000);
        cuenta1.retirar(30000);
        cuenta1.mostrarSaldo();
    }
}
class CuentaBancaria {
    String titular;
    double saldo;

    void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado: $" + cantidad);
        } else {
            System.out.println("Cantidad inválida para depositar.");
        }
    }
    void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado: $" + cantidad);
        } else {
            System.out.println("saldo insuficiente o cantidad inválida para retirar.");
        }
    }
    void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }
}