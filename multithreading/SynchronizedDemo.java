package multithreading;

public class SynchronizedDemo {
    static int num;

    public static void increment() {
        synchronized (SynchronizedDemo.class) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj1 = new SynchronizedDemo();
        SynchronizedDemo obj2 = new SynchronizedDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj1.increment();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj2.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("nums=> " + num);
    }
}
