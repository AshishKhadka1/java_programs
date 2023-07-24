public class TableWithSync {
    synchronized void printTable(int n){
        for (int i=1 ; i <=5 ; i++){
            System.out.println(n * i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }
}
class MyThread3 extends Thread{
    TableWithoutSync t;
    MyThread3(TableWithoutSync t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread4 extends Thread{
    TableWithoutSync t;
    MyThread4(TableWithoutSync t){
        this.t=t;

    }
    public void run(){
        t.printTable(100);
    }
}
class ThreadEgs{
    public static void main(String args[]){
        TableWithoutSync obj = new TableWithoutSync();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
