package trabalhandoComArray;

public class exemploArrays {
    public static void main(String[] args) {

        // Declaração e inicialização de um array de inteiros
        int[] numeros = new int[5];

        // Inicializando valores no array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Outra forma de inicializar
        int[] outrosNumeros = { 1, 2, 3, 4, 5 };

        // Exibindo todos os elementos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

    }
}