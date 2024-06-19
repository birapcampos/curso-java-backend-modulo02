package streams;

import java.util.Arrays;
import java.util.List;

public class ExemploReducao {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Somando todos os números
        int soma = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("Soma dos números: " + soma);
    }
}
