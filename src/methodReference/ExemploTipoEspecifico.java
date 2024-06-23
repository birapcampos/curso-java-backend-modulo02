package methodReference;

import java.util.function.Function;

public class ExemploTipoEspecifico {
    public static void main(String[] args) {
        // Cria uma instância de Function<String, Integer> usando uma expressão lambda
        Function<String, Integer> converter = str -> Integer.parseInt(str);

        // Usa a função para converter uma String em um Integer
        Integer numero = converter.apply("123");
        System.out.println("Número convertido: " + numero);
    }
}
