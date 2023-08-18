//public class DeadLockArise {
//    public static void main(String[] args){
//        final String resources1 = "Ashish Khadka";
//        final String resources2 = "Namuna";
//        Thread t1 = new Thread(){
//            public void run(){
//                synchronized (resources1){
//                    System.out.println("Thread 1 : locked resources 1");
//                    try{
//                        Thread.sleep(100);
//                    }catch (Exception e){}
//                    synchronized (resources2){
//                        System.out.println("Thread 1 : locked resources 2");
//                    }
//                            Thread t2 = new Thread(){
//                        public void run(){
//                            synchronized (resources2){
//                                System.out.println("Thread 2 : locked resources ");
//                                try{
//                                    Thread.sleep(100);
//                                }catch (Exception e){}
//                                synchronized (resources1){
//                                    System.out.println("Thread 2 :locked resources 1");
//                                }
//                            }
//                        }
//                    };
//
//                    t1.start();
//                    t2.start();
//                }
//            }
//        };
//    }
//}
