public class Datos1 {

    public static void main(String[] args) {

        int[] notas = {3, 4, 5, 2};

        System.out.println("Notas del estudiante:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}
