package sets;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        Set<String> frutas = new HashSet<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Tentativa de adicionar um elemento duplicado

        // Exibindo elementos
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // Verificando se contém um elemento
        if (frutas.contains("Banana")) {
            System.out.println("A coleção contém Banana");
        }

        // Removendo um elemento
        frutas.remove("Laranja");

        // Verificando o tamanho da coleção
        System.out.println("Tamanho da coleção: " + frutas.size());
    }

}

