package multithreading;

public class InterruptDemo {


    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <=50 ; i++) {
                    System.out.println("i am Thread 1");
                }
                System.out.println("ISInterrupted: "+Thread.currentThread().isInterrupted());
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <=50 ; i++) {
                    System.out.println("I am thread 2");
                }
            }
        });
        t1.start();
        t2.start();
        t1.interrupt();
    }
}
