package gerarChaveUnica;

public class ChaveUnica {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            GeraChaveUnica geraChaveUnica = new GeraChaveUnica();
            System.out.println("Unique key: " + geraChaveUnica.getUUID(5));

            /*
            try {
                Thread.sleep(1); // Pausa de 1 milissegundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             */
        }
    }
}


