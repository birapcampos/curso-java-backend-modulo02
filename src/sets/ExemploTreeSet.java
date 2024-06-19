package sets;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        Set<String> frutas = new TreeSet<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Exibindo elementos (em ordem natural)
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

    }
}
