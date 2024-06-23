package streams;

import java.util.Arrays;
import java.util.List;

public class ExemploReducao {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Somando todos os números - usando method reference
        int soma = numeros.stream()
                .reduce(0, Integer::sum);

        // ou Somando todos os números - lambda
        //int soma = numeros.stream()
        //        .reduce(0, (x,y) -> x + y);

        // Multiplicando todos os números
        // Como não existe um método análogo ao sum utilizamos lambda
        int multiplicacao = numeros.stream()
                .reduce(1, (x,y) -> x * y);

        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);

    }
}
