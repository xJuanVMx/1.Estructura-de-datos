import java.util.Scanner;

public class Datos3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes desea ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        String[] estudiantes = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = scanner.nextLine();
        }

        System.out.println("\nLista de estudiantes:");

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("- " + estudiantes[i]);
        }

        scanner.close();
    }
}
