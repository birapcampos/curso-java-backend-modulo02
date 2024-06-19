package designPattern.factotyMethod;
public class Execucao {
    public static void main(String[] args) {
        Criador criadorA = new CriadorConcretoA();
        Criador criadorB = new CriadorConcretoB();

        criadorA.algumMetodo();  // Deve usar ProdutoConcretoA
        criadorB.algumMetodo();  // Deve usar ProdutoConcretoB
    }
}
