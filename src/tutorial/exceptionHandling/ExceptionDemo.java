package tutorial.exceptionHandling;

public class ExceptionDemo {

    public static void demo(){
        try {
            int i = 2;
            int j = 0;
            System.out.println(i/j);
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic exception : " + ae.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
