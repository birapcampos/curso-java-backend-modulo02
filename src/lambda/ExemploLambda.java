package lambda;

public class ExemploLambda {
    public static void main(String[] args) {
        // Expressão lambda para somar dois números
        OperacaoMatematica soma = (a, b) -> a + b;
        System.out.println("Soma: " + soma.operacao(5, 3));
    }
}

interface OperacaoMatematica {
    int operacao(int a, int b);
}

