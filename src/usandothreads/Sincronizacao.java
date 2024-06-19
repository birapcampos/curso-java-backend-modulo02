package usandothreads;

public class Sincronizacao{
    public static void main(String[] args) {

        Contador contador = new Contador();
        Thread thread1 = new Thread(new MinhaRunnableSync(contador));
        Thread thread2 = new Thread(new MinhaRunnableSync(contador));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Contador final: " + contador.getCount());

    }
}

class Contador {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}
class MinhaRunnableSync implements Runnable {
    private Contador contador;

    public MinhaRunnableSync(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            contador.increment();
        }
    }
}

