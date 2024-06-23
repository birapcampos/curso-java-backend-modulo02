package programacaoFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploProgFuncional {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Dobrar cada número usando map
        List<Integer> numerosDobrados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());
        System.out.println("Números dobrados: " + numerosDobrados);

        // Filtrar números pares usando filter
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);
    }
}
