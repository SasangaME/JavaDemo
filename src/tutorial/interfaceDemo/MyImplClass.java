package tutorial.interfaceDemo;

public class MyImplClass {

    public static void Implementation()
    {
        iMyinterface obj = new MyInfImpl();
        obj.showConfig();
        obj.test();

        // inner class
        iMyinterface obj2 = new MyInfImpl(){
            public void showThis()
            {
                System.out.println("Inner class method");
            }
        };

        iMyinterface obj3  = () -> {
            System.out.println("Lambda expression");
        };

        obj3.showConfig();
    }
}
