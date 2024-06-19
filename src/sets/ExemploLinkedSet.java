package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedSet {
    public static void main(String[] args) {

        Set<String> frutas = new LinkedHashSet<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Exibindo elementos (na ordem de inserção)
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

    }
}
