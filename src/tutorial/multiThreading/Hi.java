package tutorial.multiThreading;

public class Hi implements Runnable {
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
