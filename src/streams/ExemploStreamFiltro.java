package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamFiltro {
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango", "Banana");

        // Filtrando frutas que começam com 'M'
        List<String> frutasComM = frutas.stream()
                .filter(f -> f.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println("Frutas que começam com 'M': " + frutasComM);
    }
}
