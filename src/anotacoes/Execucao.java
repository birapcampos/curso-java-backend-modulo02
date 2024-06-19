package anotacoes;

import java.lang.reflect.Method;
public class Execucao {
    public static void main(String[] args) {

        UsandoAnotacaoTeste minhaClasse = new UsandoAnotacaoTeste();
        Class<?> classe = minhaClasse.getClass();

        for (Method metodo : classe.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(AnnotacaoTeste.class)) {
                AnnotacaoTeste anotacao = metodo.getAnnotation(AnnotacaoTeste.class);
                System.out.println("Descrição do método " + metodo.getName() + ": " + anotacao.descricao());
                try {
                    metodo.invoke(minhaClasse); // Invoca o método anotado
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
