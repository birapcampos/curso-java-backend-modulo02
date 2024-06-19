package usandothreads;

public class ExemploThreads {
    public static void main(String[] args) {

        MinhaThread thread1 = new MinhaThread();
        System.out.println();
        MinhaThread thread2 = new MinhaThread();

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new MinhaRunnable());
        Thread thread4 = new Thread(new MinhaRunnable());
        System.out.println();
        thread3.start();
        thread4.start();

    }
}

class MinhaThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Valor: " + i);
            try {
                Thread.sleep(1000); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MinhaRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " - Valor:  " + i);
            try {
                Thread.sleep(1000); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
