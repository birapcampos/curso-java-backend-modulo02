package maps;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("João", 7);
        notas.put("Maria", 8);
        notas.put("Pedro", 9);
        System.out.println("Nota de João: " + notas.get("João"));

    }
}
