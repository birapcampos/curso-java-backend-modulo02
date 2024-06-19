package anotacoes;
public class UsandoAnotacaoTeste {
    @AnnotacaoTeste(descricao = "Este é o primeiro método de teste.")
    public void metodoTeste1() {
        System.out.println("Executando metodoTeste1");
    }
    @AnnotacaoTeste(descricao = "Este é o segundo método de teste.")
    public void metodoTeste2() {
        System.out.println("Executando metodoTeste2");
    }
    public void metodoNormal() {
        System.out.println("Executando metodoNormal");
    }
}
