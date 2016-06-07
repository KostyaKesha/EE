package threads3_1;


public class Impl implements Semaphore {
    private int permite;


    public Impl(int permite) {
        if (permite < 0) {
            throw new IllegalArgumentException(permite + "Less than 0");
        }
        this.permite = permite;
    }


    @Override
    public void acquire() throws InterruptedException {
    synchronized (this){
        while (permite==0){
            this.wait();
        }
        permite--;
    }
    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        synchronized (this){
            while (permite<permits){
                this.wait();
            }
            permite-=permits;
        }

    }

    @Override
    public void release() {
synchronized (this){
    this.notifyAll();
}
        permite ++;
    }

    @Override
    public void release(int permits) {
        synchronized (this){
            this.notifyAll();
        }
        permite+=permits;
    }

    @Override
    public int getAvailablePermits() {
        return permite;
    }
}
