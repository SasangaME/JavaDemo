package tutorial.annotations;

import java.util.ArrayList;

public class AnnotationDemo {
    public static void demo()
    {
        B obj = new B();
        obj.show();

        A objA = new A();
//        objA.show(); // deprecated
    }
}

class A
{
    @Deprecated
    public void show()
    {
        System.out.println("From A");
    }
}

class B extends  A{
    @Override
    @SuppressWarnings("uncheked")
    public void show()
    {
        ArrayList obj = new ArrayList();
        super.show();
        System.out.println("From B");
    }
}
