package generics;

public class Execucao {
    public static void main(String[] args) {

        Caixa<Integer> caixaInteiro = new Caixa<>();
        caixaInteiro.setConteudo(10);
        System.out.println("Conteúdo da caixa: " + caixaInteiro.getConteudo());

    }
}
