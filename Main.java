// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        int opcion = scanner.nextInt();

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

      

        scanner.close();
    }
}

