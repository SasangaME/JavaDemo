package tutorial.streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamApiDemo {

    public static void demo()
    {
        try
        {
          mapDemo();
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

    public static void streamApiDemo()
    {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        lst.stream().forEach(i -> System.out.println(i*3456));
    }

    public static void mapDemo()
    {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        System.out.println(lst.stream().map(i -> i*2).reduce(0, (c,e) -> c+e));
    }

    public static void sumDemo()
    {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        System.out.println(lst.stream().map(i -> i*2).reduce(0, (c, e) -> Integer.sum(c,e)));
    }
}
