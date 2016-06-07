package threads3_1;


public interface Semaphore {
    public void acquire() throws InterruptedException;  // Запрашивает разрешение. Если есть свободное захватывает его

    public void acquire(int permits) throws InterruptedException; // Запрашивает переданое количество разрешений.

    public void release();   // Отпускает разрешение возвращая его семафору.

    public void release(int permits);    // Отпускает переданое количество разрешений возварщая их семафору.

    public int getAvailablePermits(); // Возвращает количество свободных разрешений на данный момент.
}
