public class ThreadPriorityExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new WorkerThread(), "Thread 1");
        Thread thread2 = new Thread(new WorkerThread(), "Thread 2");

        // Set different priorities for threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1 (lowest)
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10 (highest)

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class WorkerThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}
