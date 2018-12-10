package tutorial.multiThreading;

public class MultiThradingDemo {

    public static void demo(){
        try {
//            Hi objHi = new Hi();
//            Hello objHello = new Hello();

            Runnable objHi = () -> {
                for(int i = 1; i <= 5; i++)
                {
                    System.out.println("Hi");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            };

            Runnable objHello = () ->{
              for(int i = 1; i<= 5; i++)
              {
                  System.out.println("Hello");
                  try{Thread.sleep(1000);}catch (Exception e){}
              }
            };

            Thread t1 = new Thread(objHi);
            Thread t2 = new Thread(objHello);

            t1.start();
            Thread.sleep(10);
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Bye");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
