package tutorial.exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
//    try with resources
    // try will close all the opening resources
    public static void tryWithDemo (){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
        }
        catch (Exception e)
        {

        }

    }
}
