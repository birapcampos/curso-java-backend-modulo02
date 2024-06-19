package listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        // Criando um ArrayList de Strings
        List<String> frutas = new ArrayList<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Acessando elementos
        System.out.println("Primeira fruta: " + frutas.get(0));

        // Removendo um elemento
        frutas.remove("Banana");

        // Iterando sobre os elementos
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + frutas.size());

    }
}
