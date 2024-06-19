package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploMapeamento {

    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango", "Banana");

        // Convertendo todos os nomes de frutas para maiúsculas
        List<String> frutasMaiusculas = frutas.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Frutas em maiúsculas: " + frutasMaiusculas);

    }
}
