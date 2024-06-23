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

        // Filtrando numeros pares
        List<Integer> numeros = Arrays.asList(1,3,5,11,12,16,20,21);

        List<Integer> numerosPares = numeros.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Lista com os números pares: " + numerosPares);

    }
}
