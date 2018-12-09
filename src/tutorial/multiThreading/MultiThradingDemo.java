package tutorial.multiThreading;

public class MultiThradingDemo {

    public static void demo(){
        try {
            Hi objHi = new Hi();
            Hello objHello = new Hello();

            Thread t1 = new Thread(objHi);
            Thread t2 = new Thread(objHello);

            t1.start();
            Thread.sleep(10);
            t2.start();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
