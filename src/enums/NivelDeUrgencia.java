package enums;

public enum NivelDeUrgencia {

    BAIXA(1), MEDIA(2), ALTA(3), CRITICA(4);

    private final int nivel;

    // Construtor
    private NivelDeUrgencia(int nivel) {
        this.nivel = nivel;
    }

    // Método getter
    public int getNivel() {
        return nivel;
    }
}
