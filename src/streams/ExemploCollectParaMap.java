package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploCollectParaMap {
    public static void main(String[] args) {

        // Coletando em um map
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango");

        // Coletando em um map com o nome da fruta como chave e o comprimento como valor
        Map<String, Integer> frutasMap = frutas.stream()
                .collect(Collectors.toMap(f -> f, String::length));

        System.out.println("Map de frutas: " + frutasMap);

    }
}

