package tutorial.objectCloning;

public class ObjectCloning {
    public static void demo(){
        ObjectCloning obj = new ObjectCloning();
        obj.cloningDemo();
    }

    public void cloningDemo(){
        try{
            A obj = new A();
            obj.i = 5;
            obj.j = 6;

            A obj1 = obj; // shallow copy - heap memory one object stack two copies
//            System.out.println(obj1);

            // deep copy
            A obj2 = new A();
            obj2.j = obj.j;
            obj2.i = obj2.i;
            // manually copy value by value

            // cloning
            A obj3 = (A) obj.clone();
            System.out.println(obj3.i);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    class  A{
        int i;
        int j;


        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
}
