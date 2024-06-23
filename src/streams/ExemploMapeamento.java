package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploMapeamento {

    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maca", "Banana", "Laranja", "Morango", "Banana");

        // Convertendo todos os nomes de frutas para maiúsculas
        List<String> frutasMaiusculas = frutas.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Frutas em maiúsculas em um List: " + frutasMaiusculas);

        // Convertendo todos os nomes de frutas para maiúsculas e coletando em um Map
        Map<String, String> frutasMaiusculasMap = frutas.stream()
                .collect(Collectors.toMap(
                        f -> f,              // Chave é a fruta original
                        String::toUpperCase, // Valor é a fruta em maiúsculas
                        (existingValue, newValue) -> existingValue // Merge function, mantém o valor existente
                ));

        System.out.println("Frutas em maiúsculas em um Map: " + frutasMaiusculasMap);

        // Gera uma sequência de Fibonacci usando streams
        int numeroDeElementos = 10;

        Stream<Long> fibonacciStream = Stream.iterate(new long[]{0, 1},
                        p -> new long[]{p[1], p[0] + p[1]})
                .limit(numeroDeElementos)
                .map(p -> p[0]);

        // Imprime a sequência de Fibonacci
        System.out.println("Saída Fibonacci : " + Arrays.toString(
                fibonacciStream.toArray()));

    }
}
