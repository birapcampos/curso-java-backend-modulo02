package designPattern.singleton;
public class Execucao {
    public static void main(String[] args) {
        // Obter a instância única do Singleton
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();

        // Chamar um método da instância Singleton
        singleton1.mostrarMensagem();

        // Verificar se as duas referências apontam para a mesma instância
        System.out.println("singleton1 == singleton2? " + (singleton1 == singleton2));
    }
}
