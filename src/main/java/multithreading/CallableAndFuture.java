package multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        /*executor.submit(new Runnable(){
            @Override
            public void run() {
                Random random = new Random();
                int duration = random.nextInt(4000);
                System.out.println("Starting...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished.");
            }
        });*/

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call()   {
                Random random = new Random();
                int duration = random.nextInt(4000);
               /* if (duration > 2000) {
                    throw new IOException("Sleeping for too long..");
                }*/

                System.out.println("Starting...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished.");
                return duration;

            }
        });

        Future<?> futureVoid = executor.submit(new Callable<Void>() {
            @Override
            public Void call()  {
                Random random = new Random();
                int duration = random.nextInt(4000);
                /*if (duration > 2000) {
                    throw new IOException("Sleeping for too long..");
                }*/

                System.out.println("Starting...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished.");
                return null;

            }
        });

        executor.shutdown();

        try {
            System.out.println("Result is: " + future.get()); //get will block
            System.out.println("Result from Void Futures Call is : " + futureVoid.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            IOException ex = (IOException) e.getCause();
            System.out.println(ex.getMessage());
            System.out.println(e);
        }
    }
}
