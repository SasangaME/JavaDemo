package tutorial.multiThreading;

public class Hello implements Runnable {
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
