package threads3_1;


public class Release extends Thread {

    private Semaphore semaphore;
    private boolean chrck;

    public Release(boolean chrck, Semaphore semaphore) {
        this.chrck = chrck;
        this.semaphore = semaphore;
    }


    @Override
    public void run() {


            System.out.println(" start");
            try {

                semaphore.acquire();
                System.out.println(" try to acquire");
                for (int i = 0; i < 10; i++) {
                    if (chrck) {
                        Points.reduPoint();
                    }else {
                        Points.addPoint();
                    }
                }
                    Thread.sleep(100);
                    System.out.println(" sleep");
                }catch(InterruptedException e){
                    e.printStackTrace();


                    semaphore.release();
                    System.out.println(" stop");
                }

            }
    }
