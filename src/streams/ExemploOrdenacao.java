package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploOrdenacao {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango", "Banana");

        // Ordenando frutas em ordem alfabética
        List<String> frutasOrdenadas = frutas.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Frutas ordenadas: " + frutasOrdenadas);
    }

}
