package tutorial.innerClass;

public class InnerClassDemo {

    public static void demo()
    {
        A objA = new A();
        A.B obj = objA.new B(); //intantiating innter class

        C c = new C();
        C.D d = new C.D(); // instantiating from static inner class

        // anonymous class
        E e = new E(){
            public void show()
            {
                System.out.println("Hi");
            }
        };
        e.show();

        //lambda
        F f = () ->{
          System.out.println("Fuck this shit");
        };
        f.show();
    }
}

class A
{
    class B // member class
    {
        public void show()
        {
            System.out.println("Hellow");
        }
    }
}

class C
{
    static class D
    {
        public void show()
        {
            System.out.println("Static hello");
        }
    }
}


class E
{
    public void show()
    {
        System.out.println("Hellow");
    }
}

@FunctionalInterface
interface F
{
    void show();
}