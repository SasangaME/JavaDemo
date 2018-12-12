package tutorial.collections;

import java.util.*;

public class CollectionDemo
{
    public static void demo()
    {
//        arrayListDemo();
//        Container<Integer> obj = new Container<>();
//        obj.show();
//          listDemo();
//            vectorDemo();
//        comparatorDemo();
//        comparetorDemo();
        setDemo();

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

    public static void vectorDemo()
    {
        Vector v = new Vector();
        v.add(4);
        v.add(6);

        System.out.println(v.capacity());
    }

    public static void comparatorDemo()
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(245);
        lst.add(246);
        lst.add(444);
        lst.add(111);
        lst.add(99);
        lst.add(999);

        Comparator<Integer> com = (o1, o2) -> {
          return (o1 > o2) ? 1 : -1;
        };

        Collections.sort(lst, com);

        for(int i: lst)
            System.out.println(i);
    }

    public static void comparetorDemo()
    {
        Test t1 = new Test();
        t1.id = 1;
        t1.val = 200;

        Test t2 = new Test();
        t2.id = 2;
        t2.val = 100;

        Test t3 = new Test();
        t3.id = 3;
        t3.val = 300;

        List<Test> lst = new ArrayList<>();
        lst.add(t1);
        lst.add(t2);
        lst.add(t3);

        Comparator<Test> com = (l1, l2) -> {
            return (l1.val > l2.val) ? 1 : -2;
        };

        Collections.sort(lst, com);

        for(Test t : lst)
            System.out.println(t.id + " - " + t.val);
    }

    public static void setDemo()
    {
        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(6);
        set.add(7);
        set.add(6);
        set.add(8);
        set.add(5);

        for(int i : set)
            System.out.println(i);
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

class ComImpl implements  Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2)
            return 1;
        return -1;
    }
}

class Test
{
    int id;
    int val;
}
