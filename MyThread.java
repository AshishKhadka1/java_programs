import java.lang.*;
class MyThread  extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("User thread value: " + i);
        }
    }
}

class MyThreads {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t =new Thread(mt);
        mt.start();
    }
}
