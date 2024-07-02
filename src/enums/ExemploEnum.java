package enums;

public class ExemploEnum {
    public static void main(String[] args) {

        NivelDeUrgencia urgencia = NivelDeUrgencia.ALTA;

        switch (urgencia) {
            case BAIXA:
                System.out.println("Nível de urgência: BAIXA");
                break;
            case MEDIA:
                System.out.println("Nível de urgência: MEDIA");
                break;
            case ALTA:
                System.out.println("Nível de urgência: ALTA");
                break;
            case CRITICA:
                System.out.println("Nível de urgência: CRITICA");
                break;
        }

        System.out.println("Nível numérico: " + urgencia.getNivel());



    }
}
