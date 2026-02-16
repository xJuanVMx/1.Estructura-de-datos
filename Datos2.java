import java.util.ArrayList;

public class Datos2 {

    public static void main(String[] args) {

        ArrayList<String> materias = new ArrayList<>();

        materias.add("Matemáticas");
        materias.add("Programación");
        materias.add("Inglés");

        System.out.println("Materias inscritas: \n");

        for (int i = 0; i < materias.size(); i++) {
            System.out.println("- " + materias.get(i));
        }
    }
}
