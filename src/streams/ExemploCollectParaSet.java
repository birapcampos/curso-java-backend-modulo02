package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemploCollectParaSet {
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango", "Banana");

        // Coletando em um set (removendo duplicatas)
        Set<String> frutasSet = frutas.stream()
                .collect(Collectors.toSet());

        System.out.println("Set de frutas: " + frutasSet);
    }
}
