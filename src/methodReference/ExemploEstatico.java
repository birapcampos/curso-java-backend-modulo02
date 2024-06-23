package methodReference;

public class ExemploEstatico {
    public static void main(String[] args) {
        // Method reference para o método estático Integer.parseInt
        // Equivalente a: (str) -> Integer.parseInt(str)
        Converter<String, Integer> converter = Integer::parseInt;

        Integer numero = converter.convert("123");
        System.out.println("Número convertido: " + numero);
    }

    interface Converter<F, T> {
        T convert(F from);
    }
}
