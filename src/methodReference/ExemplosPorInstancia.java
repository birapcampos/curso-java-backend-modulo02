package methodReference;

public class ExemplosPorInstancia {
    public static void main(String[] args) {
        String prefixo = "Prefixo: ";
        // Method reference para o método de instância concat da String prefixo
        // Equivalente a: (str) -> prefixo.concat(str)
        Concatenador concatenador = prefixo::concat;

        String resultado = concatenador.concat("Texto");
        System.out.println("Resultado: " + resultado);
    }

    interface Concatenador {
        String concat(String str);
    }
}
