package tutorial.multiThreading;

public class SyncDemo
{
    public static void demo()
    {
        try {

            Counter c = new Counter();

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i <= 1000; i++) {
                        c.increment();
                    }
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i <= 1000; i++) {
                        c.increment();
                    }
                }
            });

            t1.start();
            t2.start();

            t1.join(); // asking main thread to wait until t1 finishes
            t2.join();

            System.out.println("Count : " + c.count);
        }
        catch (Exception e)
        {

        }
    }
}

class Counter
{
    int count;

    public  synchronized void increment()
    {
        count++;
    }
}
