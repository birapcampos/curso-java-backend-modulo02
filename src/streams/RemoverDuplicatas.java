package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDuplicatas {
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango", "Banana");

        // Removendo duplicatas
        List<String> frutasUnicas = frutas.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Frutas únicas: " + frutasUnicas);
    }
}