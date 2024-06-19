package interfaces;
public class ExemploInterface {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom(); // Deve imprimir "Au au!"
        gato.fazerSom(); // Deve imprimir "Miau!"
    }
}
