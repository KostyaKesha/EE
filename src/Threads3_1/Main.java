package Threads3_1;


public class Main {
    public static void main(String[] args)throws InterruptedException  {
        Semaphore semaphore = new Impl(10);


        new Release(true,semaphore).start();

        Thread.sleep(100);

        new Release(false,semaphore).start();

    }


    }

