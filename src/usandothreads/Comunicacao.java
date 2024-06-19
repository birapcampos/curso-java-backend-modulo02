package usandothreads;

public class Comunicacao {
    public static void main(String[] args) throws InterruptedException {

        Processador processador = new Processador();

        Thread threadProdutor = new Thread(() -> {
            try {
                processador.produzir();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadConsumidor = new Thread(() -> {
            try {
                processador.consumir();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadProdutor.start();
        threadConsumidor.start();
        threadProdutor.join();
        threadConsumidor.join();
    }
}


class Processador {

    public void produzir() throws InterruptedException {
        synchronized (this) {
            System.out.println("Produtor está produzindo...");
            wait();
            System.out.println("Produtor retomou.");
        }
    }

    public void consumir() throws InterruptedException {
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Consumidor está consumindo...");
            notify();
            Thread.sleep(1000);
        }
    }
}
