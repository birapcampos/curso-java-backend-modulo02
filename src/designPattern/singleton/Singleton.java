package designPattern.singleton;
public class Singleton {

    // Instância única da classe Singleton
    private static Singleton instanciaUnica;

    // Construtor privado para evitar instâncias diretas
    private Singleton() {}

    // Método público estático para obter a instância única
    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Método de exemplo para demonstrar o funcionamento do Singleton
    public void mostrarMensagem() {
        System.out.println("Instância única do Singleton.");
    }
}