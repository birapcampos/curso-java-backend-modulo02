package arraysMultidimensional;

public class ExemploArrayMulti {
    public static void main(String[] args) {

        // Declaração de um array 2D
        int[][] matriz = new int[2][3];

        // Inicialização de um array 2D
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        matriz[1][0]=4;
        matriz[1][1]=5;
        matriz[1][2]=6;

        // Acessando elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento na posição [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
