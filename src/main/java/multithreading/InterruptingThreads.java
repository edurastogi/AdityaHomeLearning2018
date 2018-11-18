package multithreading;

import java.util.Random;

public class InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting..");

        Runnable r = () -> System.out.println("Test");

        Thread t2 = new Thread(r);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random ran = new Random();
                for (int i = 0; i <1E8 ; i++) {
                    Math.sin(ran.nextDouble());
                }
            }
        });
        t1.start();

        Thread.sleep(500);
        t1.interrupt();

        t1.join();

        System.out.println("Finished.");

    }
}
