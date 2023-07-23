class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("User thread value: " + i);
        }
    }
}

class ThreadExample1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
