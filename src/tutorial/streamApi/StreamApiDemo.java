package tutorial.streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamApiDemo {

    public static void demo()
    {
        try
        {
            methodReference();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void listDemo() throws Exception
    {

        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        lst.forEach(i -> System.out.print(i + " "));
    }

    public static void methodReference()
    {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        lst.forEach(StreamApiDemo::doubleIt);
    }

    public static void doubleIt(int i)
    {
       System.out.println(i*2);
    }


}
