package enums;

public class ExemploEnum2 {
    public static void main(String[] args) {

        for (NivelDeUrgencia n : NivelDeUrgencia.values()) {
            System.out.println(n + " - " + n.getNivel());
        }

        NivelDeUrgencia urgencia = NivelDeUrgencia.valueOf("CRITICA");
        System.out.println("Urgência: " + urgencia);

    }
}
