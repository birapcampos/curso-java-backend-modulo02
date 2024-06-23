package interfaceFuncional;

import java.util.Arrays;
import java.util.List;

public class ExemploCompleto {
    public static void main(String[] args) {

            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            // Usando uma interface funcional Predicate com uma expressão lambda
            numeros.stream()
                    .filter(numero -> numero % 2 == 0) // Filtra os números pares
                    .forEach(System.out::println); // Imprime os números pares

            // Usando uma interface funcional Function com uma expressão lambda
            numeros.stream()
                    .map(numero -> numero * 2) // Dobra cada número
                    .forEach(System.out::println); // Imprime os números dobrados
    }



}
