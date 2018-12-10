package tutorial.collections;

import java.util.*;

public class CollectionDemo
{
    public static void demo()
    {
//        arrayListDemo();
//        Container<Integer> obj = new Container<>();
//        obj.show();
          listDemo();

    }

    public static void arrayListDemo()
    {
        Collection al = new ArrayList();
        ((ArrayList) al).add("first");
        ((ArrayList) al).add(1);
        ((ArrayList) al).add(2.6);
        ((ArrayList) al).add('c');
        ((ArrayList) al).add(false);

       Iterator i = al.iterator(); // old way
       while(i.hasNext())
       {
           System.out.println(i.next());
       }

       al.remove(false);

       for(Object item : al) // new way
       {
           System.out.println(item);
       }

    }

    public static void listDemo()
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(45);
        lst.add(77);
        lst.add(99);
        lst.add(2);

        Collections.sort(lst);

        lst.forEach(System.out::println);
    }




}

class Container<T>
{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show()
    {
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? super  T> obj)
    {

    }
}
